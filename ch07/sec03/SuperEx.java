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
		//this.x : �ڽ��� Ŭ���� �� ��ü �ڽ� �ʵ� x
		System.out.println("this.x : " + this.x);
		
		// super.x : �θ� Ŭ������ ��� �ʵ� x
		System.out.println("super.x : " + super.x);
		
	}
	
}



public class SuperEx {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.show();
	}

}
