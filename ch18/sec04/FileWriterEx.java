package ch18.sec04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		File file = new File("src\\ch18\\sec04\\FileWriterEx.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter�� �ѱ۷� ��" + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
		
		fw.flush();
		fw.close();

	}

}
