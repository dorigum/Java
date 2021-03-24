package ch14.sec02;

public class BoxEx {

	public static void main(String[] args) {
		// 구체적 타입 지정 : String
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get(); // 타입 변환 발생하지 않음

		System.out.println(str);

		// Integer 타입 지정
		Box<Integer> box2 = new Box<Integer>();
		box2.set(20);
		int value = box2.get();

		System.out.println(value);
	}

}
