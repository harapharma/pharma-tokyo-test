package jp.co.pds.common.dao.util;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.DtLoginHistory;
import jp.co.pds.common.dao.dto.DtPswdHistory;
import jp.co.pds.common.dao.dto.DtPswdHistoryKey;
import jp.co.pds.common.dao.mapper.DtLoginHistoryMapper;
import jp.co.pds.common.dao.mapper.DtPswdHistoryMapper;

public class DtPswdHistoryUtil {

	private DtPswdHistory dtPswdHistory;

	public DtPswdHistoryUtil(String userId, Integer seq) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	DtPswdHistoryMapper dtPswdHistoryMapper = session.getMapper(DtPswdHistoryMapper.class);
    	DtPswdHistoryKey dtPswdHistoryKey = new DtPswdHistoryKey();
    	dtPswdHistoryKey.setUserId(userId);
    	dtPswdHistoryKey.setSeq(seq);
    	this.dtPswdHistory = dtPswdHistoryMapper.selectByPrimaryKey(dtPswdHistoryKey);
    	session.close();
	}

	public DtPswdHistoryUtil(DtPswdHistory dtPswdHistory) {
		this.dtPswdHistory = dtPswdHistory;
	}

	public DtPswdHistoryUtil() {
	}

	public DtPswdHistory getDtPswdHistory() {
		return dtPswdHistory;
	}

	/**
	 * パスワード履歴データを登録する
	 * @return
	 */
	public void storeDtPswdHistory(DtPswdHistory dtPswdHistory) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
		try {
			DtPswdHistoryMapper dtPswdHistoryMapper = session.getMapper(DtPswdHistoryMapper.class);
			dtPswdHistoryMapper.insert(dtPswdHistory);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}
	}
}
