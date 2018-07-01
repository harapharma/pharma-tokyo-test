package jp.co.pds.PJ0001.service.question;

import java.util.List;

import jp.co.pds.PJ0001.dto.QuestionDTO;

/**
 * Hello world!
 *
 */
public class ProcessService
{
	public ProcessService() {
	}

	public void applyAnswer(List<QuestionDTO> questionDTOs, List<String> ans) {
		int roopMax = questionDTOs.size() < ans.size() ? questionDTOs.size() : ans.size();
		for (int i = 0; i < roopMax; i++) {
			questionDTOs.get(i).setSelection(ans.get(i));
		}
	}
}
