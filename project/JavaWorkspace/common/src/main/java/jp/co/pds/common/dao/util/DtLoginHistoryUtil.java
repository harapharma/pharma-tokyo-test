package jp.co.pds.common.dao.util;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.DtLoginHistory;
import jp.co.pds.common.dao.mapper.DtLoginHistoryMapper;

public class DtLoginHistoryUtil {

	private DtLoginHistory dtLoginHistory;

	public DtLoginHistoryUtil(Integer loginId) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	DtLoginHistoryMapper dtLoginHistoryMapper = session.getMapper(DtLoginHistoryMapper.class);
    	this.dtLoginHistory = dtLoginHistoryMapper.selectByPrimaryKey(loginId);
    	session.close();
	}

	public DtLoginHistoryUtil(DtLoginHistory dtLoginHistory) {
		this.dtLoginHistory = dtLoginHistory;
	}

	public DtLoginHistoryUtil() {
	}

	/**
	 * ログイン記録データを登録する
	 * @return
	 */
	public void storeDtLoginHistory(DtLoginHistory dtLoginHistory) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
		try {
			DtLoginHistoryMapper dtLoginHistoryMapper = session.getMapper(DtLoginHistoryMapper.class);
			dtLoginHistoryMapper.insert(dtLoginHistory);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}
	}
}
