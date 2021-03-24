package ch04.sec03;

import java.util.Random;

// Random 클래스 사용

public class RandomNum2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10) + 2 ;
			
			System.out.println(num);
			
		}

	}

}
