package ch05.sec02;

public class Array1 {

	public static void main(String[] args) {
		int[] a; // �迭 ����. ���� �޸� �Ҵ� ����
		a = new int[3]; // �޸� �Ҵ�
		
		// �迭 a�� �� ���ҿ� �� ����
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("----------------");
		
		// �迭 ��ü ���� ��� : for�� ���
		// �迭 �� ������ �� ���
		// ����=���=�׸� : ���� ǥ��
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}

	}

}
