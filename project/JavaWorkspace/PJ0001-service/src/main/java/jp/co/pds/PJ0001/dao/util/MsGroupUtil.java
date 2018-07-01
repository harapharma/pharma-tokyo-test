package jp.co.pds.PJ0001.dao.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0001.dao.PJ0001DbSession;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroupExample;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dao.mapper.MsGroupQuestionGroupMapper;
import jp.co.pds.PJ0001.dao.mapper.MsQuestionGroupMapper;
import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.dto.MsGroupUser;
import jp.co.pds.common.dao.dto.MsGroupUserExample;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.mapper.MsGroupMapper;
import jp.co.pds.common.dao.mapper.MsGroupUserMapper;

public class MsGroupUtil {

	MsGroup msGroup;

	List<MsGroupQuestionGroup> msGroupQuestionGroups = new ArrayList<MsGroupQuestionGroup>();

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
	 * 関連しているグループ－設問グループマスタを取得する
	 * @return
	 */
	public List<MsGroupQuestionGroup> getMsGroupQuestionGroups() {
		if (msGroupQuestionGroups != null && ! msGroupQuestionGroups.isEmpty()) {
			return msGroupQuestionGroups;
		}

		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	MsGroupQuestionGroupMapper groupQuestionGroupMapper = session.getMapper(MsGroupQuestionGroupMapper.class);
    	MsGroupQuestionGroupExample groupQuestionGroupExample = new MsGroupQuestionGroupExample();
    	groupQuestionGroupExample.createCriteria().andGroupIdEqualTo(msGroup.getGroupId());
    	msGroupQuestionGroups = groupQuestionGroupMapper.selectByExample(groupQuestionGroupExample);

    	pj0001DbSession.close();

    	return msGroupQuestionGroups;
	}

	/**
	 * 設問グループIDが一致するグループ－設問グループマスタを取得する
	 * @return
	 */
	public MsGroupQuestionGroup getMsGroupQuestionGroup(Integer questionGroupId) {
		msGroupQuestionGroups = getMsGroupQuestionGroups();

		for(MsGroupQuestionGroup msGroupQuestionGroup : msGroupQuestionGroups) {
			if(msGroupQuestionGroup.getQuestionGroupId() == questionGroupId) {
				return msGroupQuestionGroup;
			}
		}

    	return null;
	}

	/**
	 * 関連している設問グループマスタを取得する
	 * @return
	 */
	public List<MsQuestionGroup> getMsQuestionGroups() {
		List<MsQuestionGroup> msQuestionGroups = new ArrayList<MsQuestionGroup>();

    	// MS_GROUP_QUESTION_GROUP
    	msGroupQuestionGroups = getMsGroupQuestionGroups();
    	if (msGroupQuestionGroups == null || msGroupQuestionGroups.isEmpty()) {
    		return msQuestionGroups;
    	}

    	PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	// MS_QUESTION_GROUP
    	MsQuestionGroupMapper questionGroupMapper = session.getMapper(MsQuestionGroupMapper.class);
    	for (MsGroupQuestionGroup msGroupQuestionGroup : msGroupQuestionGroups) {
    		MsQuestionGroup msQuestionGroup = questionGroupMapper.selectByPrimaryKey(msGroupQuestionGroup.getQuestionGroupId());
    		if (msQuestionGroup != null) {
    			msQuestionGroups.add(msQuestionGroup);
    		}
    	}

    	pj0001DbSession.close();

    	// 重複行削除
    	msQuestionGroups = new ArrayList<MsQuestionGroup>(new HashSet<MsQuestionGroup>(msQuestionGroups));

    	return msQuestionGroups;
	}
}
