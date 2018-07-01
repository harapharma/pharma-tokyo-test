package jp.co.pds.PJ0002.dao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0002.dao.PJ0002DbSession;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTime;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTimeExample;
import jp.co.pds.PJ0002.dao.dto.MsRestTime;
import jp.co.pds.PJ0002.dao.mapper.MsGroupRestTimeMapper;
import jp.co.pds.PJ0002.dao.mapper.MsRestTimeMapper;
import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.mapper.MsGroupMapper;

public class MsGroupUtil {

	MsGroup msGroup;

	List<MsRestTime> msRestTimes = new ArrayList<MsRestTime>();

	public MsGroupUtil(Integer groupId) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsGroupMapper groupMapper = session.getMapper(MsGroupMapper.class);
    	this.msGroup = groupMapper.selectByPrimaryKey(groupId);
    	session.close();
	}

	public MsGroupUtil(MsGroup msGroup) {
		this.msGroup = msGroup;
	}

	/**
	 * グループマスタを取得する
	 * @return
	 */
	public MsGroup getMsGroup() {
		return msGroup;
	}

	/**
	 * 関連している休憩時間マスタを取得する
	 * @return
	 */
	public List<MsRestTime> getMsRestTimes() {
		if (msRestTimes != null && ! msRestTimes.isEmpty()) {
			return msRestTimes;
		}

		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();

    	// グループ－休憩時間マスタ
    	MsGroupRestTimeMapper msGroupRestTimeMapper = session.getMapper(MsGroupRestTimeMapper.class);
    	MsGroupRestTimeExample msGroupRestTimeExample = new MsGroupRestTimeExample();
    	msGroupRestTimeExample.createCriteria().andGroupIdEqualTo(msGroup.getGroupId());
    	List<MsGroupRestTime> msGroupRestTimes = msGroupRestTimeMapper.selectByExample(msGroupRestTimeExample);

    	// 休憩時間マスタ
    	MsRestTimeMapper msRestTimeMapper = session.getMapper(MsRestTimeMapper.class);
    	for (MsGroupRestTime msGroupRestTime : msGroupRestTimes) {
    		MsRestTime msRestTime = msRestTimeMapper.selectByPrimaryKey(msGroupRestTime.getRestTimeId());
    		msRestTimes.add(msRestTime);
    	}
    	
    	pj0002DbSession.close();

    	// ソート
    	Collections.sort(msRestTimes,
    					new Comparator<MsRestTime>() {
    						public int compare(MsRestTime obj1, MsRestTime obj2) {
    							return obj1.getStartTime().compareTo(obj2.getStartTime());
    						}
        				}
    	);

    	return msRestTimes;
	}
}
