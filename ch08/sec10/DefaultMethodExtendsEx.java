package ch08.sec10;

public class DefaultMethodExtendsEx {

	public static void main(String[] args) {
		// �͸� ���� ��ü�� �����ؼ� �������̽� ������ ����
		ChildInterface1 ci1 = new ChildInterface1() {
			// ������
			@Override
			public void method1() {
				System.out.println("ChildInterface1���� �����ǵ� method1() ����");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface1���� �����ǵ� method3() ����");
				
			}
			
			// ����Ʈ �޼ҵ�� ���������� �ʾ���
			
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		// ChildInterface2���� �����ǵ� method1() ����
		
		System.out.println("------------------------------------------------");
		
		// �͸� ���� ��ü�� �����ؼ� �������̽� ������ ����
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("ChildInterface2���� �����ǵ� method1() ����");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2���� �����ǵ� method3() ����");
				
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		
		
		
		System.out.println("------------------------------------------------");
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ChildInterface3���� �����ǵ� method1() ����");	
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3���� �����ǵ� method2() ����");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2���� �����ǵ� method3() ����");
				
			}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		
	}
}
