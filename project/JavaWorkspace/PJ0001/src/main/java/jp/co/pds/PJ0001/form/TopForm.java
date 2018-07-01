package jp.co.pds.PJ0001.form;

/**
 * @author Rei Kitahara
 *
 */
public class TopForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private String uid;

	private String groupId;

	private String questionGroupId;

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

	@Override
	public String toString() {
		return "uid="+uid
				+", groupId="+groupId
				+", questionGroupId="+questionGroupId;
	}
}
