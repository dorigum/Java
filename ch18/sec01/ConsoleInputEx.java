package ch18.sec01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputEx {

	public static void main(String[] args) throws IOException {
		// 콘솔 입력 : System.in 필드 사용
		InputStream is = System.in;
		// System.out.print("입력 : ");
		// 아스키 코드 값으로 읽어 들임
		// 읽은 내용 바로 출력 : 아스키 코드값 출력
		// System.out.println(is.read());

		// 아스키 코드값을 문자로 변환해서 출력
		// System.out.println((char) is.read());

		byte[] data = new byte[10];
		System.out.print("이름 입력 : ");
		int bytes = is.read(data);
		System.out.println(bytes);
		
		// byte[] 배열을 문자열로 변환해서 출력
		// String(바이트 배열, 시작 인덱스, 읽은 바이트 -2) 생성자 사용
		// -2 하는 이유 : 엔터키 (캐리지 리턴(13), 라인 피드(10))
		String name = new String(data, 0, bytes-2);
		System.out.println(name);

	}

}
