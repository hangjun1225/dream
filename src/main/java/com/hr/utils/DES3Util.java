package com.hr.utils;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
/**
 * 3DES对称加密
 * 使用 3DES/ECB/PKCS5Padding
 * @author hangjun
 * @date 2018/04/26
 *
 */
public class DES3Util {
	/**
	 * 3DES_ECB加密
	 * 		参数类型：String
	 * @param content	
	 * @param key		
	 * @return
	 */
	public static byte[] encrypt(String content, String key) {
		try {
			byte[] contentBytes=content.getBytes("UTF-8");
			byte[] keyBytes=key.getBytes("UTF-8");
			//加密
			return encrypt(contentBytes,keyBytes);
		} catch (Exception e) {
			System.out.println("exception:" + e.toString());
		}
		return null;
	}
	
	/**
	 * 3DES解密
	 * 	ECB模式
	 * 		参数类型：String
	 * @param content	
	 * @param key		
	 * @return
	 */
	public static byte[] decrypt(String content, String key) {
		try {
			byte[] contentBytes=content.getBytes("UTF-8");
			byte[] keyBytes=key.getBytes("UTF-8");
			//加密
			return decrypt(contentBytes,keyBytes);
		} catch (Exception e) {
			System.out.println("exception:" + e.toString());
		}
		return null;
	}
	
//	============================================================================
//	=============================默认使用上面两个方法=================================
//	============================================================================
	
	
	/**
	 * 3DES_ECB加密
	 * 		参数类型：byte[]
	 * @param content	
	 * @param keyBytes
	 * @return
	 */
	public static byte[] encrypt(byte[] content, byte[] keyBytes) {
		try {
			DESedeKeySpec desKeySpec = new DESedeKeySpec(keyBytes);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
			SecretKey key = keyFactory.generateSecret(desKeySpec);
			
			Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE,key);
			byte[] result = cipher.doFinal(content);
			return result;
		} catch (Exception e) {
			System.out.println("exception:" + e.toString());
		}
		return null;
	}
	
	
	
	/**
	 * 3DES解密
	 * 	ECB模式
	 * 		参数类型：byte[]
	 * @param content
	 * @param keyBytes
	 * @return
	 */
	public static byte[] decrypt(byte[] content, byte[] keyBytes) {
		try {
			DESedeKeySpec desKeySpec = new DESedeKeySpec(keyBytes);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
			SecretKey key = keyFactory.generateSecret(desKeySpec);
			
			Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE,key);
			byte[] result = cipher.doFinal(content);
			return result;
		} catch (Exception e) {
			System.out.println("exception:" + e.toString());
		}
		return null;
	}
	
	/**
	 * 功能：字节数组转成16进制的字符串
	 * 
	 * 二进制			十进制		十六进制			byte
	 * 0110 0001		97			61				a		
	 * 
	 * 例：将字节a转成16进制  
	 * 		byte[] b={a};
	 * 		String result=byteToHexString(b);//result=61
	 * 
	 * @param bytes
	 * @return
	 */
	public static String byteToHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer(bytes.length);
		String sTemp;
		for (int i = 0; i < bytes.length; i++) {
			sTemp = Integer.toHexString(0xFF & bytes[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}
	
//	============================================================================
//	=============================下面是测试代码,生产情况下去除=================================
//	============================================================================
	
	public static void main(String[] args) {

//		String content = "aaaaaaaabbbbbbbbaaaaaaaa";
		String content = "a";
		String key = "012345670123456701234567";//密钥24位
		

		System.out.println("加密前(16进制显示):" + byteToHexString(content.getBytes()));
		byte[] encrypted = encrypt(content.getBytes(), key.getBytes());
		System.out.println("加密后(16进制显示):：" + byteToHexString(encrypted));
		byte[] decrypted = decrypt(encrypted, key.getBytes());
		System.out.println("解密后(16进制显示):" + byteToHexString(decrypted));
	}
}
