package jp.co.pds.common.dto;

import java.io.Serializable;

public abstract class BaseDTO implements Serializable {

	static final long serialVersionUID = 12345678L;

	public abstract String toString();
}
