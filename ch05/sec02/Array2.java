package ch05.sec02;

public class Array2 {

	public static void main(String[] args) {
		// 선언과 동시에 메모리 할당
		int[] b = new int[5];
		// 초기화 리스트
		// 선언 + 메모리 할당 + 값 저장
		
		String[] flower = {"해바라기", "장미", "진달래"};
		
		// for문을 사용해서 배열 b의 각 원소에 값 저장
		// 0, 1, 2, 3, 4
		for(int i=0; i<b.length; i++)
			b[i]=i;
		
		
		// 배열 b의 각 원소의 값 출력
		// b[0] = 0
		for(int i=0; i<b.length; i++)
		System.out.println("b[" + i + "] = " + b[i]);
		

		// 배열 flower의 각 원소의 값 출력
		// flower[0] = 해바라기
		for(int i=0; i<flower.length; i++)
			System.out.println("flower[" + i + "] = " + flower[i]);


		// 각 배열의 크기 출력 : length
		System.out.println("배열 b의 크기 : " + b.length);
		System.out.println("배열 flower의 크기 : " + flower.length);
		
	}

}
