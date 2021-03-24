package ch18.sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx2 {

	public static void main(String[] args) throws Exception {
		// 원본 파일 경로 알아오기
		String originalFileName = "src\\ch18\\sec03\\고흐.jpg";
		// 복사본 파일 경로
		String targetFileName = "C:/test/image.jpg";

		// 파일 입출력 객체 생성
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		// 실제로 읽은 바이트 수
		int readBytesNo;
		// 실제로 읽은 바이트 저장할 배열
		byte[] readBytes = new byte[100];
		
		// 한 번에 100바이트씩 읽어서 배열에 저장하고 (마지막에는 남은 바이트 다 읽어서 저장)
		while((readBytesNo = fis.read(readBytes)) != -1) {
		// write(읽은 문자열 바이트, 시작 위치, 읽은 바이트 수)
			fos.write(readBytes, 0, readBytesNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
