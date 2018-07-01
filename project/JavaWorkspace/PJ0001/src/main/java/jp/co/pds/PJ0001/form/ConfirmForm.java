package jp.co.pds.PJ0001.form;

import java.util.List;

/**
 * @author Rei Kitahara
 *
 */
public class ConfirmForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private String uid;

	private String groupId;

	private String questionGroupId;

	private String questionCnt;

	private List<String> ans;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getQuestionGroupId() {
		return questionGroupId;
	}

	public void setQuestionGroupId(String questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	public String getQuestionCnt() {
		return questionCnt;
	}

	public void setQuestionCnt(String questionCnt) {
		this.questionCnt = questionCnt;
	}

	public List<String> getAns() {
		return ans;
	}

	public void setAns(List<String> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "uid="+ uid
				+ ", groupId="+ groupId
				+ ", questionGroupId="+ questionGroupId
				+ ", questionCnt="+ questionCnt;
	}
}
