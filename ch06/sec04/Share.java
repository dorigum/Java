package ch06.sec04;

// static �ʵ� ����
// static �ʵ� ��� ��ü�� ����

public class Share {
	int a; // �ν��Ͻ� �ʵ�
	static int staticA; // static �ʵ�
	
	// �ν��Ͻ� �޼ҵ�
	public void set(int n) {
		a += n;
		staticA += n;
		
	}
	
	// �ν��Ͻ� �޼ҵ�
	public int showA() {
		return a;
		
	}
	
	// static �޼ҵ�
	public static int showStaticA() {
		return staticA;
		
	}
	
}
