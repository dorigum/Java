package ch05.sec02;

// �迭 ���� : for�� �̿��ؼ� �迭 ����
// ������� ���� ���Ҵ� �⺻ �ʱⰪ ����

public class ArrayCopy1 {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		// for�� �̿��ؼ� �迭 ����
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
	}

}
