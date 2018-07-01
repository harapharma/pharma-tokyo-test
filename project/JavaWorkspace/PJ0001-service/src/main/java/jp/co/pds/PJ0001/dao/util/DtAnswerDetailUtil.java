package jp.co.pds.PJ0001.dao.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0001.dao.PJ0001DbSession;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetail;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetailExample;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetailKey;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroupExample;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dao.mapper.DtAnswerDetailMapper;
import jp.co.pds.PJ0001.dao.mapper.DtAnswerMapper;
import jp.co.pds.PJ0001.dao.mapper.MsGroupQuestionGroupMapper;
import jp.co.pds.PJ0001.dao.mapper.MsQuestionGroupMapper;
import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.dto.MsGroupUser;
import jp.co.pds.common.dao.dto.MsGroupUserExample;
import jp.co.pds.common.dao.dto.MsUser;
import jp.co.pds.common.dao.mapper.MsGroupMapper;
import jp.co.pds.common.dao.mapper.MsGroupUserMapper;

public class DtAnswerDetailUtil {

	DtAnswerDetail dtAnswerDetail;

	DtAnswer dtAnswer;

	public DtAnswerDetailUtil(Integer answerId, Integer questionId) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
    	DtAnswerDetailMapper answerDetailMapper = session.getMapper(DtAnswerDetailMapper.class);
    	DtAnswerDetailKey answerDetailKey = new DtAnswerDetailKey();
    	answerDetailKey.setAnswerId(answerId);
    	answerDetailKey.setQuestionId(questionId);
    	this.dtAnswerDetail = answerDetailMapper.selectByPrimaryKey(answerDetailKey);
    	pj0001DbSession.close();
	}

	public DtAnswerDetailUtil(DtAnswerDetail dtAnswerDetail) {
		this.dtAnswerDetail = dtAnswerDetail;
	}

	public DtAnswerDetailUtil() {
	}

	/**
	 * 関連している回答データを取得する
	 * @return
	 */
	public DtAnswer getDtAnswer() {
		if (dtAnswerDetail == null) {
			return null;
		}
		if (dtAnswer != null) {
			return dtAnswer;
		}

		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	DtAnswerMapper answerMapper = session.getMapper(DtAnswerMapper.class);
    	dtAnswer = answerMapper.selectByPrimaryKey(dtAnswerDetail.getAnswerId());

    	pj0001DbSession.close();

    	return dtAnswer;
	}

	/**
	 * 回答明細データを登録する
	 * @return
	 */
	public void storeDtAnswerDetail(DtAnswerDetail dtAnswerDetail) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
    	try {
    		DtAnswerDetailMapper answerDetailMapper = session.getMapper(DtAnswerDetailMapper.class);
    		answerDetailMapper.insert(dtAnswerDetail);
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		session.commit();
    		session.close();
    		pj0001DbSession.close();
    	}
	}

	/**
	 * 回答明細データListを登録する
	 * @return
	 */
	public void storeDtAnswerDetails(List<DtAnswerDetail> dtAnswerDetails) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
    	try {
    		DtAnswerDetailMapper answerDetailMapper = session.getMapper(DtAnswerDetailMapper.class);
    		for (DtAnswerDetail dtAnswerDetail : dtAnswerDetails) {
    			answerDetailMapper.insert(dtAnswerDetail);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		session.commit();
    		session.close();
    		pj0001DbSession.close();
    	}
	}
}
