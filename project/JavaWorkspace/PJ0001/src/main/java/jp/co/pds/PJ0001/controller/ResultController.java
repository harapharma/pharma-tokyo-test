package jp.co.pds.PJ0001.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.copy.AnswerCopy;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dto.AnswerDTO;
import jp.co.pds.PJ0001.form.ResultForm;
import jp.co.pds.PJ0001.service.result.InitialService;
import jp.co.pds.PJ0001.web.context.PJ0001Context;
import jp.co.pds.common.util.StringUtil;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@Controller
public class ResultController {

	final static Logger logger = Logger.getLogger(ResultController.class);

	@RequestMapping(value = {"/result"}, method = {RequestMethod.GET})
    public ModelAndView initResult(@ModelAttribute ResultForm form,
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

		// 設問コンテキストの取得
		PJ0001Context pj0001Context = (PJ0001Context)request.getSession(true).getAttribute(PJ0001Context.CONTEXT_NAME);
		if (pj0001Context == null) {
			// Top画面へ
			mv.setViewName("redirect:/top");
			return mv;
		}

		// テンプレートを指定
		mv.setViewName("/result.html");
		
		// 結果画面の値を設定
		InitialService service = new InitialService();
		DtAnswer dtAnser = service.getDtAnswer(pj0001Context.getAnswerId());
		AnswerDTO answerDTO = new AnswerDTO();
		AnswerCopy.copy(dtAnser, answerDTO);
		answerDTO = service.putQuestionGroupName(answerDTO);
		answerDTO = service.putMessage(answerDTO, request);

		// formに設定
		form.setAnswerId(answerDTO.getAnswerId());
		form.setUserId(answerDTO.getUserId());
		form.setGroupId(answerDTO.getGroupId());
		form.setQuestionGroupId(answerDTO.getQuestionGroupId());
		form.setQuestionGroupName(answerDTO.getQuestionGroupName());
		form.setAnswerDatime(answerDTO.getAnswerDatime());
		form.setQuestionCnt(answerDTO.getQuestionCnt());
		form.setNeedCorrectCnt(answerDTO.getNeedCorrectCnt());
		form.setCorrectCnt(answerDTO.getCorrectCnt());
		form.setMessage(answerDTO.getMessage());
		
		// modelに設定して画面に表示するようにする
		mv.addObject("resultForm", form);

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/result"}, params = "top", method = {RequestMethod.POST})
	public ModelAndView postResultTop(
			@ModelAttribute ResultForm form) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/top");

		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/result"}, params = "history", method = {RequestMethod.POST})
	public ModelAndView postResultHistory(
			@ModelAttribute ResultForm form) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/history");

		// 返却
		return mv;
	}
}
