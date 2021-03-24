package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		// �����ڸ� private�� ���� ���ұ� ������ not visible ����
		// Singleton obj1 = new Singleton();
		
		// �ܺο� ������
		// static �޼ҵ��� getInstance() ȣ���ؼ�
		// ��ü�� ��ȯ
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1==obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

}
