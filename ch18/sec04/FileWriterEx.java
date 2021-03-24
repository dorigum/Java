package ch18.sec04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		File file = new File("src\\ch18\\sec04\\FileWriterEx.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로 된" + "\r\n");
		fw.write("문자열로 바로 출력할 수 있다." + "\r\n");
		
		System.out.println("파일에 저장되었습니다.");
		
		fw.flush();
		fw.close();

	}

}
