package ch05.sec02;

public class Array2 {

	public static void main(String[] args) {
		// ����� ���ÿ� �޸� �Ҵ�
		int[] b = new int[5];
		// �ʱ�ȭ ����Ʈ
		// ���� + �޸� �Ҵ� + �� ����
		
		String[] flower = {"�عٶ��", "���", "���޷�"};
		
		// for���� ����ؼ� �迭 b�� �� ���ҿ� �� ����
		// 0, 1, 2, 3, 4
		for(int i=0; i<b.length; i++)
			b[i]=i;
		
		
		// �迭 b�� �� ������ �� ���
		// b[0] = 0
		for(int i=0; i<b.length; i++)
		System.out.println("b[" + i + "] = " + b[i]);
		

		// �迭 flower�� �� ������ �� ���
		// flower[0] = �عٶ��
		for(int i=0; i<flower.length; i++)
			System.out.println("flower[" + i + "] = " + flower[i]);


		// �� �迭�� ũ�� ��� : length
		System.out.println("�迭 b�� ũ�� : " + b.length);
		System.out.println("�迭 flower�� ũ�� : " + flower.length);
		
	}

}
