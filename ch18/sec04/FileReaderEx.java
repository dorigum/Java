package ch18.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {
		// 텍스트 파일로부터 데이터 읽어 올 때 사용
		FileReader fr = new FileReader("src\\ch18\\sec04\\FileReaderEx.java");
		
		int readCharNo;
		char[] charBuf = new char[100];
		
		while((readCharNo = fr.read(charBuf)) != -1) {
			String data = new String(charBuf, 0, readCharNo);
			System.out.print(data);
		}
		
		fr.close();

	}

}