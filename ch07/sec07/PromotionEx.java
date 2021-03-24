package ch07.sec07;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}


// A -> B -> D
// A -> C -> E
public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �θ� Ŭ���� Ÿ�� ���� = �ڽ� ��ü
		A a1 = b; // AŸ�� ������ b ��ü ����(�ڵ� Ÿ�� ��ȯ)
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// ������ ���� : ��� ���迡 ���� �ʱ� ����
		/*B b3 = e; // Ÿ�� ����ġ ���� �߻�
		C c2 = d;*/

	}

}
