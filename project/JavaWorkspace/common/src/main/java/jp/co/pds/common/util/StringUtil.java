package jp.co.pds.common.util;

/**
 * 暗号化ユーティリティ
 * @author Rei Kitahara
 *
 */
public class StringUtil {

	private static final String LATIN1 = "ISO-8859-1";
	private static final String UTF8 = "UTF-8";

	public static final String EMPTY = "";
	public static final String HYPHEN = "-";

	/**
	 * コンストラクタ
	 */
	public StringUtil() {
	}

	/**
	 * latin1 to default
	 * @param input
	 * @return default encoding string
	 */
	public static String fromLatin1(String input) {
		String output = null;
		try {
			byte[] latin1 = java.nio.charset.StandardCharsets.ISO_8859_1.encode(input).array();
			output = new String(latin1);
		} catch (Exception e) {
			output = input;
		}

		return output;
	}

	/**
	 * padding
	 * @param input
	 * @return default encoding string
	 */
	public static String padLeft(String input, char padChr, int len) {
		StringBuilder sb = new StringBuilder(input);
		while(sb.length() < len) {
			sb.insert(0, padChr);
		}
		return sb.toString();
	}

	/**
	 * 金額カンマ付与
	 * @param input
	 * @return String output
	 */
	public static String addComma(String input) {
		return String.format("%,3d", input);
	}

	/**
	 * 金額カンマ除去
	 * @param input
	 * @return String output
	 */
	public static String delComma(String input) {
		return input.replaceAll(",", "");
	}
}
