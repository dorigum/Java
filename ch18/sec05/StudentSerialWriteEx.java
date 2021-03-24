package ch18.sec05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ����ȭ(Serialization)
// Object�� Binary ������ ���Ϸ� �ٲٴ� ��
// ��ü�� ����ϱ� ���ؼ� ��ü�� ������(�ʵ� ��)��
// �Ϸķ� �þ �������� ����Ʈ�� ����(��ü ����ȭ��� ��)
// ������ȭ : Binary -> Object(�������� ����Ʈ�� ��ü�� ����)
// ����ȭ ��� ���� : Object �����ϱ� ���ؼ�
// ����!! : Serialization �������̽��� �����ؾ� ��
// Ŭ���� ���� ������ ���ؼ� serialVersionUID ���
// ����ȭ�� ���� �ٽ� ������ȭ �Ϸ��� Ŭ���� ������ ��ġ�ؾ� ��

public class StudentSerialWriteEx {

	public static void main(String[] args) throws Exception {
		Student std = new Student("2022001", "ȫ�浿", "��ǻ��");
		System.out.println(std.getName() + "\t" + std.getId() + "\t" + std.getMajor());

		// ����ȭ�� ���ؼ� std ��ü ����
		FileOutputStream fos = new FileOutputStream("src\\ch18\\sec05\\std.bin");
		// ��ü ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		oos.close();
		
	}

}
