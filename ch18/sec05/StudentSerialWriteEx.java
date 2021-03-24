package ch18.sec05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 직렬화(Serialization)
// Object를 Binary 형태의 파일로 바꾸는 것
// 객체를 출력하기 위해서 객체의 데이터(필드 값)을
// 일렬로 늘어선 연속적인 바이트로 변경(객체 직렬화라고 함)
// 역직렬화 : Binary -> Object(연속적인 바이트를 객체로 복원)
// 직렬화 사용 이유 : Object 저장하기 위해서
// 주의!! : Serialization 인터페이스를 구현해야 함
// 클래스 버전 유지를 위해서 serialVersionUID 사용
// 직렬화한 것을 다시 역직렬화 하려면 클래스 버전이 일치해야 함

public class StudentSerialWriteEx {

	public static void main(String[] args) throws Exception {
		Student std = new Student("2022001", "홍길동", "컴퓨터");
		System.out.println(std.getName() + "\t" + std.getId() + "\t" + std.getMajor());

		// 직렬화를 통해서 std 객체 저장
		FileOutputStream fos = new FileOutputStream("src\\ch18\\sec05\\std.bin");
		// 객체 저장
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		oos.close();
		
	}

}
