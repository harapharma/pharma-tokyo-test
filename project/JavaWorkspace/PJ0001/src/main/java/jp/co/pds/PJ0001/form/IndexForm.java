package jp.co.pds.PJ0001.form;

import javax.validation.constraints.Size;

/**
 * @author Rei Kitahara
 *
 */
public class IndexForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	@Size(min=8, max=8)
	private String uid;

	@Size(min=8, max=20)
	private String pswd;

	@Size(min=8, max=20)
	private String pswd1;

	@Size(min=8, max=20)
	private String pswd2;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getPswd1() {
		return pswd1;
	}

	public void setPswd1(String pswd1) {
		this.pswd1 = pswd1;
	}

	public String getPswd2() {
		return pswd2;
	}

	public void setPswd2(String pswd2) {
		this.pswd2 = pswd2;
	}

	@Override
	public String toString() {
		return "uid=" + uid + ", pswd=" + pswd;
	}
}
