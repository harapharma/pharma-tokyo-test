package jp.co.pds.PJ0001.form;

import java.util.List;

/**
 * @author Rei Kitahara
 *
 */
public class QuestionForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private List<String> ans;

	public List<String> getAns() {
		return ans;
	}

	public void setAns(List<String> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "ans="+ ans;
	}
}
