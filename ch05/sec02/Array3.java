package ch05.sec02;

// 배열 초기값 : 메모리 할당 받을 때 자료형의 기본값으로 초기화
// 정수 : 0
// 실수 : 0.0
// boolean : false
// 참조 타입 : null

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
