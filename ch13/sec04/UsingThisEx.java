package ch13.sec04;

public class UsingThisEx {

	public static void main(String[] args) {
		// �ٱ� Ŭ���� ��ü ����
		UsingThis usingThis = new UsingThis();
		
		// ��ø Ŭ���� Inner Ŭ���� ��ü ����
		UsingThis.Inner inner = usingThis.new Inner();
		// method() ȣ��
		inner.method();

	}

}
