package jp.co.pds.PJ0001.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.form.ConfirmForm;
import jp.co.pds.PJ0001.form.QuestionForm;
import jp.co.pds.PJ0001.service.confirm.InitialService;
import jp.co.pds.PJ0001.service.confirm.ProcessService;
import jp.co.pds.PJ0001.web.context.PJ0001Context;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@Controller
public class ConfirmController {

	final static Logger logger = Logger.getLogger(ConfirmController.class);

	@RequestMapping(value = {"/confirm"}, method = {RequestMethod.GET})
    public ModelAndView initConfirm(@ModelAttribute ConfirmForm form,
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
		mv.setViewName("/confirm.html");
		
		// modelに設定して画面に表示するようにする
		mv.addObject("confirmForm", form);

		// selectボックスの値を設定
		mv.addObject("questionList", pj0001Context.getQuestionDTOs());

		InitialService service = new InitialService();

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/confirm"}, params = "return", method = {RequestMethod.POST})
	public ModelAndView postConfirmReturn(
			@ModelAttribute QuestionForm form) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/question");

		// 返却
		return mv;
	}
	
	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/confirm"}, params = "result", method = {RequestMethod.POST})
	public ModelAndView postConfirmResult(
			@ModelAttribute QuestionForm form,
			HttpServletRequest request) {
		// 生成
		ModelAndView mv = new ModelAndView();

		CommonContext commonContext = (CommonContext)request.getSession(true).getAttribute(CommonContext.CONTEXT_NAME);
		if (commonContext == null) {
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

		// 回答データ、回答明細データの登録
		ProcessService service = new ProcessService();
		int seqAnswerId = service.storeAnswer(commonContext.getUserId(),
							Integer.valueOf(pj0001Context.getGroupId()),
							Integer.valueOf(pj0001Context.getQuestionGroupId()),
							Integer.valueOf(pj0001Context.getQuestionCnt()),
							pj0001Context.getQuestionDTOs());

		// 後戻りできないようにQuwstionDTO Listを削除
		pj0001Context.setQuestionDTOs(null);

		// 設問コンテキストの設定
		pj0001Context.setAnswerId(String.valueOf(seqAnswerId));
		request.getSession(true).setAttribute(PJ0001Context.CONTEXT_NAME, pj0001Context);

		// テンプレートを指定
		mv.setViewName("redirect:/result");

		// 返却
		return mv;
	}
}
