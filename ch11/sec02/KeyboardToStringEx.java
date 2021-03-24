package ch11.sec02;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		// 영문자 1개 : 1바이트
		// 한글 1자 : 2바이트
		
		System.out.println(readByteNo + "바이트");
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
	}

}
