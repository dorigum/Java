package ch04.sec03;

public class ForEx1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for (i=1; i<=10; i+=2) { // i=i+2 (2�� ����)
			System.out.println(i);
			sum += i;

		}
		
		System.out.println("1~" + (i-1)+ "Ȧ���� �� : " + sum);
			
	}

}
