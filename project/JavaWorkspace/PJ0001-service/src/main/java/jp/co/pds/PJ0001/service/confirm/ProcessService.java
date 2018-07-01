package jp.co.pds.PJ0001.service.confirm;

import java.util.ArrayList;
import java.util.List;

import jp.co.pds.PJ0001.Project;
import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dao.dto.DtAnswerDetail;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.util.DtAnswerDetailUtil;
import jp.co.pds.PJ0001.dao.util.DtAnswerUtil;
import jp.co.pds.PJ0001.dao.util.MsGroupUtil;
import jp.co.pds.PJ0001.dto.QuestionDTO;
import jp.co.pds.common.dao.util.MsSeqUtil;
import jp.co.pds.common.enums.SeqNameEnum;
import jp.co.pds.common.util.DateTimeUtil;

/**
 * Hello world!
 *
 */
public class ProcessService
{
	private static String NO_CORRECT_NUMBER = "0";
	private static String CORRECT = "1";
	private static String NOT_CORRECT = "0";

	public ProcessService() {
	}

	/**
	 * 回答データ登録
	 * @param userId
	 * @param groupId
	 * @param questionGroupId
	 * @param questionCnt
	 * @param questionDTOs
	 */
	public int storeAnswer(String userId, int groupId, int questionGroupId, int questionCnt, List<QuestionDTO> questionDTOs) {

		// 回答ID取得
		MsSeqUtil msSeqUtil = new MsSeqUtil(SeqNameEnum.SeqAnswerId);
		int seqAnswerId = msSeqUtil.getNextValue();

		// 必要正解数取得
		MsGroupUtil msGroupUtil = new MsGroupUtil(groupId);
		MsGroupQuestionGroup msGroupQuestionGroup = msGroupUtil.getMsGroupQuestionGroup(questionGroupId);
		int needCorrectCnt = msGroupQuestionGroup.getNeedCorrectCnt();

		// 正解数計算
		int correctCnt = 0;
		for (QuestionDTO questionDTO : questionDTOs) {
			if (questionDTO.getCorrectNumber().equals(questionDTO.getSelection())) {
				correctCnt++;
			}
		}
		
		// 解答データ作成
		DtAnswer dtAnswer = new DtAnswer();
		dtAnswer.setAnswerId(seqAnswerId);
		dtAnswer.setUserId(userId);
		dtAnswer.setGroupId(groupId);
		dtAnswer.setQuestionGroupId(questionGroupId);
		dtAnswer.setAnswerDatime(DateTimeUtil.getNow().getTime());
		dtAnswer.setQuestionCnt(questionCnt);
		dtAnswer.setNeedCorrectCnt(needCorrectCnt);
		dtAnswer.setCorrectCnt(correctCnt);
		dtAnswer.setRegisterId(Project.getProjectCode());
		dtAnswer.setUpdateId(Project.getProjectCode());

		// 回答データ登録
		DtAnswerUtil dtAnswerUtil = new DtAnswerUtil();
		dtAnswerUtil.storeDtAnswer(dtAnswer);

		// 回答明細データ登録
		storeAnswerDetails(seqAnswerId, questionDTOs);

		return seqAnswerId;
	}

	/**
	 * 回答明細データ登録
	 * @param seqAnswerId
	 * @param questionDTOs
	 */
	public void storeAnswerDetails(int seqAnswerId, List<QuestionDTO> questionDTOs) {
		List<DtAnswerDetail> dtAnswerDetails = new ArrayList<DtAnswerDetail>();
		// 回答明細データ作成
		for (QuestionDTO questionDTO : questionDTOs) {
			DtAnswerDetail dtAnswerDetail = new DtAnswerDetail();
			dtAnswerDetail.setAnswerId(seqAnswerId);
			dtAnswerDetail.setQuestionId(Integer.valueOf(questionDTO.getQuestionId()));
			dtAnswerDetail.setSelection(Integer.valueOf(questionDTO.getSelection()));
			String correct = null;
			if (! NO_CORRECT_NUMBER.equals(questionDTO.getCorrectNumber())) {
				if (questionDTO.getCorrectNumber().equals(questionDTO.getSelection())) {
					correct = CORRECT;
				} else {
					correct = NOT_CORRECT;
				}
			}
			dtAnswerDetail.setCorrect(correct);
			dtAnswerDetail.setRegisterId(Project.getProjectCode());
			dtAnswerDetail.setUpdateId(Project.getProjectCode());

			dtAnswerDetails.add(dtAnswerDetail);
		}
		//回答明細データ登録
		DtAnswerDetailUtil dtAnswerDetailUtil = new DtAnswerDetailUtil();
		dtAnswerDetailUtil.storeDtAnswerDetails(dtAnswerDetails);
	}
}
