package ch14.sec04;

// ���׸� Ÿ�� Box

public class Box<T> { // T �ڸ��� ���ϴ� Ÿ������ ���� ����!
	private T t;

	public T get() {
		return t;

	}

	public void set(T t) {
		this.t = t;
		
	}
}
