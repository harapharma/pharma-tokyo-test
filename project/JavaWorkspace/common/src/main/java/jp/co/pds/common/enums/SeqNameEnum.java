package jp.co.pds.common.enums;

public enum SeqNameEnum {

	SeqLoginId("SEQ_LOGIN_ID"),
	SeqQuestionId("SEQ_QUESTION_ID"),
	SeqAnswerId("SEQ_ANSWER_ID"),
	ExpenseAdjstmntId("EXPENSE_ADJSTMNT_ID"),
	TransportExpenseId("TRANSPORT_EXPENSE_ID");

	private String code;

	private SeqNameEnum(String code) {
        this.code = code;
    }

	public String getCode() {
        return this.code;
    }
	
	public static SeqNameEnum getByCode(String code) {
		for(SeqNameEnum value : values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
        return null;
    }
}
