package ch14.sec01;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("ȫ�浿"); // String -> Object �ڵ� Ÿ�� ��ȯ
		String name = (String) box.getObject(); // Object-> String ���� Ÿ�� ��ȯ

		System.out.println(name);

		box.setObject(new Apple()); // Apple -> Object �ڵ� Ÿ�� ��ȯ
		Apple apple = (Apple) box.getObject(); // Object -> Apple ���� Ÿ�� ��ȯ

	}

}
