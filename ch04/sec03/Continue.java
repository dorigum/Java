package ch04.sec03;

// continue문
// 수행 중인 문장은 중단하고, 다음 반복 계속 수행

public class Continue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2!=0) { // i값이 홀수면 출력하지 않고, 다음 반복 계속
				continue;
			}
			System.out.println(i);
		}
	}

}
