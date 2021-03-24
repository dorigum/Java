package ch03.sec03;

// ���� ������ : ++, --
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
		
		z = x++; // ���� x���� z�� ������ �Ŀ�, x�� ����
		System.out.println("z=" + z); // z=12
		System.out.println("x=" + x); // x=13
		
		// ���� �����ڰ� ���� �ڿ� ������ �ٸ� ������ ���� ó���� �� ���� ������ ó��
		z = ++x + y++;
		System.out.println("z=" + z); // z=14+8=22
		System.out.println("x=" + x); // x=14
		System.out.println("y=" + y); // y=9

		
	}

}
