package ch10.sec01;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
			
			String data11 = "100";
			String data22 = "a100";
			
			int value1 = Integer.parseInt(data11);
			int value2 = Integer.parseInt(data22);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위가 벗어난 예외는 여기서 처리하겠습니다.");
		}
		
		catch (NumberFormatException e) {
			System.out.println("숫자 형식이 잘못돼서 발생한 예외는 여기서 처리하겠습니다.");
		}

	}

}
