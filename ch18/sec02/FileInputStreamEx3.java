package ch18.sec02;

import java.io.FileInputStream;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\ch18\\sec02\\file1.txt");

			// read(byte) �޼ҵ� ����ؼ� �а� ���
			// byte[]�� ���ڿ��� ��ȯ�ؼ� ���
			// String(����Ʈ �迭, ���� �ε���, ���� ����Ʈ ��) ������ ����ؼ� ���ڿ��� ��ȯ

			byte[] data = new byte[100];
			int bytes = fis.read(data);
			System.out.print(new String(data, 0, bytes));
			// ���� �������� ���� �Է����� �ʾ����� -2 ���� ����
			
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
