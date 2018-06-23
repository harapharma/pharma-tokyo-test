package jp.co.pds.common.util;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 暗号化ユーティリティ
 * @author Rei Kitahara
 *
 */
public class EncryptUtil {

	private static final String KEY = "1122334455667788";
	private static final String IV = "aabbccddeeffgghh";

	/**
	 * コンストラクタ
	 */
	public EncryptUtil() {
	}

	/**
	 * 暗号化
	 * @param input
	 * @return 暗号化文字列
	 */
	public static String encrypt(String input) {
		String output = null;
		try {
			byte[] byteInput = input.getBytes("UTF-8");
			byte[] byteKey = KEY.getBytes("UTF-8");
			byte[] byteIv = IV.getBytes("UTF-8");

			SecretKeySpec key = new SecretKeySpec(byteKey, "AES");
			IvParameterSpec iv = new IvParameterSpec(byteIv);

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key, iv);

			byte[] encrypted = cipher.doFinal(byteInput);
			output = new String(Base64.getEncoder().encode(encrypted));

		} catch(Exception e) {
			e.printStackTrace();
		}

		return output;
	}
}
