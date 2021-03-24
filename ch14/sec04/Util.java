package ch14.sec04;

// p660
// 제네릭 메소드를 포함하는 클래스
// 제네릭 메소드 : 매개변수 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드
// public <타입 파타미터> 리턴 타입 메소드명(매개변수,...) { ... }
// public <T> Box<T> boxing(T t) { ... }

// <T> : 타입 파라미터를 매개변수와 리턴 타입의 타입으로 사용하겠다는 의미
// 호출할 때 <T> 결정이 나면 Box<T>와 (T t)가 결정

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
}
