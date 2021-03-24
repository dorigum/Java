package ch18.sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx2 {

	public static void main(String[] args) throws Exception {
		// ���� ���� ��� �˾ƿ���
		String originalFileName = "src\\ch18\\sec03\\����.jpg";
		// ���纻 ���� ���
		String targetFileName = "C:/test/image.jpg";

		// ���� ����� ��ü ����
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		// ������ ���� ����Ʈ ��
		int readBytesNo;
		// ������ ���� ����Ʈ ������ �迭
		byte[] readBytes = new byte[100];
		
		// �� ���� 100����Ʈ�� �о �迭�� �����ϰ� (���������� ���� ����Ʈ �� �о ����)
		while((readBytesNo = fis.read(readBytes)) != -1) {
		// write(���� ���ڿ� ����Ʈ, ���� ��ġ, ���� ����Ʈ ��)
			fos.write(readBytes, 0, readBytesNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
	}
}
