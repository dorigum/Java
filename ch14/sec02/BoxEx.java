package ch14.sec02;

public class BoxEx {

	public static void main(String[] args) {
		// ��ü�� Ÿ�� ���� : String
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get(); // Ÿ�� ��ȯ �߻����� ����

		System.out.println(str);

		// Integer Ÿ�� ����
		Box<Integer> box2 = new Box<Integer>();
		box2.set(20);
		int value = box2.get();

		System.out.println(value);
	}

}
