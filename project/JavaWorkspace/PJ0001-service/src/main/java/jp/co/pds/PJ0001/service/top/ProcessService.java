package jp.co.pds.PJ0001.service.top;

import java.util.HashMap;
import java.util.Map;

import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.util.MsGroupUtil;

/**
 * Hello world!
 *
 */
public class ProcessService
{
	public ProcessService() {
	}

	public Integer getQuestionCnt(String groupId, String questionGroupId) {
		MsGroupUtil msGroupUtil = new MsGroupUtil(Integer.valueOf(groupId));
		MsGroupQuestionGroup msGroupQuestionGroup = msGroupUtil.getMsGroupQuestionGroup(Integer.valueOf(questionGroupId));
		if (msGroupQuestionGroup == null) {
			return 0;
		}
		return msGroupQuestionGroup.getQuestionCnt();
	}
}
