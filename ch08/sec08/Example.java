package ch08.sec08;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;	// 자동 타입 변환
		// InterfaceA 타입이므로 InterfaceA 멤버만 사용가능
		ia.methodA();	// InterfaceA의 멤버 methodA()만 호출 가능
		System.out.println("---------------------------------");
		
		InterfaceB ib = impl;
		ib.methodB();	// InterfaceB의 멤버 methodB()만 호출 가능
		System.out.println("---------------------------------");
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC는 자기 멤버 methodA()뿐만 아니라
		ic.methodB();	// 상속 받은 methodB()와 methodC()를 모두 호출 가능
		ic.methodC();
		
	}

}
