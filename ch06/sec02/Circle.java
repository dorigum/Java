package ch06.sec02;

// �Ű������� ��ȯ���� �ִ� �޼ҵ�

public class Circle {
	// �ʵ�
	// ������ ���� ������ �ʵ� : radius
	int radius;
	
	// �޼ҵ�
	// setCircle()
	// ������ ���� ���� �޾Ƽ�
	// �ʵ� radius �� ����
	public void setCircle(int r) {
		radius = r;
	}
	
	// area()
	// ���� ���̸� ����ؼ� ��ȯ
	public float area() {
		float result = radius * radius * 3.14f;
		return result;
		
		// = return radius * radius * 3.14f;
	}
	
}
