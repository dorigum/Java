package ch10.sec01;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

		String data1 = "100";
		String data2 = "a100";	// 숫자 포맷이 아니므로 오류가 발생!

		try {	// 예외가 발생할 가능성이 있는 문장 배치
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
				System.out.println("결과 : " + result);
			
		} catch (Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("종료합니다.");
		}

	}

}
