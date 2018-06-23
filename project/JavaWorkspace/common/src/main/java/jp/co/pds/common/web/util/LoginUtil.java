package jp.co.pds.common.web.util;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;


import jp.co.pds.common.web.context.CommonContext;
import jp.co.pds.common.Project;
import jp.co.pds.common.dao.dto.DtLoginHistory;
import jp.co.pds.common.dao.dto.DtPswdHistory;
import jp.co.pds.common.dao.dto.MsCompany;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.util.DtLoginHistoryUtil;
import jp.co.pds.common.dao.util.DtPswdHistoryUtil;
import jp.co.pds.common.dao.util.MsGroupUtil;
import jp.co.pds.common.dao.util.MsSeqUtil;
import jp.co.pds.common.dao.util.MsUserUtil;
import jp.co.pds.common.enums.SeqNameEnum;
import jp.co.pds.common.util.DateTimeUtil;
import jp.co.pds.common.util.EncryptUtil;
import jp.co.pds.common.util.MessageUtil;

/**
 * ログイン
 * @author Rei Kitahara
 *
 */
public class LoginUtil
{
	public static int LOGIN_OK = 0;
	public static int LOGIN_NG = 1;
	public static int LOGIN_PSWD_EXPIRED = 2;
	public static int CHANGE_PSWD_OK = 3;
	public static int CHANGE_PSWD_NG_SAME = 4;
	public static int CHANGE_PSWD_NG_COMPLEX = 5;
	public static int CHANGE_PSWD_NG_HISTORY = 6;

    public int login( String uid, String pswd, String projectCode, HttpServletRequest request)
    {
    	//ユーザIDとパスワードからログイン確認を実施する
    	MsUserUtil msUserUtil = new MsUserUtil(uid);
    	MsUser msUser = msUserUtil.getMsUser();
    	if (msUser == null) {
    		return LOGIN_NG;
    	}

    	// DT_PSWD_HISTORY
    	DtPswdHistory dtPswdHistory = msUserUtil.getDtPswdHistory();
    	if (dtPswdHistory == null) {
    		return LOGIN_NG;
    	}

    	String encryptedPswd = EncryptUtil.encrypt(pswd);
    	if (encryptedPswd == null || encryptedPswd.isEmpty() ||
    		! encryptedPswd.equals(dtPswdHistory.getPswd())) {
    		return LOGIN_NG;
    	}

    	// ログイン記録
    	writeLoginHistory(request, msUser, projectCode);
    	
    	createSession(request, msUser);

    	// パスワード期限チェック
    	if (isPswdExpired(msUser)) {
    		return LOGIN_PSWD_EXPIRED;
    	}

    	return LOGIN_OK;
    }
    
    public int changePswd( String uid, String pswd1, String pswd2, String projectCode, HttpServletRequest request)
    {
    	// 同じではない
    	if (!pswd1.equals(pswd2)) {
    		return CHANGE_PSWD_NG_SAME;
    	}
    	// 複雑性
    	// TODO
    	// 履歴
    	// TODO

    	String encryptedPswd1 = EncryptUtil.encrypt(pswd1);
    	MsUserUtil msUserUtil = new MsUserUtil(uid);

    	// パスワード履歴に新規追加
    	DtPswdHistory dtPswdHistory = msUserUtil.getDtPswdHistory();
    	dtPswdHistory.setSeq(dtPswdHistory.getSeq() + 1);
    	dtPswdHistory.setPswd(encryptedPswd1);
    	dtPswdHistory.setRegisterId(projectCode);
    	dtPswdHistory.setUpdateId(projectCode);
    	DtPswdHistoryUtil dtPswdHistoryUtil = new DtPswdHistoryUtil();
    	dtPswdHistoryUtil.storeDtPswdHistory(dtPswdHistory);

    	// ユーザマスタの更新
    	MsUser msUser = msUserUtil.getMsUser();
    	msUser.setPswdSeq(dtPswdHistory.getSeq());
    	msUser.setPswdUpdateDd(DateTimeUtil.getNow().getTime());
    	msUser.setUpdateId(projectCode);
    	msUserUtil.updateMsUser(msUser);
    	
    	return CHANGE_PSWD_OK;
    }

    private void createSession(HttpServletRequest request, MsUser msUser) {
    	CommonContext context = new CommonContext();
    	context.setUserId(msUser.getUserId());
    	context.setUserName(msUser.getUserLastname() + msUser.getUserName());
    	context.setLoginDateTime(DateTimeUtil.getFromattedDateTime(DateTimeUtil.getNow(), DateTimeUtil.BASIC_DATETIME_FORMAT));
    	context.setMessage(MessageUtil.getMessage(Project.getProjectCode(), "I0000001", request.getLocale()));
    	
    	request.getSession(true).setAttribute(CommonContext.CONTEXT_NAME, context);
    }

    private void writeLoginHistory(HttpServletRequest request, MsUser msUser, String projectCode) {

		// ログインID取得
		MsSeqUtil msSeqUtil = new MsSeqUtil(SeqNameEnum.SeqLoginId);
		int seqLoginId = msSeqUtil.getNextValue();

		DtLoginHistory dtLoginHistory = new DtLoginHistory();
		dtLoginHistory.setLoginId(seqLoginId);
    	dtLoginHistory.setUserId(msUser.getUserId());
    	dtLoginHistory.setClientInfo(request.getLocalAddr());
    	dtLoginHistory.setRegisterId(projectCode);
    	dtLoginHistory.setUpdateId(projectCode);

    	DtLoginHistoryUtil dtLoginHistoryUtil = new DtLoginHistoryUtil();
    	dtLoginHistoryUtil.storeDtLoginHistory(dtLoginHistory);
    }
    
    private boolean isPswdExpired(MsUser msUser) {
    	// 会社を検索
    	MsUserUtil msUserUtil = new MsUserUtil(msUser.getUserId());
    	MsGroupUtil msGroupUtil = new MsGroupUtil(msUserUtil.getMsGroups().get(0));
    	MsCompany msCompany = msGroupUtil.getMsCompany();
    	Date expireDate = DateTimeUtil.addDate(msUser.getPswdUpdateDd(), Calendar.DATE, msCompany.getPswdValidTerm()) ;
    	if (expireDate.before(DateTimeUtil.getNow().getTime())) {
    		return true;
    	}
    	return false;
    }
}
