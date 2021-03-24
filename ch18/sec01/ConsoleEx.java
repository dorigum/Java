package ch18.sec01;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		// 명령 프롬프트 창(cmd)을 통해 데이터 입력
		// cd C:\javaWrokspace\TestProject\bin
		// java ch18.sec01.ConsoleEx
		Console console = System.console();
		
		System.out.print("ID : ");
		String id = console.readLine();
		
		System.out.print("비밀번호 : ");
		char[] charPass = console.readPassword();
		String strPass = new String(charPass);
		
		System.out.println("-----------------------------");
		System.out.println(id);
		System.out.println(strPass);

	}

}
