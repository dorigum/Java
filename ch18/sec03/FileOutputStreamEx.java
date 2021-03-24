package ch18.sec03;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream os = null;

		try {
			// ���� �ٽ� �ϸ� ���� ���� ���
			//os = new FileOutputStream("src\\ch18\\sec03\\fileWrite.txt");
			
			// �߰� ���(append ���)�� ������ ���� (���� �� �� �κп� �߰�)
			// new FileOutputStream(File file, boolean append)
			os = new FileOutputStream("src\\ch18\\sec03\\fileWrite.txt", true);
			
			// ����� ���ڿ�
			String strOut = "\n���� �ٽ� ����";
			byte[] bs = strOut.getBytes(); // ����Ʈ �迭�� ��ȯ
			
			os.write(bs);
			os.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
