package ch18.sec04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream / DataOutputStream
// �⺻ ������ Ÿ������ ����� �����ϰ� ���ִ� ���� ��Ʈ��
// �޼ҵ�
// read�⺻ Ÿ��() : readInt(), readDouble(), ...
// write�⺻ Ÿ��() : writeInt(), writeDouble(), ...
// ���ڿ��� ��� : readUTF(), writeUTF()
// ����!! readString(), writeString()�� ����

// ���Ͽ� ����� ������� Ÿ�Կ� ���� �о� �´�.

public class DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		// ���Ϸ� ���
		FileOutputStream fos = new FileOutputStream("C:/test/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿"); // ���ڿ��� ���
		dos.writeDouble(95.5); // �Ǽ�
		dos.writeInt(1); // ����
		
		dos.flush();
		dos.close();
		fos.close();
		
		// ���Ͽ��� �о� ����
		FileInputStream fis = new FileInputStream("C:/test/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		String name = dis.readUTF();
		double score = dis.readDouble();
		int order = dis.readInt();
		System.out.println(name + " : " + score + " : " + order);
		
		dis.close();
		fis.close();
		
	}

}
