package ch05.sec02;

public class Array2D {

	public static void main(String[] args) {
		// 3�� 4���� 2���� �迭 ���� �� �ʱ�ȭ
		int[][] a = { {1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12} };
		
		System.out.println("2���� �迭 a�� ���� �� ���");
		for(int i=0; i<a.length; i++) { // ��
			for(int j=0; j<a[i].length; j++) { //��
				System.out.print("a[" + i + "]" + "[" + j + "] : " + a[i][j]);
			
				System.out.println();
			}
		}
			
			// 2���� ���̺� ���·� ���� �� ���
			for(int i=0; i<a.length; i++) { // ��
				for(int j=0; j<a[i].length; j++) { //��
					System.out.print(a[i][j] + '\t');
				
					System.out.println();
			}	
		}
}
}