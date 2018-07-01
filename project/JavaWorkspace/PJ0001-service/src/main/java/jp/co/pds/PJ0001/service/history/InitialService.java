package jp.co.pds.PJ0001.service.history;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jp.co.pds.PJ0001.copy.AnswerCopy;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dao.dto.MsQuestion;
import jp.co.pds.PJ0001.dao.util.DtAnswerUtil;
import jp.co.pds.PJ0001.dao.util.MsQuestionGroupUtil;
import jp.co.pds.PJ0001.dto.AnswerDTO;
import jp.co.pds.common.util.StringUtil;

/**
 * Hello world!
 *
 */
public class InitialService
{
	public InitialService() {
	}

	public List<AnswerDTO> getAnswerList(String userId) {
		DtAnswerUtil dtAnswerUtil = new DtAnswerUtil();
		List<DtAnswer> dtAnswers = dtAnswerUtil.getDtAnswersByUserId(userId);

		List<AnswerDTO> answerDTOs = new ArrayList<AnswerDTO>();
		for (DtAnswer dtAnswer : dtAnswers) {
			AnswerDTO answerDTO = new AnswerDTO();
			AnswerCopy.copy(dtAnswer, answerDTO);
			// 設問グループ名
			MsQuestionGroupUtil msQuestionGroupUtil = new MsQuestionGroupUtil(dtAnswer.getQuestionGroupId());
			answerDTO.setQuestionGroupName(msQuestionGroupUtil.getMsQuestionGroup().getQuestionGroupName());

			answerDTOs.add(answerDTO);
		}

		// ソート
    	Collections.sort(answerDTOs,
    					new Comparator<AnswerDTO>() {
    						public int compare(AnswerDTO obj1, AnswerDTO obj2) {
    							return obj1.getAnswerDatime().compareTo(obj2.getAnswerDatime());
    						}
        				}
    	);

		return answerDTOs;
	}

	public String getHeaderMessage(HttpServletRequest request) {
		return StringUtil.EMPTY;
	}
}
