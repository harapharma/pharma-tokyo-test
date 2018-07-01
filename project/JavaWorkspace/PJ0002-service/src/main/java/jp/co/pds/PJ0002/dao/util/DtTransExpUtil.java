package jp.co.pds.PJ0002.dao.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0002.dao.PJ0002DbSession;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpenseExample;
import jp.co.pds.PJ0002.dao.mapper.DtTransportExpenseMapper;

public class DtTransExpUtil {

	DtTransportExpense dtTransExp;

	public DtTransExpUtil() {
	}

	/**
	 * 会社コード、ユーザＩＤ、年月を指定して交通経費データリストを取得する
	 * @return
	 */
	public List<DtTransportExpense> getDtTransportExpenses(String companyCd, String userId, Integer calendarYy, Integer calendarMm) {
		List<DtTransportExpense> dtTransportExpenses = null;
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();

		try {
	    	// 交通経費データ
	    	DtTransportExpenseMapper dtTransportExpenseMapper = session.getMapper(DtTransportExpenseMapper.class);
	    	DtTransportExpenseExample dtTransportExpenseExample = new DtTransportExpenseExample();
	    	dtTransportExpenseExample.createCriteria()
	    		.andCompanyCdEqualTo(companyCd)
	    		.andUserIdEqualTo(userId)
	    		.andCalendarYyEqualTo(calendarYy)
	    		.andCalendarMmEqualTo(calendarMm);
	    	dtTransportExpenses = dtTransportExpenseMapper.selectByExample(dtTransportExpenseExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}

    	// ソート
    	Collections.sort(dtTransportExpenses,
    					new Comparator<DtTransportExpense>() {
    						public int compare(DtTransportExpense obj1, DtTransportExpense obj2) {
    							return obj1.getCalendarDd() - obj2.getCalendarDd();
    						}
        				}
    	);

    	return dtTransportExpenses;
	}

	/**
	 * 会社コード、ユーザＩＤ、年月を指定して交通経費データリストを削除する
	 * @return
	 */
	public void deleteDtTransportExpenses(String companyCd, String userId, Integer calendarYy, Integer calendarMm) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
	    	// 交通経費データ
	    	DtTransportExpenseMapper dtTransportExpenseMapper = session.getMapper(DtTransportExpenseMapper.class);
	    	DtTransportExpenseExample dtTransportExpenseExample = new DtTransportExpenseExample();
	    	dtTransportExpenseExample.createCriteria()
	    		.andCompanyCdEqualTo(companyCd)
	    		.andUserIdEqualTo(userId)
	    		.andCalendarYyEqualTo(calendarYy)
	    		.andCalendarMmEqualTo(calendarMm);
	    	dtTransportExpenseMapper.deleteByExample(dtTransportExpenseExample);
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
	public void storeDtTransportExpense(DtTransportExpense dtTransportExpense) {
		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();
		try {
			DtTransportExpenseMapper dtTransportExpenseMapper = session.getMapper(DtTransportExpenseMapper.class);
			dtTransportExpenseMapper.insert(dtTransportExpense);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0002DbSession.close();
		}
	}
}
