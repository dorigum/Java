package ch14.sec04;

// p660
// ���׸� �޼ҵ带 �����ϴ� Ŭ����
// ���׸� �޼ҵ� : �Ű����� Ÿ�԰� ���� Ÿ������ Ÿ�� �Ķ���͸� ���� �޼ҵ�
// public <Ÿ�� ��Ÿ����> ���� Ÿ�� �޼ҵ��(�Ű�����,...) { ... }
// public <T> Box<T> boxing(T t) { ... }

// <T> : Ÿ�� �Ķ���͸� �Ű������� ���� Ÿ���� Ÿ������ ����ϰڴٴ� �ǹ�
// ȣ���� �� <T> ������ ���� Box<T>�� (T t)�� ����

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
}
