package javaExample.ch07Ex;

public class Parent2 {
	// 7장_6번
	public String nation;

	public Parent2() {
		this("대한민국");
		System.out.println("Parent2() call");
		// 두번째로 출력
	}

	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent2(String nation) call");
		// 첫번째로 출력
		// 위의 this("대한민국")으로 이동
	}
}
