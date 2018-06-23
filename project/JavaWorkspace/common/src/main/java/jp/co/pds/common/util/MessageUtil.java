package jp.co.pds.common.util;

import java.util.Locale;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsMessage;
import jp.co.pds.common.dao.dto.MsMessageKey;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.mapper.MsMessageMapper;
import jp.co.pds.common.dao.mapper.MsUserMapper;

/**
 * メッセージユーティリティ
 * @author Rei Kitahara
 *
 */
public class MessageUtil {

	private static String EMPTY = "";

	private static Locale DEFAULT_LOCALE = Locale.ENGLISH;

	/**
	 * メッセージ取得
	 * @param projectCd
	 * @param messageCd
	 * @param locale
	 * @return
	 */
	public static String getMessage(String projectCd, String messageCd, Locale locale) {
    	CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();

    	MsMessageMapper messageMapper = session.getMapper(MsMessageMapper.class);
    	MsMessageKey msMessageKey = new MsMessageKey();
    	msMessageKey.setProjectCd(projectCd);
    	msMessageKey.setMessageCd(messageCd);
    	msMessageKey.setLocale(locale.getLanguage());
    	MsMessage msMessage = messageMapper.selectByPrimaryKey(msMessageKey);
    	if (msMessage == null && locale.equals(DEFAULT_LOCALE)) {
    		// デフォルト言語のメッセージが取得できなければ空
    		return EMPTY;
    	} else if (msMessage == null) {
    		// メッセージが取得できなければデフォルト言語で再取得する
    		return getMessage(projectCd, messageCd, DEFAULT_LOCALE);
    	}

    	if (msMessage.getMessage() == null) {
    		return EMPTY;
    	}

    	return msMessage.getMessage();
	}
	
	/**
	 * メッセージ取得(可変引数あり)
	 * @param projectCd
	 * @param messageCd
	 * @param locale
	 * @param args
	 * @return
	 */
	public static String getMessage(String projectCd, String messageCd, Locale locale, String[] args) {
		String message = getMessage(projectCd, messageCd, locale);
		if (EMPTY.equals(message)) {
			return EMPTY;
		}
		int i = 0;
		for (String arg : args) {
			message = message.replaceAll("\\{" + i + "\\}", arg);
			i++;
		}
		return message;
	}
}
