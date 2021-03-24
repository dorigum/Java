package ch08.sec08;

public class ImplementationC implements InterfaceC {
	// InterfaceC는 InterfaceA와 InterfacaB를 상속 받았으므로
	// InterfaceA와 InterfaceB의 추상 메소드를 재정의해서 실체 메소드로 구현해야 한다. 
	// 구현하지 않으면 오류
	
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
