package ch09.sec05;

public class Anonymous {
	// �θ� Ŭ���� Ÿ���� �ʵ忡 �ʱⰪ���� ����
	Person field = new Person() {	// �͸� �ڽ� ��ü ���� : �θ� Ÿ��(Person) -> �θ� ����� ���
		void work() {		// �ܺο��� ȣ������ ���ϰ�, �����ǵ� �θ� Ÿ���� work()���� ȣ�� ����
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
			
		}	
	};	// �����ݷ� �ٿ��ߵ�!!
	
	// ���� ���� �����ϰ�, �͸� �ڽ� ��ü�� �ʱ�ȭ
	void method1() {
		// ���� ���� ������ ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}
	
	// �Ű������� �̿��ؼ� �͸� �ڽ� ��ü ����
	// method2() ȣ���ϴ� �ʿ��� �Ű� ������ �͸� �ڽ� ��ü ����
	void method2(Person person) {
		person.wake();
	}
	
}
