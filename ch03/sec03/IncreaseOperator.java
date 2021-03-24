package ch03.sec03;

// 증감 연산자 : ++, --
public class IncreaseOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x); // x=12
		
		y--;
		--y;
		System.out.println("y=" + y); // y=8
		
		z = x++; // 먼저 x값을 z에 저장한 후에, x값 증가
		System.out.println("z=" + z); // z=12
		System.out.println("x=" + x); // x=13
		
		// 증감 연산자가 변수 뒤에 있으면 다른 연산자 먼저 처리한 후 증감 연산자 처리
		z = ++x + y++;
		System.out.println("z=" + z); // z=14+8=22
		System.out.println("x=" + x); // x=14
		System.out.println("y=" + y); // y=9

		
	}

}
