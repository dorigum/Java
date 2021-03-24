package ch18.sec03;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream os = null;

		try {
			// 쓰기 다시 하면 이전 내용 덮어씀
			//os = new FileOutputStream("src\\ch18\\sec03\\fileWrite.txt");
			
			// 추가 모드(append 모드)로 파일을 열기 (파일 맨 뒷 부분에 추가)
			// new FileOutputStream(File file, boolean append)
			os = new FileOutputStream("src\\ch18\\sec03\\fileWrite.txt", true);
			
			// 출력할 문자열
			String strOut = "\n내용 다시 변경";
			byte[] bs = strOut.getBytes(); // 바이트 배열로 변환
			
			os.write(bs);
			os.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
