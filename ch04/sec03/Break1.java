package ch04.sec03;

// break문
// 반복문 하나를 빠져 나갈 때 사용
// 자신이 속한 가장 가까운 하나의 반복문만 벗어난다.

public class Break1 {

	public static void main(String[] args) {
		int i=0;
		
		while(true) { // 조건이 true이므로 무한 반복
			// 반복문을 중단 시킬 문장이 반드시 있어야 한다.
			i+=3;		// 3씩 증가
			if(i>20) 	// 20보다 크면
				break;	// 반복문 종료
			
			System.out.println(i);
			
		}

	}

}
