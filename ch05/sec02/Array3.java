package ch05.sec02;

// �迭 �ʱⰪ : �޸� �Ҵ� ���� �� �ڷ����� �⺻������ �ʱ�ȭ
// ���� : 0
// �Ǽ� : 0.0
// boolean : false
// ���� Ÿ�� : null

public class Array3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}

		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
		}

}
