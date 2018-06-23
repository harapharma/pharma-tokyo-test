package jp.co.pds.common.dao.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsDate;
import jp.co.pds.common.dao.dto.MsDateExample;
import jp.co.pds.common.dao.dto.MsDateKey;
import jp.co.pds.common.dao.mapper.MsDateMapper;

public class MsDateUtil {

	MsDate msDate;

	public MsDateUtil(Integer calendarYy, Integer calendarMm, Integer calendarDd) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsDateMapper msDateMapper = session.getMapper(MsDateMapper.class);
    	MsDateKey msDateKey = new MsDateKey();
    	msDateKey.setCalendarYy(calendarYy);
    	msDateKey.setCalendarMm(calendarMm);
    	msDateKey.setCalendarDd(calendarDd);
    	this.msDate = msDateMapper.selectByPrimaryKey(msDateKey);
    	session.close();
	}

	public MsDateUtil(MsDate msDate) {
		this.msDate = msDate;
	}

	public MsDateUtil() {
	}

	/**
	 * 年月指定で日付マスタを取得する
	 * @return
	 */
	public List<MsDate> getMsDates(Integer calendarYy, Integer calendarMm) {
		List<MsDate> msDates = null;

		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();

    	// MS_DATE
		try {
			MsDateMapper msDateMapper = session.getMapper(MsDateMapper.class);
			MsDateExample msDateExample = new MsDateExample();
			msDateExample.createCriteria()
					.andCalendarYyEqualTo(calendarYy)
					.andCalendarMmEqualTo(calendarMm);
			msDates = msDateMapper.selectByExample(msDateExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}

    	// ソート
    	Collections.sort(msDates,
    					new Comparator<MsDate>() {
    						public int compare(MsDate obj1, MsDate obj2) {
    							return obj1.getCalendarDd() - obj2.getCalendarDd();
    						}
        				}
    	);

    	return msDates;
	}
}
