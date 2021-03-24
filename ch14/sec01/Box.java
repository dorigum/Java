package ch14.sec01;

// 제네릭을 사용하지 않은 경우
// 강제 타입 변환이 발생하는 것을 확인

public class Box {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	
}
