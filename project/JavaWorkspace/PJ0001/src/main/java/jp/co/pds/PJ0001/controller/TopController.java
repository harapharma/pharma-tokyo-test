package jp.co.pds.PJ0001.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.form.QuestionForm;
import jp.co.pds.PJ0001.form.TopForm;
import jp.co.pds.PJ0001.service.top.InitialService;
import jp.co.pds.PJ0001.service.top.ProcessService;
import jp.co.pds.PJ0001.web.context.PJ0001Context;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@Controller
@RequestMapping()
public class TopController {

	final static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping(value = {"/top"}, method = {RequestMethod.GET})
    public ModelAndView initTop(@ModelAttribute TopForm form,
    		HttpServletRequest request) {
		// 生成
		ModelAndView mv = new ModelAndView();

		// Sessionコンテキストの設定
		CommonContext commonContext = (CommonContext)request.getSession(true).getAttribute(CommonContext.CONTEXT_NAME);
		if (commonContext != null) {
			mv.addObject("commonContext", commonContext);
		} else {
			// ログイン画面へ
			mv.setViewName("redirect:/");
			return mv;
		}

		// テンプレートを指定
		mv.setViewName("/top.html");
		
		// modelに設定して画面に表示するようにする
		mv.addObject("topForm", form);
		
		// selectボックスの値を設定
		InitialService service = new InitialService();
		mv.addObject("groupDTOs", service.getGroupDTOs(commonContext.getUserId()));

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "question", method = {RequestMethod.POST})
	public ModelAndView postTopQuestion(
			@ModelAttribute TopForm form,
    		HttpServletRequest request) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// 設問コンテキスト生成
		PJ0001Context pj0001Context = new PJ0001Context();
		pj0001Context.setGroupId(form.getGroupId());
		pj0001Context.setQuestionGroupId(form.getQuestionGroupId());
		ProcessService service = new ProcessService();
		Integer questionCnt = service.getQuestionCnt(form.getGroupId(), form.getQuestionGroupId());
		pj0001Context.setQuestionCnt(String.valueOf(questionCnt));
		request.getSession(true).setAttribute(PJ0001Context.CONTEXT_NAME, pj0001Context);

		// テンプレートを指定
		mv.setViewName("redirect:/question");

		// 返却
		return mv;
	}
	
	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "history", method = {RequestMethod.POST})
	public ModelAndView postTopHistory(
			@ModelAttribute TopForm form,
    		HttpServletRequest request) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/history");

		// 返却
		return mv;
	}
}
