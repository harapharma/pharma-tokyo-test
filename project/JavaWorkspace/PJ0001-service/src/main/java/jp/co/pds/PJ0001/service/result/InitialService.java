package jp.co.pds.PJ0001.service.result;

import javax.servlet.http.HttpServletRequest;

import jp.co.pds.PJ0001.Project;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dao.util.DtAnswerUtil;
import jp.co.pds.PJ0001.dao.util.MsQuestionGroupUtil;
import jp.co.pds.PJ0001.dto.AnswerDTO;
import jp.co.pds.common.util.MessageUtil;
import jp.co.pds.common.util.StringUtil;
import jp.co.pds.common.web.util.WebStringUtil;

public class InitialService
{
	public InitialService() {
	}
	
	public DtAnswer getDtAnswer(String answerId) {
		DtAnswerUtil dtAnswerUtil = new DtAnswerUtil(Integer.valueOf(answerId));
		return dtAnswerUtil.getDtAnswer();
	}

	/**
	 * 解答DTOにグループ名を設定
	 * @param answerDTO
	 * @return answerDTO
	 */
	public AnswerDTO putQuestionGroupName(AnswerDTO answerDTO) {
		MsQuestionGroupUtil msQuestionGroupUtil = new MsQuestionGroupUtil(Integer.valueOf(answerDTO.getQuestionGroupId()));
		answerDTO.setQuestionGroupName(msQuestionGroupUtil.getMsQuestionGroup().getQuestionGroupName());
		return answerDTO;
	}

	/**
	 * 解答DTOに表示メッセージを設定
	 * @param answerDTO
	 * @return　answerDTO
	 */
	public AnswerDTO putMessage(AnswerDTO answerDTO, HttpServletRequest request) {
		// 必要正解数が 0なら判定なし
		if ("0".equals(answerDTO.getNeedCorrectCnt())) {
			answerDTO.setMessage(WebStringUtil.replaceBR(MessageUtil.getMessage(Project.getProjectCode(), "I0000005", request.getLocale())));
		} else {
			if (Integer.valueOf(answerDTO.getCorrectCnt()) < Integer.valueOf(answerDTO.getNeedCorrectCnt())) {
				answerDTO.setMessage(WebStringUtil.replaceBR(MessageUtil.getMessage(Project.getProjectCode(), "I0000006", request.getLocale())));
			} else {
				answerDTO.setMessage(WebStringUtil.replaceBR(MessageUtil.getMessage(Project.getProjectCode(), "I0000007", request.getLocale())));
			}
		}
		return answerDTO;
	}

	public String getHeaderMessage(HttpServletRequest request) {
		return StringUtil.EMPTY;
	}
}
