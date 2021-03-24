package ch05.sec02;

public class Array2D {

	public static void main(String[] args) {
		// 3행 4열의 2차원 배열 선언 및 초기화
		int[][] a = { {1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12} };
		
		System.out.println("2차원 배열 a의 원소 값 출력");
		for(int i=0; i<a.length; i++) { // 행
			for(int j=0; j<a[i].length; j++) { //열
				System.out.print("a[" + i + "]" + "[" + j + "] : " + a[i][j]);
			
				System.out.println();
			}
		}
			
			// 2차원 테이블 형태로 원소 값 출력
			for(int i=0; i<a.length; i++) { // 행
				for(int j=0; j<a[i].length; j++) { //열
					System.out.print(a[i][j] + '\t');
				
					System.out.println();
			}	
		}
}
}