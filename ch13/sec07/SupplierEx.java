package ch13.sec07;

import java.util.function.IntSupplier;

// Supplier �Լ��� �������̽�
// �Ű����� ���� ���ϰ��� �ִ� �߻� �޼ҵ带 ����

public class SupplierEx {

	public static void main(String[] args) {
		// int���� �����ϴ� ���ٽ�
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
			
		};

		// �߻� �޼ҵ� ȣ���ؼ� ����� ����
		int num = intSupplier.getAsInt();
		System.out.println(num);
		
	}

}
