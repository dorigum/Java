package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// 현재 FileInputStreamEx2.java 파일 읽어와서 출력
		try {
			FileInputStream fis = new FileInputStream("src\\ch18\\sec02\\FileInputStreamEx2.java");
		
		int data;
		while((data = fis.read()) != -1) {
			System.out.write(data);
		}
		
		System.out.flush();
		fis.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}