package ch10.sec01;

// 객체 참조가 없는 상태에서 발생되는 예외
public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());

	}

}
