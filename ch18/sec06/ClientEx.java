package ch18.sec06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	
	Socket socket = null; // 통신용 소켓
	BufferedReader inStream = null;
	BufferedWriter outStream = null;
	
	Scanner sc = new Scanner(System.in);
	
	public ClientEx() {
		
		try {
			// 통신용 소켓 생성. 서버와 연결 (서버가 열어 놓은 동일한 포트로 연결)
			socket = new Socket("localhost",9999);
			System.out.println("연결되었습니다.");
			
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 통신 : 데이터 주고 받음
			// 클라이언트가 'bye' 입력하면 종료
			while(true) {
				System.out.println("클라이언트 : ");
				String outMessage = sc.nextLine(); // 키보드로부터 입력 받음
			
				// 입력한 문자열 전송
				outStream.write(outMessage + "\n");
				
				// 클라이언트가 'bye' 입력하면 서버로 전송 후 연결 종료
				if(outMessage.equalsIgnoreCase("bye")){
					outStream.flush(); // 버퍼 비우고
					break; // 통신 중단
				}
				outStream.flush();
				
				// 서버로부터 온 메세지 한 행씩 읽기
				String inputMessage = inStream.readLine();
				System.out.println("서버 : " + inputMessage);		
			
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

	public static void main(String[] args) {
		new ClientEx();

	}

}
