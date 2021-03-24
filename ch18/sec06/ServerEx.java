package ch18.sec06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	// 클라이언트 요청을 기다리고 accept() 용
	ServerSocket serverSocket = null;
	Socket socket = null; // 통신용 소켓
	BufferedReader inStream = null; // BufferedReader : 보조 스트림
	BufferedWriter outStream = null;

	Scanner sc = new Scanner(System.in); // 키보드 입력용

	// 생성자
	public ServerEx() {
		// 서버 소켓 생성 : 클라이언트 요청 기다림
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다.");

			// 클라이언트로부터 요청을 수락하고, 통신용 소켓 생성
			socket = serverSocket.accept();
			System.out.println("연결이 되었습니다.");

			// 소켓 입력 스트림 생성
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 소켓 출력 스트림 생성
			outStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 통신 : 데이터 주고 받음
			// 클라이언트에서 'bye' 메세지가 오면 통신 중단
			while (true) {
				// 클라이언트로 부터 메시지를 한 행씩 읽기
				String inputMessage = inStream.readLine();

				// "bye"를 받으면 연결 종료
				if (inputMessage.equals("bye")) {
					System.out.println("클라이언트에서 bye 연결을 종료하였음.");
					break;
				}

				// 클라이언트와의 대화 내용을 화면에 출력
				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("서버 : ");
				// 키보드에서 입력
				String outputMessage = sc.nextLine();
				// 메시지 전송
				outStream.write(outputMessage + "\n"); // 키보드에서 입력한 문자열 전송
				outStream.flush(); // 버퍼 비우기(버퍼에 남아있는 문자열을 모두 강제로 내보냄)

			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
			sc.close();
			if(socket != null) socket.close();
			if(serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

	public static void main(String[] args) {
		new ServerEx();
	}

}
