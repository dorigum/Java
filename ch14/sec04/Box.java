package ch14.sec04;

// 제네릭 타입 Box

public class Box<T> { // T 자리에 원하는 타입으로 지정 가능!
	private T t;

	public T get() {
		return t;

	}

	public void set(T t) {
		this.t = t;
		
	}
}
