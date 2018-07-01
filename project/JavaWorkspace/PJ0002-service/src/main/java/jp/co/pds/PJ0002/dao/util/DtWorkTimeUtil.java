package jp.co.pds.PJ0002.dao.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0002.dao.PJ0002DbSession;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.dto.DtWorkTimeExample;
import jp.co.pds.PJ0002.dao.dto.DtWorkTimeKey;
import jp.co.pds.PJ0002.dao.mapper.DtWorkTimeMapper;
import jp.co.pds.common.dao.CommonDbSession;

public class DtWorkTimeUtil {

	DtWorkTime dtWorkTime;

	public DtWorkTimeUtil(String userId, Integer calendarYy,  Integer calendarMm, Integer calendarDd) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	DtWorkTimeMapper dtWorkTimeMapper = session.getMapper(DtWorkTimeMapper.class);
    	DtWorkTimeKey dtWorkTimeKey = new DtWorkTimeKey();
    	dtWorkTimeKey.setUserId(userId);
    	dtWorkTimeKey.setCalendarYy(calendarYy);
    	dtWorkTimeKey.setCalendarMm(calendarMm);
    	dtWorkTimeKey.setCalendarDd(calendarDd);
    	this.dtWorkTime = dtWorkTimeMapper.selectByPrimaryKey(dtWorkTimeKey);
    	session.close();
	}

	public DtWorkTimeUtil(DtWorkTime dtWorkTime) {
		this.dtWorkTime = dtWorkTime;
	}

	public DtWorkTimeUtil() {
	}

	/**
	 * ユーザID、年、月を指定して勤務時間データListを取得する
	 * @return
	 */
	public List<DtWorkTime> getDtWorkTimesByUserIdYyMm(String UserId, Integer calendarYy,  Integer calendarMm) {
		List<DtWorkTime> dtWorkTimes = null;
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtWorkTimeMapper dtWorkTimeMapper = session.getMapper(DtWorkTimeMapper.class);
			DtWorkTimeExample dtWorkTimeExample = new DtWorkTimeExample();
			dtWorkTimeExample.createCriteria()
					.andUserIdEqualTo(UserId)
					.andCalendarYyEqualTo(calendarYy)
					.andCalendarMmEqualTo(calendarMm);
			dtWorkTimes = dtWorkTimeMapper.selectByExample(dtWorkTimeExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}

    	// ソート
    	Collections.sort(dtWorkTimes,
    					new Comparator<DtWorkTime>() {
    						public int compare(DtWorkTime obj1, DtWorkTime obj2) {
    							return obj1.getCalendarDd() - obj2.getCalendarDd();
    						}
        				}
    	);

    	return dtWorkTimes;
	}

	/**
	 * キーが一致する勤務時間データを削除する
	 * @return
	 */
	public void deleteDtWorkTime(DtWorkTime dtWorkTime) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtWorkTimeMapper dtWorkTimeMapper = session.getMapper(DtWorkTimeMapper.class);
	    	DtWorkTimeKey dtWorkTimeKey = new DtWorkTimeKey();
	    	dtWorkTimeKey.setUserId(dtWorkTime.getUpdateId());
	    	dtWorkTimeKey.setCalendarYy(dtWorkTime.getCalendarYy());
	    	dtWorkTimeKey.setCalendarMm(dtWorkTime.getCalendarMm());
	    	dtWorkTimeKey.setCalendarDd(dtWorkTime.getCalendarDd());
			dtWorkTimeMapper.deleteByPrimaryKey(dtWorkTimeKey);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}
	
	/**
	 * 勤務時間データを登録する
	 * @return
	 */
	public void storeDtWorkTime(DtWorkTime dtWorkTime) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtWorkTimeMapper dtWorkTimeMapper = session.getMapper(DtWorkTimeMapper.class);
			dtWorkTimeMapper.insert(dtWorkTime);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}
	
	/**
	 * 勤務時間データをマージする
	 * @return
	 */
	public void margeDtWorkTime(DtWorkTime dtWorkTime) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtWorkTimeMapper dtWorkTimeMapper = session.getMapper(DtWorkTimeMapper.class);
			DtWorkTimeKey dtWorkTimeKey = new DtWorkTimeKey();
			dtWorkTimeKey.setUserId(dtWorkTime.getUserId());
			dtWorkTimeKey.setCalendarYy(dtWorkTime.getCalendarYy());
			dtWorkTimeKey.setCalendarMm(dtWorkTime.getCalendarMm());
			dtWorkTimeKey.setCalendarDd(dtWorkTime.getCalendarDd());
			DtWorkTime existWorkTime = dtWorkTimeMapper.selectByPrimaryKey(dtWorkTimeKey);
			if (existWorkTime == null) {
				dtWorkTimeMapper.insert(dtWorkTime);
			} else {
				existWorkTime.setWorkStartTime(dtWorkTime.getWorkStartTime());
				existWorkTime.setCalcStartTime(dtWorkTime.getCalcStartTime());
				existWorkTime.setWorkEndTime(dtWorkTime.getWorkEndTime());
				existWorkTime.setCalcEndTime(dtWorkTime.getCalcEndTime());
				existWorkTime.setRemark(dtWorkTime.getRemark());
				existWorkTime.setCorrectValue(dtWorkTime.getCorrectValue());
				existWorkTime.setWorkTime(dtWorkTime.getWorkTime());
				dtWorkTimeMapper.updateByPrimaryKey(existWorkTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}
}
