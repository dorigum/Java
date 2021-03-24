package ch03.sec04;

// 비트 연산자

public class BitShiftExample {

	public static void main(String[] args) {
		// 1을 왼쪽으로 3비트 이동
		// 왼쪽 3비트는 밀려서 버려지고, 오른쪽은 0으로 채운다.
		System.out.println("1 << 3 = " + (1 << 3));
		
		// 8을 오른쪽으로 3비트 이동
		// 오른쪽 3비트는 밀려서 버려지고, 왼쪽은 최상위 부호 비트 값으로 채운다.
		System.out.println("8 >> 3 = " + (8 >> 3));
		
		// >>> : -8을 오른쪽으로 3비트 이동
		// 오른쪽 3비트는 밀려서 버려지고, 왼쪽은 무조건 0으로 채운다.
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));

	}

}
