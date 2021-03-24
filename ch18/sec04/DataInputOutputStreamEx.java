package ch18.sec04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream / DataOutputStream
// 기본 데이터 타입으로 입출력 가능하게 해주는 보조 스트림
// 메소드
// read기본 타입() : readInt(), readDouble(), ...
// write기본 타입() : writeInt(), writeDouble(), ...
// 문자열인 경우 : readUTF(), writeUTF()
// 주의!! readString(), writeString()은 없음

// 파일에 저장된 순서대로 타입에 맞춰 읽어 온다.

public class DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		// 파일로 출력
		FileOutputStream fos = new FileOutputStream("C:/test/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동"); // 문자열로 출력
		dos.writeDouble(95.5); // 실수
		dos.writeInt(1); // 정수
		
		dos.flush();
		dos.close();
		fos.close();
		
		// 파일에서 읽어 오기
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
