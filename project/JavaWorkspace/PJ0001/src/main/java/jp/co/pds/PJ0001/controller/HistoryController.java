package jp.co.pds.PJ0001.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.form.HistoryForm;
import jp.co.pds.PJ0001.form.QuestionForm;
import jp.co.pds.PJ0001.service.history.InitialService;
import jp.co.pds.common.util.StringUtil;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@RequestMapping()
@Controller
public class HistoryController {

	final static Logger logger = Logger.getLogger(HistoryController.class);

	@RequestMapping(value = {"/history"}, method = {RequestMethod.GET})
    public ModelAndView initHistory(@ModelAttribute HistoryForm form,
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
		mv.setViewName("/history.html");
		
		// modelに設定して画面に表示するようにする
		mv.addObject("historyForm", form);

		// 解答DTO Listを設定
		InitialService service = new InitialService();
		mv.addObject("answerList", service.getAnswerList(commonContext.getUserId()));

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/history"}, method = {RequestMethod.POST})
	public ModelAndView postHistoryTop(
			@ModelAttribute QuestionForm form) {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/top");

		// 返却
		return mv;
	}
}
