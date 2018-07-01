package jp.co.pds.PJ0002.dao.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0002.dao.PJ0002DbSession;
import jp.co.pds.PJ0002.dao.dto.DtExpenseAdjstmnt;
import jp.co.pds.PJ0002.dao.dto.DtExpenseAdjstmntExample;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpenseExample;
import jp.co.pds.PJ0002.dao.mapper.DtExpenseAdjstmntMapper;
import jp.co.pds.PJ0002.dao.mapper.DtTransportExpenseMapper;

public class DtExpAdjstUtil {

	DtExpenseAdjstmnt dtExpAdjst;

	public DtExpAdjstUtil() {
	}

	/**
	 * 会社コード、ユーザＩＤ、年月を指定して経費精算データリストを取得する
	 * @return
	 */
	public List<DtExpenseAdjstmnt> getDtExpenseAdjstmnts(String companyCd, String userId, Integer calendarYy, Integer calendarMm) {
		List<DtExpenseAdjstmnt> dtExpenseAdjstmnts = null;
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();

		try {
	    	// 経費精算データ
			DtExpenseAdjstmntMapper dtExpenseAdjstmntMapper = session.getMapper(DtExpenseAdjstmntMapper.class);
	    	DtExpenseAdjstmntExample dtExpenseAdjstmntExample = new DtExpenseAdjstmntExample();
	    	dtExpenseAdjstmntExample.createCriteria()
	    		.andCompanyCdEqualTo(companyCd)
	    		.andUserIdEqualTo(userId)
	    		.andCalendarYyEqualTo(calendarYy)
	    		.andCalendarMmEqualTo(calendarMm);
	    	dtExpenseAdjstmnts = dtExpenseAdjstmntMapper.selectByExample(dtExpenseAdjstmntExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}

    	// ソート
    	Collections.sort(dtExpenseAdjstmnts,
    					new Comparator<DtExpenseAdjstmnt>() {
    						public int compare(DtExpenseAdjstmnt obj1, DtExpenseAdjstmnt obj2) {
    							return obj1.getCalendarDd() - obj2.getCalendarDd();
    						}
        				}
    	);

    	return dtExpenseAdjstmnts;
	}

	/**
	 * 会社コード、ユーザＩＤ、年月を指定して経費精算データリストを削除する
	 * @return
	 */
	public void deleteDtExpenseAdjstmnts(String companyCd, String userId, Integer calendarYy, Integer calendarMm) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
	    	// 交通経費データ
			DtExpenseAdjstmntMapper dtExpenseAdjstmntMapper = session.getMapper(DtExpenseAdjstmntMapper.class);
	    	DtExpenseAdjstmntExample dtExpenseAdjstmntExample = new DtExpenseAdjstmntExample();
	    	dtExpenseAdjstmntExample.createCriteria()
	    		.andCompanyCdEqualTo(companyCd)
	    		.andUserIdEqualTo(userId)
	    		.andCalendarYyEqualTo(calendarYy)
	    		.andCalendarMmEqualTo(calendarMm);
	    	dtExpenseAdjstmntMapper.deleteByExample(dtExpenseAdjstmntExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}

	/**
	 * 交通経費データを登録する
	 * @return
	 */
	public void storeDtExpenseAdjstmnt(DtExpenseAdjstmnt dtExpenseAdjstmnt) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtExpenseAdjstmntMapper dtExpenseAdjstmntMapper = session.getMapper(DtExpenseAdjstmntMapper.class);
			dtExpenseAdjstmntMapper.insert(dtExpenseAdjstmnt);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}
}
