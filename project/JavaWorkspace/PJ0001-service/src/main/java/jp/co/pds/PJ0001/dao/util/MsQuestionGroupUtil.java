package jp.co.pds.PJ0001.dao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0001.dao.PJ0001DbSession;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroupExample;
import jp.co.pds.PJ0001.dao.dto.MsQuestion;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroupQuestion;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroupQuestionExample;
import jp.co.pds.PJ0001.dao.mapper.MsGroupQuestionGroupMapper;
import jp.co.pds.PJ0001.dao.mapper.MsQuestionGroupMapper;
import jp.co.pds.PJ0001.dao.mapper.MsQuestionGroupQuestionMapper;
import jp.co.pds.PJ0001.dao.mapper.MsQuestionMapper;
import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.dto.MsGroupUser;
import jp.co.pds.common.dao.dto.MsGroupUserExample;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.mapper.MsGroupMapper;
import jp.co.pds.common.dao.mapper.MsGroupUserMapper;

public class MsQuestionGroupUtil {

	MsQuestionGroup msQuestionGroup;

	List<MsQuestionGroupQuestion> msQuestionGroupQuestions = new ArrayList<MsQuestionGroupQuestion>();

	public MsQuestionGroupUtil(Integer questionGroupId) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
    	MsQuestionGroupMapper questionGroupMapper = session.getMapper(MsQuestionGroupMapper.class);
    	this.msQuestionGroup = questionGroupMapper.selectByPrimaryKey(questionGroupId);
    	session.close();
	}

	public MsQuestionGroupUtil(MsQuestionGroup msQuestionGroup) {
		this.msQuestionGroup = msQuestionGroup;
	}

	/**
	 * 設問グループマスタを取得する
	 * @return
	 */
	public MsQuestionGroup getMsQuestionGroup() {
		return msQuestionGroup;
	}
	/**
	 * 関連している設問グループ－設問マスタを取得する
	 * @return
	 */
	public List<MsQuestionGroupQuestion> getMsQuestionGroupQuestions() {
		if (msQuestionGroupQuestions != null && ! msQuestionGroupQuestions.isEmpty()) {
			return msQuestionGroupQuestions;
		}

		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	MsQuestionGroupQuestionMapper questionGroupQuestionMapper = session.getMapper(MsQuestionGroupQuestionMapper.class);
    	MsQuestionGroupQuestionExample questionGroupQuestionExample = new MsQuestionGroupQuestionExample();
    	questionGroupQuestionExample.createCriteria().andQuestionGroupIdEqualTo(msQuestionGroup.getQuestionGroupId());
    	msQuestionGroupQuestions = questionGroupQuestionMapper.selectByExample(questionGroupQuestionExample);

    	pj0001DbSession.close();

    	return msQuestionGroupQuestions;
	}

	/**
	 * 設問IDが一致する設問グループ－設問マスタを取得する
	 * @return
	 */
	public MsQuestionGroupQuestion getMsQuestionGroupQuestion(Integer questionId) {
		msQuestionGroupQuestions = getMsQuestionGroupQuestions();

		for(MsQuestionGroupQuestion msQuestionGroupQuestion : msQuestionGroupQuestions) {
			if(msQuestionGroupQuestion.getQuestionId() == questionId) {
				return msQuestionGroupQuestion;
			}
		}

    	return null;
	}

	/**
	 * 関連している設問マスタを取得する
	 * @return
	 */
	public List<MsQuestion> getMsQuestions() {
		List<MsQuestion> msQuestions = new ArrayList<MsQuestion>();

    	// MS_QUESTION_GROUP_QUESTION
		msQuestionGroupQuestions = getMsQuestionGroupQuestions();
    	if (msQuestionGroupQuestions == null || msQuestionGroupQuestions.isEmpty()) {
    		return msQuestions;
    	}

    	PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	// MS_QUESTION
    	MsQuestionMapper questionMapper = session.getMapper(MsQuestionMapper.class);
    	for (MsQuestionGroupQuestion msQuestionGroupQuestion : msQuestionGroupQuestions) {
    		MsQuestion msQuestion = questionMapper.selectByPrimaryKey(msQuestionGroupQuestion.getQuestionId());
    		if (msQuestion != null) {
    			msQuestions.add(msQuestion);
    		}
    	}

    	pj0001DbSession.close();

    	// 重複行削除
    	msQuestions = new ArrayList<MsQuestion>(new HashSet<MsQuestion>(msQuestions));
    	// ソート
    	Collections.sort(msQuestions,
    					new Comparator<MsQuestion>() {
    						public int compare(MsQuestion obj1, MsQuestion obj2) {
    							return obj1.getQuestionId() - obj2.getQuestionId();
    						}
        				}
    	);

    	return msQuestions;
	}
}
