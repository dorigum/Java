package ch06.sec05;

public class Singleton {
	// Ŭ���� �ڽ��� Ÿ������ ����(static) �ʵ� ����
	// �ܺο��� �������� ���ϵ��� private�� ����
	private static Singleton singleton = new Singleton();
	
	// ������
	// �ܺο��� new �����ڸ� ����ؼ� �����ڸ� ȣ���� �� ������ �����ش�.
	// private�� ����
	private Singleton(){}
	
	// �ܺο��� ȣ���� �� �ִ����� �޼ҵ� ���
	// ���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����
	public static Singleton getInstance() {
		return singleton; //Ŭ���� Ÿ��
	}

}
