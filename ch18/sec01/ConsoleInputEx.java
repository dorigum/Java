package ch18.sec01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputEx {

	public static void main(String[] args) throws IOException {
		// �ܼ� �Է� : System.in �ʵ� ���
		InputStream is = System.in;
		// System.out.print("�Է� : ");
		// �ƽ�Ű �ڵ� ������ �о� ����
		// ���� ���� �ٷ� ��� : �ƽ�Ű �ڵ尪 ���
		// System.out.println(is.read());

		// �ƽ�Ű �ڵ尪�� ���ڷ� ��ȯ�ؼ� ���
		// System.out.println((char) is.read());

		byte[] data = new byte[10];
		System.out.print("�̸� �Է� : ");
		int bytes = is.read(data);
		System.out.println(bytes);
		
		// byte[] �迭�� ���ڿ��� ��ȯ�ؼ� ���
		// String(����Ʈ �迭, ���� �ε���, ���� ����Ʈ -2) ������ ���
		// -2 �ϴ� ���� : ����Ű (ĳ���� ����(13), ���� �ǵ�(10))
		String name = new String(data, 0, bytes-2);
		System.out.println(name);

	}

}
