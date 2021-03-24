package ch07.sec03;

class SuperClass{
	int x;
	
	public SuperClass() {
		x = 5;
	}
}

class SubClass extends SuperClass{
	int x;
	
	public SubClass() {
		x = 10;
	}
	
	public void show() {
		//this.x : 자신의 클래스 내 객체 자신 필드 x
		System.out.println("this.x : " + this.x);
		
		// super.x : 부모 클래스의 멤버 필드 x
		System.out.println("super.x : " + super.x);
		
	}
	
}



public class SuperEx {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.show();
	}

}
