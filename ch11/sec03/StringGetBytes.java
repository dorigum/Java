package ch11.sec03;

import java.io.UnsupportedEncodingException;

public class StringGetBytes {

	public static void main(String[] args) {
		// 기본 문자셋
		System.out.println("file.encoding : "
		+ System.getProperty("file.encoding"));
		
		// 원래  윈도우는 CP949 방식을 사용했는데
		// MS사에서 EUC-KR 방식에서 확장해 MS949로 사용
		
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		
		// 문자열 길이?
		System.out.println("str.length : " + str.length());
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		System.out.println("----------------------------");
		
	
		// 특정 문자 셋으로 인코딩된 바이트 배열 얻기
		try {
			byte [] bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + bytes2.length);
			// 기본 문자셋을 EUC-KR로 인코딩된 바이트 배열 얻기
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
			
			
			System.out.println("----------------------------");
			
			
			byte [] bytes3 = str.getBytes("UTF-8");
			System.out.println("byte3.length : " + bytes3.length);
			// 기본 문자셋을 UTF-8로 인코딩된 바이트 배열 얻기
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
