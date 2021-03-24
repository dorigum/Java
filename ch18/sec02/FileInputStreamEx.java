package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		// FileInputStream fis = new FileInputStream("C:/test/Dir/file1.txt");
		// FileInputStream fis = new
		// FileInputStream("C:\\javaWorkspace\\TestProject\\src\\ch18\\sec02\\file1.txt); // 절대 경로
		FileInputStream fis = new FileInputStream("src\\ch18\\sec02\\file1.txt"); // 상대 경로

		/*		String newStr = null;
				while(true) {
					int data = fis.read(); // 1바이트씩 읽음
					
					if(data == -1) break; // 다 읽었으면 -1 반환
					//System.out.println(data);
					System.out.print((char)data);
				}*/

		// System.out.write() 메소드 사용해서 출력
		int data;
		while ((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();

		fis.close();
	}

}

// fis.read() : 아스키 코드값 반환
// 13 : 엔터 (캐리지 리턴)
// 10 : 줄바꿈(라인 피드)