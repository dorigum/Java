package ch05.sec02;

public class Array1 {

	public static void main(String[] args) {
		int[] a; // 배열 선언. 아직 메모리 할당 없음
		a = new int[3]; // 메모리 할당
		
		// 배열 a의 각 원소에 값 저장
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("----------------");
		
		// 배열 전체 원소 출력 : for문 사용
		// 배열 각 원소의 값 출력
		// 원소=요소=항목 : 동일 표현
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}

	}

}
