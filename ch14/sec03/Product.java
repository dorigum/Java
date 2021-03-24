package ch14.sec03;

// T 타입 : 객체 (클래스 타입)
// M 타입 : String

public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
	

}
