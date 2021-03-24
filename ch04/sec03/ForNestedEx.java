package ch04.sec03;

public class ForNestedEx {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan * n) + '\t');

				System.out.println();

			}
		}
	}
}