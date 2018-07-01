package jp.co.pds.PJ0001.service.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jp.co.pds.PJ0001.Project;
import jp.co.pds.PJ0001.copy.QuestionCopy;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsQuestion;
import jp.co.pds.PJ0001.dao.util.MsGroupUtil;
import jp.co.pds.PJ0001.dao.util.MsQuestionGroupUtil;
import jp.co.pds.PJ0001.dto.GroupDTO;
import jp.co.pds.PJ0001.dto.QuestionDTO;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.util.MsUserUtil;
import jp.co.pds.common.util.MessageUtil;

/**
 * Hello world!
 *
 */
public class InitialService
{
	public InitialService() {
	}

	public List<QuestionDTO> getQuestionDTOs(String groupId, String questionGroupId) {
		List<QuestionDTO> questionDTOs = new ArrayList<QuestionDTO>();

		MsQuestionGroupUtil msQuestionGroupUtil = new MsQuestionGroupUtil(Integer.valueOf(questionGroupId));
		List<MsQuestion> msQuestions =  msQuestionGroupUtil.getMsQuestions();

		for (MsQuestion msQuestion : msQuestions) {
			QuestionDTO questionDTO = new QuestionDTO();
			QuestionCopy.copy(msQuestion, questionDTO);

			questionDTO.setGroupId(groupId);
			questionDTO.setQuestionGroupId(questionGroupId);
			
			questionDTOs.add(questionDTO);
		}
		return questionDTOs;
	}

	public String getHeaderMessage(HttpServletRequest request, String questionCnt) {
		List<String> params = new ArrayList<String>();
		params.add(questionCnt);
		return MessageUtil.getMessage(Project.getProjectCode(), "I0000002", request.getLocale(), (String[])params.toArray(new String[params.size()]));
	}
}
