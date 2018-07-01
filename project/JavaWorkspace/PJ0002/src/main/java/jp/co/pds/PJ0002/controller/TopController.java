package jp.co.pds.PJ0002.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.pds.PJ0002.form.TopForm;
import jp.co.pds.PJ0002.service.top.InitialService;
import jp.co.pds.PJ0002.service.top.ProcessService;
import jp.co.pds.PJ0002.web.context.PJ0002Context;
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

		InitialService service = new InitialService();

		// PJ0002コンテキストの設定
		PJ0002Context pj0002Context = (PJ0002Context)request.getSession(true).getAttribute(PJ0002Context.CONTEXT_NAME);
		if (pj0002Context == null) {
			// 初回の表示
			pj0002Context = new PJ0002Context();
			pj0002Context.setUserId(commonContext.getUserId());
			pj0002Context.setUserName(commonContext.getUserName());
			pj0002Context.setYears(service.getDispYears());
			pj0002Context.setSelectYY(pj0002Context.getYears().get(0));
			pj0002Context.setSelectMM(service.getThisMonth());
			pj0002Context.setGroupDTOs(service.getGroupDTOs(commonContext.getUserId()));
			pj0002Context.setSelectGroup(pj0002Context.getGroupDTOs().get(0).getGroupId());
			pj0002Context.setWorkTimeTruncUnit(pj0002Context.getGroupDTOs().get(0).getWorkTimeTruncUnit());
			pj0002Context.setRestTime(service.getRestTime(pj0002Context.getGroupDTOs().get(0).getGroupId()));
			pj0002Context.setCompanyCd(service.getCompanyCd(pj0002Context.getGroupDTOs().get(0).getGroupId()));

			// 勤務時間DTOリスト
			pj0002Context.setWorkTimeDTOs(service.getWorkTimeDTOs(pj0002Context.getUserId(),
					pj0002Context.getSelectYY(),
					pj0002Context.getSelectMM()));

			// PJ0002コンテキストの保存
			request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);
			
			// 会社コード
			commonContext.setCompanyCd(pj0002Context.getCompanyCd());
		}
		
		// テンプレートを指定
		mv.setViewName("/top.html");
		
		// modelに設定して画面に表示するようにする
		form.setSelectedGroupId(pj0002Context.getSelectGroup());
		form.setSelectedYy(pj0002Context.getSelectYY());
		form.setSelectedMm(pj0002Context.getSelectMM());
		form.setWorkTimeTruncUnit(pj0002Context.getWorkTimeTruncUnit());
		form.setRestTime(pj0002Context.getRestTime());
		form.setWorkTimes(pj0002Context.getWorkTimeDTOs());
		mv.addObject("topForm", form);
		
		// 画面表示用の値を設定
		mv.addObject("userName", pj0002Context.getUserName());
		mv.addObject("groups", pj0002Context.getGroupDTOs());
		mv.addObject("years", pj0002Context.getYears());
		mv.addObject("workTimes", pj0002Context.getWorkTimeDTOs());

		// ヘッダメッセージ
		commonContext.setMessage(service.getHeaderMessage(request, pj0002Context.getUserName()));
		request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);

		// 返却
		return mv;
    }

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "change", method = {RequestMethod.POST})
	public ModelAndView postTopChange(
			@ModelAttribute TopForm form,
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
			pj0002Context.setWorkTimeDTOs(service.getWorkTimeDTOs(pj0002Context.getUserId(),
					pj0002Context.getSelectYY(),
					pj0002Context.getSelectMM()));

			// 休憩時間
			pj0002Context.setRestTime(service.getRestTime(form.getSelectedGroupId()));

			// 会社コード
			pj0002Context.setCompanyCd(service.getCompanyCd(form.getSelectedGroupId()));
			commonContext.setCompanyCd(pj0002Context.getCompanyCd());

			// PJ0002コンテキストの保存
			request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);

			// 共通コンテキストの保存
			request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, commonContext);
		}

		// テンプレートを指定
		mv.setViewName("redirect:/top");

		// 返却
		return mv;
	}
	
	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "save", method = {RequestMethod.POST})
	public ModelAndView postTopSave(
			@ModelAttribute TopForm form,
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
		service.margeWorkTimeDTOs(form.getWorkTimes(), pj0002Context.getWorkTimeDTOs());

		// PJ0002コンテキストの保存
		request.getSession(true).setAttribute(PJ0002Context.CONTEXT_NAME, pj0002Context);

		// 勤務時間DTOを保存する
		service.storeWorkTimeDTOs(commonContext.getUserId(), form.getSelectedYy(), form.getSelectedMm(), pj0002Context.getWorkTimeDTOs());

		// テンプレートを指定
		mv.setViewName("redirect:/top");

		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "trans", method = {RequestMethod.POST})
	public ModelAndView postTopTrans(
			@ModelAttribute TopForm form,
    		HttpServletRequest request) {

		// MV生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/transexp");

		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/top"}, params = "expns", method = {RequestMethod.POST})
	public ModelAndView postTopExpns(
			@ModelAttribute TopForm form,
    		HttpServletRequest request) {

		// MV生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("redirect:/expns");

		// 返却
		return mv;
	}
}
