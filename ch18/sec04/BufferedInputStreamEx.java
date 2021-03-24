package ch18.sec04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		// 보조 스트림 BufferedInputStream을 사용하지 않은 경우
		FileInputStream fis1 = new FileInputStream("src\\ch18\\sec03\\고흐.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용하지 않았을 때 : " + (end-start) + "ms");
		fis1.close();
		
		// 보조 스트림 BufferedInputStream을 사용한 경우
		FileInputStream fis2 = new FileInputStream("src\\ch18\\sec03\\고흐.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);	
		start = System.currentTimeMillis();
		while(bis.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용했을 때 : " + (end-start) + "ms");
		
		bis.close();
		fis2.close();
	}
}
