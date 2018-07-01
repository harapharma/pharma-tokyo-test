package jp.co.pds.PJ0002.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0002.form.TopForm;
import jp.co.pds.PJ0002.form.TransExpForm;
import jp.co.pds.PJ0002.service.transexp.InitialService;
import jp.co.pds.PJ0002.service.transexp.ProcessService;
import jp.co.pds.PJ0002.web.context.PJ0002Context;
import jp.co.pds.common.web.context.CommonContext;

/**
 * @author Rei Kitahara
 *
 */
@Controller
@RequestMapping()
public class TransExpController {

	final static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping(value = {"/transexp"}, method = {RequestMethod.GET})
    public ModelAndView initTransExp(@ModelAttribute TransExpForm form,
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

		InitialService service = new InitialService();

		// PJ0002コンテキストの設定
		PJ0002Context pj0002Context = (PJ0002Context)request.getSession(true).getAttribute(PJ0002Context.CONTEXT_NAME);
		if (pj0002Context == null) {
			// 勤務時間画面へ
			mv.setViewName("redirect:/top");
			return mv;
		} else if (pj0002Context.getTransExpDTOs() == null || pj0002Context.getTransExpDTOs().isEmpty()) {
			// 交通費精算DTOリスト
			pj0002Context.setTransExpDTOs(service.getTransExpDTOs(pj0002Context.getCompanyCd(),
					pj0002Context.getUserId(),
					pj0002Context.getSelectYY(),
					pj0002Context.getSelectMM()));

			// PJ0002コンテキストの保存
			request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);
		}
		
		// テンプレートを指定
		mv.setViewName("/transexp.html");
		
		// modelに設定して画面に表示するようにする
		form.setSelectedGroupId(pj0002Context.getSelectGroup());
		form.setSelectedYy(pj0002Context.getSelectYY());
		form.setSelectedMm(pj0002Context.getSelectMM());
		form.setTransExpDTOs(pj0002Context.getTransExpDTOs());
		mv.addObject("transExpForm", form);
		
		// 画面表示用の値を設定
		mv.addObject("userName", pj0002Context.getUserName());
		mv.addObject("groups", pj0002Context.getGroupDTOs());
		mv.addObject("years", pj0002Context.getYears());
		mv.addObject("transExpDTOs", pj0002Context.getTransExpDTOs());

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request, pj0002Context.getUserName()));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/transexp"}, params = "change", method = {RequestMethod.POST})
	public ModelAndView postTransExpChange(
			@ModelAttribute TopForm form,
    		HttpServletRequest request) {

		// PJ0002コンテキストの設定
		PJ0002Context pj0002Context = (PJ0002Context)request.getSession(true).getAttribute(PJ0002Context.CONTEXT_NAME);

		if (! pj0002Context.getSelectGroup().equals(form.getSelectedGroupId()) ||
			! pj0002Context.getSelectYY().equals(form.getSelectedYy()) ||
			! pj0002Context.getSelectMM().equals(form.getSelectedMm())) {

			// 選択値
			pj0002Context.setSelectGroup(form.getSelectedGroupId());
			pj0002Context.setSelectYY(form.getSelectedYy());
			pj0002Context.setSelectMM(form.getSelectedMm());

			// 勤務時間DTOリスト
			InitialService service = new InitialService();
			pj0002Context.setTransExpDTOs(service.getTransExpDTOs(pj0002Context.getCompanyCd(),
					pj0002Context.getUserId(),
					pj0002Context.getSelectYY(),
					pj0002Context.getSelectMM()));

			// PJ0002コンテキストの保存
			request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);
		}
		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/transexp");

		// 返却
		return mv;
	}
	
	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/transexp"}, params = "save", method = {RequestMethod.POST})
	public ModelAndView postTransExpSave(
			@ModelAttribute TransExpForm form,
    		HttpServletRequest request) {

		// MV生成
		ModelAndView mv = new ModelAndView();

		// Sessionコンテキストの取得
		CommonContext commonContext = (CommonContext)request.getSession(true).getAttribute(CommonContext.CONTEXT_NAME);
		if (commonContext == null) {
			// ログイン画面へ
			mv.setViewName("redirect:/");
			return mv;
		}
		
		// PJ0002コンテキストの設定
		PJ0002Context pj0002Context = (PJ0002Context)request.getSession(true).getAttribute(PJ0002Context.CONTEXT_NAME);

		ProcessService service = new ProcessService();
		service.margeTransExpDTOs(commonContext.getCompanyCd(), commonContext.getUserId(), form.getSelectedYy(), form.getSelectedMm(), form.getTransExpDTOs(), pj0002Context.getTransExpDTOs());

		// PJ0002コンテキストの保存
		request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);

		// 勤務時間DTOを保存する
		service.storeTransExpDTOs(commonContext.getCompanyCd(), commonContext.getUserId(), form.getSelectedYy(), form.getSelectedMm(), pj0002Context.getTransExpDTOs());

		// テンプレートを指定
		mv.setViewName("redirect:/transexp");

		// 返却
		return mv;
	}
	
	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/transexp"}, params = "worktime", method = {RequestMethod.POST})
	public ModelAndView postTopTrans(
			@ModelAttribute TransExpForm form,
    		HttpServletRequest request) {

		// MV生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/top");

		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/transexp"}, params = "expns", method = {RequestMethod.POST})
	public ModelAndView postTopExpns(
			@ModelAttribute TransExpForm form,
    		HttpServletRequest request) {

		// MV生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/expns");

		// 返却
		return mv;
	}
}
