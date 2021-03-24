package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\ch18\\sec02\\file1.txt");

			// read(byte) 메소드 사용해서 읽고 출력
			// byte[]을 문자열로 변환해서 출력
			// String(바이트 배열, 시작 인덱스, 읽은 바이트 수) 생성자 사용해서 문자열로 변환

			byte[] data = new byte[100];
			int bytes = fis.read(data);
			System.out.print(new String(data, 0, bytes));
			// 파일 마지막에 엔터 입력하지 않았으면 -2 하지 않음
			
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
