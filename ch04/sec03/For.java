package ch04.sec03;

// for문
// for(초기식; 조건식; 증감식) { ... }
// 반복 횟수를 알고 있을 때 주로 사용

public class For {

	public static void main(String[] args) {
		// for문에서 선언된 변수 (int i)는 for문에서만 사용 가능
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int sum = 0; // 반드시 값을 0으로 초기화하고 사용
		int i; // for문 밖에서 선언되었기 때문에
		// main()에서 사용 가능
		// 아래 for문에서도 사용 가능
		
		// 1~100까지의 합 구하기
		// 1부터 100까지 1씩 증가하면서 sum에 더해져서 저장된다.
		// 조건에서 i가 100이 되면 true이므로 문장을 수행
		// 그리고 1즈악 : 101이 되면 조건에 맞지 않으므로 반복문 종료
		// 반복문을 수행하고 난 후의 i값은 101
		
		for(i=1; i<=100; i++) {	// i는 for문 밖에서 선언된 변수이므로 사용 가능
			//sum = sum + i;
			sum += i;
		}

		// i는 for문 밖에서 선언된 변수이므로 사용 가능
		System.out.println("1~"+(i-1)+" 합 :" + sum);
	}

}
