package com.es.web.common.util;

import java.security.MessageDigest;

public class RECrypto {
	
	private MessageDigest md = null;
	private byte[] byteData = null;
	private StringBuffer hexString;
	private String hex;
	
	public String encrypt(String plain) {
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(plain.getBytes());
			
			byteData = md.digest();
			
			hexString = new StringBuffer();
			
			for(int i=0; i<byteData.length; i++) {
				hex = Integer.toHexString(0xff & byteData[i]);
				
				if(hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
		} catch(Exception e) {
			e.printStackTrace();
			return "ENCRYPT-ERROR";
		}
		return hexString.toString();
	}
	
	// 비밀번호 값 얻기 위해서 임시 사용
//	public static void main(String[] args) {
//		System.out.println(new RECrypto().encrypt("1qazXSW@"));
//	}

}
