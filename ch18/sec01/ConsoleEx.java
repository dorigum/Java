package ch18.sec01;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		// ��� ������Ʈ â(cmd)�� ���� ������ �Է�
		// cd C:\javaWrokspace\TestProject\bin
		// java ch18.sec01.ConsoleEx
		Console console = System.console();
		
		System.out.print("ID : ");
		String id = console.readLine();
		
		System.out.print("��й�ȣ : ");
		char[] charPass = console.readPassword();
		String strPass = new String(charPass);
		
		System.out.println("-----------------------------");
		System.out.println(id);
		System.out.println(strPass);

	}

}
