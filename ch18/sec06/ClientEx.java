package ch18.sec06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	
	Socket socket = null; // ��ſ� ����
	BufferedReader inStream = null;
	BufferedWriter outStream = null;
	
	Scanner sc = new Scanner(System.in);
	
	public ClientEx() {
		
		try {
			// ��ſ� ���� ����. ������ ���� (������ ���� ���� ������ ��Ʈ�� ����)
			socket = new Socket("localhost",9999);
			System.out.println("����Ǿ����ϴ�.");
			
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// ��� : ������ �ְ� ����
			// Ŭ���̾�Ʈ�� 'bye' �Է��ϸ� ����
			while(true) {
				System.out.println("Ŭ���̾�Ʈ : ");
				String outMessage = sc.nextLine(); // Ű����κ��� �Է� ����
			
				// �Է��� ���ڿ� ����
				outStream.write(outMessage + "\n");
				
				// Ŭ���̾�Ʈ�� 'bye' �Է��ϸ� ������ ���� �� ���� ����
				if(outMessage.equalsIgnoreCase("bye")){
					outStream.flush(); // ���� ����
					break; // ��� �ߴ�
				}
				outStream.flush();
				
				// �����κ��� �� �޼��� �� �྿ �б�
				String inputMessage = inStream.readLine();
				System.out.println("���� : " + inputMessage);		
			
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		new ClientEx();

	}

}
