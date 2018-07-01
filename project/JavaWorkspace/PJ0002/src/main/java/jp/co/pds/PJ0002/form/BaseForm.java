package jp.co.pds.PJ0002.form;

import java.io.Serializable;

public abstract class BaseForm implements Serializable {

	static final long serialVersionUID = 12345678L;

	protected String message = null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public abstract String toString();
}
