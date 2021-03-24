package javaExample.ch07Ex;

public class Child2 extends Parent2 {
	private String name;
	
	public Child2() {
		this("ȫ�浿");
		System.out.println("Child2() call");
	}
	
	public Child2(String name) {
		this.name = name;
		System.out.println("Child2(String name) call");
	}

}
