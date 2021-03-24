package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		// 생성자를 private로 막아 놓았기 때문에 not visible 오류
		// Singleton obj1 = new Singleton();
		
		// 외부에 공개된
		// static 메소드인 getInstance() 호출해서
		// 객체를 반환
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
