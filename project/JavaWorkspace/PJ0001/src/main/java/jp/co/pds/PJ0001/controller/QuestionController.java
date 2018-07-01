package jp.co.pds.PJ0001.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.dto.QuestionDTO;
import jp.co.pds.PJ0001.form.QuestionForm;
import jp.co.pds.PJ0001.service.question.InitialService;
import jp.co.pds.PJ0001.service.question.ProcessService;
import jp.co.pds.PJ0001.web.context.PJ0001Context;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@Controller
public class QuestionController {

	final static Logger logger = Logger.getLogger(QuestionController.class);

	@RequestMapping(value = {"/question"}, method = {RequestMethod.GET})
    public ModelAndView initQuestion(@ModelAttribute QuestionForm form,
    		HttpServletRequest request) {
		// 生成
		ModelAndView mv = new ModelAndView();

		// Sessionコンテキストの設定
		CommonContext commonContext = (CommonContext)request.getSession(true).getAttribute(CommonContext.CONTEXT_NAME);
		if (commonContext != null) {
			mv.addObject("commonContext", request.getSession(true).getAttribute(CommonContext.CONTEXT_NAME));
		} else {
			// ログイン画面へ
			mv.setViewName("redirect:/");
			return mv;
		}

		// 設問コンテキストを取得
		PJ0001Context pj0001Context = (PJ0001Context)request.getSession(true).getAttribute(PJ0001Context.CONTEXT_NAME);
		if (pj0001Context == null) {
			// トップ画面へ
			mv.setViewName("redirect:/top");
			return mv;
		}

		// テンプレートを指定
		mv.setViewName("/question.html");
		
		InitialService service = new InitialService();
		
		// modelに設定して画面に表示するようにする
		String questionCnt = pj0001Context.getQuestionCnt();
		ArrayList<String> ans = null;

		// 設問の値を設定
		List<QuestionDTO> questionDTOs = null;
		// 設問コンテキストが存在したらその値を設定
		
		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request, questionCnt));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		if (pj0001Context.getQuestionDTOs() != null && pj0001Context.getQuestionDTOs().size() > 0) {
			questionDTOs = pj0001Context.getQuestionDTOs();
			ans = new ArrayList<String>();
			for (QuestionDTO questionDTO : pj0001Context.getQuestionDTOs()) {
				ans.add(questionDTO.getSelection());
			}
			form.setAns(ans);
		} else {
			questionDTOs = service.getQuestionDTOs(pj0001Context.getGroupId(), pj0001Context.getQuestionGroupId());
			pj0001Context.setQuestionDTOs(questionDTOs);
			request.getSession(true).setAttribute(PJ0001Context.CONTEXT_NAME, pj0001Context);
			ans = new ArrayList<String>(Integer.valueOf(questionCnt));
			form.setAns(ans);
		}

		mv.addObject("questionForm", form);
		mv.addObject("questionList", questionDTOs);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/question"}, method = {RequestMethod.POST})
	public ModelAndView postConfirm(
			@ModelAttribute QuestionForm form,
    		HttpServletRequest request) {

		// 設問コンテキストへの保存
		PJ0001Context pj0001Context = (PJ0001Context)request.getSession(true).getAttribute(PJ0001Context.CONTEXT_NAME);
		ProcessService service = new ProcessService();
		service.applyAnswer(pj0001Context.getQuestionDTOs(), form.getAns());
		request.getSession(true).setAttribute(PJ0001Context.CONTEXT_NAME, pj0001Context);
		
		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/confirm");

		// 返却
		return mv;
	}
}
