package jp.co.pds.PJ0001.service.top;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.pds.PJ0001.Project;
import jp.co.pds.PJ0001.copy.GroupCopy;
import jp.co.pds.PJ0001.copy.QuestionGroupCopy;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dao.util.MsGroupUtil;
import jp.co.pds.PJ0001.dto.AnswerDTO;
import jp.co.pds.PJ0001.dto.GroupDTO;
import jp.co.pds.PJ0001.dto.QuestionGroupDTO;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.util.MsUserUtil;
import jp.co.pds.common.util.MessageUtil;

/**
 * 初期処理
 *
 */
public class InitialService
{
	public InitialService() {
	}

	public List<GroupDTO> getGroupDTOs(String uid) {
		List<GroupDTO> groupDTOs = new ArrayList<GroupDTO>();

		MsUserUtil msUserUtil = new MsUserUtil(uid);
		List<MsGroup> msGroups =  msUserUtil.getMsGroups();
		
		for(MsGroup msGroup : msGroups) {
			GroupDTO groupDTO = new GroupDTO();
			GroupCopy.copy(msGroup, groupDTO);
			MsGroupUtil msGroupUtil = new MsGroupUtil(msGroup);
			List<MsQuestionGroup> msQuestionGroups = msGroupUtil.getMsQuestionGroups();
			List<QuestionGroupDTO> questionGroupDTOs = new ArrayList<QuestionGroupDTO>();
			for(MsQuestionGroup msQuestionGroup : msQuestionGroups) {
				QuestionGroupDTO questionGroupDTO = new QuestionGroupDTO();
				QuestionGroupCopy.copy(msQuestionGroup, questionGroupDTO);
				// 追加
				questionGroupDTOs.add(questionGroupDTO);
			}
			// ソート
	    	Collections.sort(questionGroupDTOs,
					new Comparator<QuestionGroupDTO>() {
						public int compare(QuestionGroupDTO obj1, QuestionGroupDTO obj2) {
							return obj1.getQuestionGroupId().compareTo(obj2.getQuestionGroupId());
						}
    				}
	    	);
			groupDTO.setQuestionGroupDTOs(questionGroupDTOs);
			//　追加
			groupDTOs.add(groupDTO);
		}

		return groupDTOs;
	}

	public String getHeaderMessage(HttpServletRequest request) {
		return MessageUtil.getMessage(Project.getProjectCode(), "I0000001", request.getLocale());
	}
}
