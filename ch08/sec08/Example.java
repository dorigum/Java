package ch08.sec08;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;	// �ڵ� Ÿ�� ��ȯ
		// InterfaceA Ÿ���̹Ƿ� InterfaceA ����� ��밡��
		ia.methodA();	// InterfaceA�� ��� methodA()�� ȣ�� ����
		System.out.println("---------------------------------");
		
		InterfaceB ib = impl;
		ib.methodB();	// InterfaceB�� ��� methodB()�� ȣ�� ����
		System.out.println("---------------------------------");
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC�� �ڱ� ��� methodA()�Ӹ� �ƴ϶�
		ic.methodB();	// ��� ���� methodB()�� methodC()�� ��� ȣ�� ����
		ic.methodC();
		
	}

}
