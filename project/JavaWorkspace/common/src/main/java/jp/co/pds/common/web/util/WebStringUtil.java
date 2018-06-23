package jp.co.pds.common.web.util;

public class WebStringUtil {
	public static String BR = "<br>";
	public static String SPACE = "&nbsp;";

	public static String replaceBR(String input) {
		String output = input;
		//空文字
		if (output == null || output.length() == 0) {
			return SPACE;
		}
		//本物の改行
		output = output.replaceAll("\\r\\n", BR);
		output = output.replaceAll("\\r", BR);
		output = output.replaceAll("\\n", BR);
		//文字で入れられた改行
		output = output.replaceAll("\\\\r\\\\n", BR);
		output = output.replaceAll("\\\\r", BR);
		output = output.replaceAll("\\\\n", BR);
		return output;
	}
}
