package jp.co.pds.PJ0001.service.confirm;

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
import jp.co.pds.common.web.util.WebStringUtil;

/**
 * Hello world!
 *
 */
public class InitialService
{
	public InitialService() {
	}

	public String getHeaderMessage(HttpServletRequest request) {
		return WebStringUtil.replaceBR(MessageUtil.getMessage(Project.getProjectCode(), "I0000003", request.getLocale()));
	}
}
