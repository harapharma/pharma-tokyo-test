package jp.co.pds.PJ0001.dao.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0001.dao.PJ0001DbSession;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetail;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetailExample;
import jp.co.pds.PJ0001.dao.dto.DtAnswerExample;
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

public class DtAnswerUtil {

	DtAnswer dtAnswer;

	List<DtAnswerDetail> dtAnswerDetails = new ArrayList<DtAnswerDetail>();

	public DtAnswerUtil(Integer answerId) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
    	DtAnswerMapper answerMapper = session.getMapper(DtAnswerMapper.class);
    	this.dtAnswer = answerMapper.selectByPrimaryKey(answerId);
    	pj0001DbSession.close();
	}

	public DtAnswerUtil(DtAnswer dtAnswer) {
		this.dtAnswer = dtAnswer;
	}

	public DtAnswerUtil() {
	}

	/**
	 * 解答データを取得する
	 * @return
	 */
	public DtAnswer getDtAnswer() {
		return dtAnswer;
	}

	/**
	 * 関連している回答明細データを取得する
	 * @return
	 */
	public List<DtAnswerDetail> getDtAnswerDetails() {
		if (dtAnswerDetails != null && ! dtAnswerDetails.isEmpty()) {
			return dtAnswerDetails;
		}

		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();

    	DtAnswerDetailMapper answerDetailMapper = session.getMapper(DtAnswerDetailMapper.class);
    	DtAnswerDetailExample answerDetailExample = new DtAnswerDetailExample();
    	answerDetailExample.createCriteria().andAnswerIdEqualTo(dtAnswer.getAnswerId());
    	dtAnswerDetails = answerDetailMapper.selectByExample(answerDetailExample);

    	pj0001DbSession.close();

    	return dtAnswerDetails;
	}

	/**
	 * 設問IDが一致する回答明細データを取得する
	 * @return
	 */
	public DtAnswerDetail getDtAnswerDetail(Integer questionId) {
		dtAnswerDetails = getDtAnswerDetails();

		for(DtAnswerDetail dtAnswerDetail : dtAnswerDetails) {
			if(dtAnswerDetail.getQuestionId() == questionId) {
				return dtAnswerDetail;
			}
		}

    	return null;
	}

	/**
	 * 回答データを登録する
	 * @return
	 */
	public void storeDtAnswer(DtAnswer dtAnswer) {
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
		try {
			DtAnswerMapper answerMapper = session.getMapper(DtAnswerMapper.class);
			answerMapper.insert(dtAnswer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0001DbSession.close();
		}
	}
	
	/**
	 * 解答データListを取得する
	 * @return
	 */
	public List<DtAnswer> getDtAnswersByUserId(String UserId) {
		List<DtAnswer> dtAnswers = null;
		PJ0001DbSession pj0001DbSession = new PJ0001DbSession();
    	SqlSession session = pj0001DbSession.open();
		try {
			DtAnswerMapper answerMapper = session.getMapper(DtAnswerMapper.class);
			DtAnswerExample dtAnswerExample = new DtAnswerExample();
			dtAnswerExample.createCriteria().andUserIdEqualTo(UserId);
			dtAnswers = answerMapper.selectByExample(dtAnswerExample);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			pj0001DbSession.close();
		}
		return dtAnswers;
	}
}
