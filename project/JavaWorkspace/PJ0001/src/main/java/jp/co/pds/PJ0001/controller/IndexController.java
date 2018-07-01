package jp.co.pds.PJ0001.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0001.form.IndexForm;
import jp.co.pds.PJ0001.controller.IndexController;
import jp.co.pds.PJ0001.Project;
import jp.co.pds.common.util.MessageUtil;
import jp.co.pds.common.web.context.CommonContext;
import jp.co.pds.common.web.util.LoginUtil;

/**
 * @author Rei Kitahara
 *
 */
@Controller
public class IndexController {

	final static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping(value = {"/"}, method = {RequestMethod.GET})
    public ModelAndView initIndex(@ModelAttribute IndexForm form,
    		HttpServletRequest request) {
		// 生成
		ModelAndView mv = new ModelAndView();
		
		// テンプレートを指定
		mv.setViewName("/index.html");
		
		// modelに設定して画面に表示するようにする
		mv.addObject("indexForm", form);
		
		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/index"}, params = "login", method = {RequestMethod.POST})
	public ModelAndView postLogin(
			@ModelAttribute IndexForm form,
    		HttpServletRequest request) {

		// 生成
		ModelAndView mv = new ModelAndView();
		
		// ログインの判定処理
		LoginUtil loginUtil = new LoginUtil();
		int check = loginUtil.login(form.getUid(), form.getPswd(), Project.getProjectCode(), request);
		if (check == LoginUtil.LOGIN_NG) {
			// テンプレートを指定
			mv.setViewName("/index.html");
			
			// commonContext
			CommonContext commonContext = new CommonContext();
			commonContext.setMessage(
					MessageUtil.getMessage("COMMON", "E0000002", request.getLocale()));
			mv.addObject("commonContext", commonContext);

			// modelに設定して画面に表示するようにする
			mv.addObject("indexForm", form);
		} else if (check == LoginUtil.LOGIN_PSWD_EXPIRED) {
			// テンプレートを指定
			mv.setViewName("/index.html");
			
			// commonContext
			CommonContext commonContext = new CommonContext();
			commonContext.setMessage(
					MessageUtil.getMessage("COMMON", "W0000001", request.getLocale()));
			mv.addObject("commonContext", commonContext);

			// パスワード期限切れ
			mv.addObject("expired", "true");

			// modelに設定して画面に表示するようにする
			mv.addObject("indexForm", form);
		} else {
			// テンプレートを指定
			mv.setViewName("redirect:/top");
		}
		
		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/index"}, params = "changepswd", method = {RequestMethod.POST})
	public ModelAndView postChangePswd(
			@ModelAttribute IndexForm form,
    		HttpServletRequest request) {

		// 生成
		ModelAndView mv = new ModelAndView();
		
		// パスワード変更の判定処理
		LoginUtil loginUtil = new LoginUtil();
		int check = loginUtil.changePswd(form.getUid(), form.getPswd1(), form.getPswd2(), Project.getProjectCode(), request);
		if (check == LoginUtil.CHANGE_PSWD_OK) {
			// テンプレートを指定
			mv.setViewName("redirect:/top");
		} else {
			// テンプレートを指定
			mv.setViewName("/index.html");
			
			// メッセージ
			String msg = null;
			if (check == LoginUtil.CHANGE_PSWD_NG_SAME) {
				msg = MessageUtil.getMessage("COMMON", "E0000003", request.getLocale());
			} else if (check == LoginUtil.CHANGE_PSWD_NG_COMPLEX) {
				msg = MessageUtil.getMessage("COMMON", "E0000004", request.getLocale());
			} else if (check == LoginUtil.CHANGE_PSWD_NG_HISTORY) {
				msg = MessageUtil.getMessage("COMMON", "E0000005", request.getLocale());
			}

			// commonContext
			CommonContext commonContext = new CommonContext();
			commonContext.setMessage(msg);
			mv.addObject("commonContext", commonContext);

			// パスワード期限切れ
			mv.addObject("expired", "true");

			// modelに設定して画面に表示するようにする
			mv.addObject("indexForm", form);
		}
		
		// 返却
		return mv;
	}
}
