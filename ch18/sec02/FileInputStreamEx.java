package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		// FileInputStream fis = new FileInputStream("C:/test/Dir/file1.txt");
		// FileInputStream fis = new
		// FileInputStream("C:\\javaWorkspace\\TestProject\\src\\ch18\\sec02\\file1.txt); // ���� ���
		FileInputStream fis = new FileInputStream("src\\ch18\\sec02\\file1.txt"); // ��� ���

		/*		String newStr = null;
				while(true) {
					int data = fis.read(); // 1����Ʈ�� ����
					
					if(data == -1) break; // �� �о����� -1 ��ȯ
					//System.out.println(data);
					System.out.print((char)data);
				}*/

		// System.out.write() �޼ҵ� ����ؼ� ���
		int data;
		while ((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();

		fis.close();
	}

}

// fis.read() : �ƽ�Ű �ڵ尪 ��ȯ
// 13 : ���� (ĳ���� ����)
// 10 : �ٹٲ�(���� �ǵ�)