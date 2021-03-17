# Chapter 06

### Section 01

#### Car.java

```java
package ch06.sec01;

public class Car {
	// 클래스의 멤버 필드 = 데이터
	private String carNo;
	private String carName;
	private String carMaker;
	private String carYear;
	private String carCC;
	
	public void setCarNo(String no) {
		carNo = no;
	}
	
	// 클래스의 멤버 메소드 : 작업 처리(기능)
	public void showCarInfo() {
		System.out.println("차량 번호 : " + carNo);
	}
}

```



#### CarEx.java

```
package ch06.sec01;

public class CarEx {

	public static void main(String[] args) {
		// Car 클래스의 객체 생성
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		// 인스턴스(객체) : 필드에 값 저장
		// 객체.필드
		//c1.carNo = "11가 1234";
		// 메소드를 호출 : 필드 값을 출력
		// 객체.메소드()
		
		c1.setCarNo("11가 1234");
		c1.showCarInfo();
		
		//c2.carNo = "22가 5678";
		c2.setCarNo("22가 5678");
		c2.showCarInfo();
		
		//c3.carNo = "33가 1111";
		c3.setCarNo("33가 1111");
		c3.showCarInfo();

	}

}

```

