package jp.co.pds.common.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 日付時刻ユーティリティ
 * @author Rei Kitahara
 *
 */
public class DateTimeUtil {

	public static String BASIC_YYYY_FORMAT = "yyyy";
	public static String BASIC_MM_FORMAT = "MM";
	public static String BASIC_DD_FORMAT = "dd";
	public static String BASIC_DATE_FORMAT = "yyyy/MM/dd";
	public static String BASIC_TIME_FORMAT = "HH:mm:ss";
	public static String BASIC_DATETIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

	/**
	 * 現在日時取得
	 * @return 現在日時
	 */
	public static Calendar getNow() {
		return Calendar.getInstance();
	}

	/**
	 * 日時フォーマット
	 * @param calendar
	 * @param format
	 * @return フォーマット済日時
	 */
	public static String getFromattedDateTime(Calendar calendar, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(calendar.getTime());
	}

	/**
	 * 日時フォーマット
	 * @param calendar
	 * @param format
	 * @return フォーマット済日時
	 */
	public static String getFromattedDateTime(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 対象の年月の月末日を取得
	 * @param year
	 * @param month
	 * @return 月末日
	 */
	public static int getLastDay(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		// monthは 0始まりなのでそのまま設定すると翌月となる
		calendar.set(year, month, 1, 0, 0, 0);
		calendar.add(Calendar.DAY_OF_MONTH, -1);

		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 分から時フォーマット文字列へ変換
	 * @param calendar
	 * @return フォーマット済日時
	 */
	public static String toHourString(Integer min) {
		String hourString = StringUtil.EMPTY;
		if (min == null || min == 0) {
			return hourString;
		}
		int hour = min / 60;
		if (hour < 10) {
			hourString = "0";
		}
		hourString = hourString + String.valueOf(hour) + ":";
		if (min % 60 < 10) {
			return hourString + "0" + String.valueOf(min % 60);
		}
		return hourString + String.valueOf(min % 60);
	}


	/**
	 * 時フォーマット文字列から分へ変換
	 * @param calendar
	 * @return フォーマット済日時
	 */
	public static Integer toMinute(String hour) {
		if (hour == null) {
			return null;
		}
		String[] splited = null;
		if (hour.indexOf(":") > 0) {
			splited = hour.split(":");
		} else if (hour.length() == 4) {
			splited = new String[2];
			splited[0] = hour.substring(0, 2);
			splited[1] = hour.substring(2);
		}
		return Integer.valueOf(splited[0]) * 60 +  Integer.valueOf(splited[1]);
	}

	/**
	 * Date型の加算
	 * @param target
	 * @param addType
	 * @param value
	 * @return
	 */
	public static Date addDate(Date target, int addType, int value) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(target);
		cal.add(addType, value);
		return cal.getTime();
	}
}
