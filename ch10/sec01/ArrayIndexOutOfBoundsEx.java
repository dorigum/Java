package ch10.sec01;

// 배열에서 인덱스 범위 초과한 경우 발생되는 예외
public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		if(args.length ==2 ) {
		String data1 = args[0];
		String data2 = args[1];

		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsEx");
			System.out.println("값1 값2");
		}
		
		// main() 메소드의 args에 전달되는 값이 없어서 발생하는 오류
		// args에 값 설정하는 방법 : Run/Run Configuration창에서 Arguments 탭에 입력
		
	}

}
