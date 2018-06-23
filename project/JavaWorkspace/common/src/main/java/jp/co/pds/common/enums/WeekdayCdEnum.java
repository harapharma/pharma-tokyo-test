package jp.co.pds.common.enums;

public enum WeekdayCdEnum {

	Sunday("1"),
	Monday("2"),
	Tuesday("3"),
	Wednesday("4"),
	Thursday("5"),
	Friday("6"),
	Saturday("7");

	private String code;

	private WeekdayCdEnum(String code) {
        this.code = code;
    }

	public String getCode() {
        return this.code;
    }

	public static WeekdayCdEnum getByCode(String code) {
		for(WeekdayCdEnum value : values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
        return null;
    }

	public String getShortName() {
		switch (this) {
		case Sunday :
			return "SUN";
		case Monday :
			return "MON";
		case Tuesday :
			return "TUE";
		case Wednesday :
			return "WED";
		case Thursday :
			return "THU";
		case Friday :
			return "FRI";
		case Saturday :
			return "SAT";
		default :
		}
        return null;
    }
}
