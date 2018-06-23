package jp.co.pds.common.dao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.DtPswdHistory;
import jp.co.pds.common.dao.dto.DtPswdHistoryExample;
import jp.co.pds.common.dao.dto.DtPswdHistoryKey;
import jp.co.pds.common.dao.dto.MsDate;
import jp.co.pds.common.dao.dto.MsDateExample;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.dto.MsGroupUser;
import jp.co.pds.common.dao.dto.MsGroupUserExample;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.mapper.DtPswdHistoryMapper;
import jp.co.pds.common.dao.mapper.MsDateMapper;
import jp.co.pds.common.dao.mapper.MsGroupMapper;
import jp.co.pds.common.dao.mapper.MsGroupUserMapper;
import jp.co.pds.common.dao.mapper.MsUserMapper;

public class MsUserUtil {

	MsUser msUser;

	public MsUserUtil(String userId) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsUserMapper userMapper = session.getMapper(MsUserMapper.class);
    	this.msUser = userMapper.selectByPrimaryKey(userId.toUpperCase());
    	session.close();
	}

	public MsUserUtil(MsUser msUser) {
		this.msUser = msUser;
	}

	/**
	 * ユーザマスタを取得する
	 * @return
	 */
	public MsUser getMsUser() {
		return msUser;
	}

	/**
	 * 関連しているグループマスタを取得する
	 * @return
	 */
	public List<MsGroup> getMsGroups() {
		List<MsGroup> msGroups = new ArrayList<MsGroup>();

		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();

    	// MS_GROUP_USER
    	MsGroupUserMapper groupUserMapper = session.getMapper(MsGroupUserMapper.class);
    	MsGroupUserExample groupUserExample = new MsGroupUserExample();
    	groupUserExample.createCriteria().andUserIdEqualTo(msUser.getUserId());
    	List<MsGroupUser> msGroupUsers = groupUserMapper.selectByExample(groupUserExample);
    	if (msGroupUsers == null || msGroupUsers.isEmpty()) {
    		session.close();
    		return msGroups;
    	}

    	// MS_GROUP
    	MsGroupMapper groupMapper = session.getMapper(MsGroupMapper.class);
    	for (MsGroupUser msGroupUser : msGroupUsers) {
    		MsGroup msGroup = groupMapper.selectByPrimaryKey(msGroupUser.getGroupId());
    		if (msGroup != null) {
    			msGroups.add(msGroup);
    		}
    	}

    	commonDbSession.close();

    	// 重複行削除
    	msGroups = new ArrayList<MsGroup>(new HashSet<MsGroup>(msGroups));

    	// ソート
    	Collections.sort(msGroups,
    					new Comparator<MsGroup>() {
    						public int compare(MsGroup obj1, MsGroup obj2) {
    							return obj1.getGroupId() - obj2.getGroupId();
    						}
        				}
    	);

    	return msGroups;
	}

	/**
	 * 関連しているパスワード履歴データを取得する
	 * @return
	 */
	public DtPswdHistory getDtPswdHistory() {
		DtPswdHistory dtPswdHistory = null;
		if (this.msUser == null) {
			return dtPswdHistory;
		}

		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();

    	// DT_PSWD_HISTORY
		try {
			DtPswdHistoryMapper dtPswdHistoryMapper = session.getMapper(DtPswdHistoryMapper.class);
			DtPswdHistoryKey dtPswdHistoryKey = new DtPswdHistoryKey();
			dtPswdHistoryKey.setUserId(this.msUser.getUserId());
			dtPswdHistoryKey.setSeq(this.msUser.getPswdSeq());
			dtPswdHistory = dtPswdHistoryMapper.selectByPrimaryKey(dtPswdHistoryKey);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}

		return dtPswdHistory;
	}

	/**
	 * ユーザマスタを更新する
	 * @return
	 */
	public void updateMsUser(MsUser msUser) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
		try {
			MsUserMapper msUserMapper = session.getMapper(MsUserMapper.class);
			msUserMapper.updateByPrimaryKey(msUser);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}
	}
}
