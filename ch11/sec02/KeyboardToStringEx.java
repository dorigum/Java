package ch11.sec02;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("�Է� : ");
		int readByteNo = System.in.read(bytes);
		// ������ 1�� : 1����Ʈ
		// �ѱ� 1�� : 2����Ʈ
		
		System.out.println(readByteNo + "����Ʈ");
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
	}

}
