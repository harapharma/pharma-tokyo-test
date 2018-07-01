package jp.co.pds.PJ0001.form;

/**
 * @author Rei Kitahara
 *
 */
public class HistoryForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private String questionGroupId;

	private int que1Ans;

	private int que2Ans;
	
	public String getQuestionGroupId() {
		return questionGroupId;
	}

	public void setQuestionGroupId(String questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	public int getQue1Ans() {
		return que1Ans;
	}

	public void setQue1Ans(int que1Ans) {
		this.que1Ans = que1Ans;
	}

	public int getQue2Ans() {
		return que2Ans;
	}

	public void setQue2Ans(int que2Ans) {
		this.que2Ans = que2Ans;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
