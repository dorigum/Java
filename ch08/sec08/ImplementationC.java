package ch08.sec08;

public class ImplementationC implements InterfaceC {
	// InterfaceC�� InterfaceA�� InterfacaB�� ��� �޾����Ƿ�
	// InterfaceA�� InterfaceB�� �߻� �޼ҵ带 �������ؼ� ��ü �޼ҵ�� �����ؾ� �Ѵ�. 
	// �������� ������ ����
	
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA");

	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC");

	}

}
