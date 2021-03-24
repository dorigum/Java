package ch18.sec05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentSerialReadEx {

	public static void main(String[] args) throws Exception {
		// 역직렬화
		FileInputStream fis = new FileInputStream("src\\ch18\\sec05\\std.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student clone = (Student)ois.readObject();
		ois.close();
		
		System.out.println(clone.getName() + "\t" + clone.getId() + "\t" + clone.getMajor());
	}

}
