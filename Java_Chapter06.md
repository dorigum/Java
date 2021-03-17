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

```java
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



#### Product.java

```java
// 구도연

package ch06.sec01;

import java.util.Scanner;

public class Product {
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	public void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****상품 정보 입력*****");
		
		System.out.print("상품명 : ");
		prdName = sc.next();
		
		System.out.print("가격 : ");
		prdPrice = sc.nextInt();
		
		System.out.print("판매 수량 : ");
		prdSold = sc.nextInt();
		
		System.out.print("재고 수량 : ");
		prdStock = sc.nextInt();
		
		sc.close();
		
	}
	
	public void showPrdInfo() {
		System.out.println("\n*****상품 정보 출력*****");
		
		System.out.println("상품명 : " + prdName);
		System.out.println("가격 : " + prdPrice);
		System.out.println("판매 수량 : " + prdSold);
		System.out.println("재고 수량 : " + prdStock);
		
		
		System.out.println("재고액 : " + prdStock);
		
	}
	
	public void salesAmount() {
		System.out.println("매출액 : " + (prdPrice*prdSold));
	}
	
	public void stockAmount() {
		System.out.println("재고액 : " + (prdPrice*prdStock));
	}
	
}


```



#### ProductEx.java

```java
// 구도연

package ch06.sec01;

public class ProductEx {
	public static void main(String[] args) {
		Product prd = new Product();
		
		prd.inputPrdInfo();
		prd.showPrdInfo();
		prd.salesAmount();
		prd.stockAmount();
		
	}
}

```



#### Rectangle.java

```java
package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
		// 필드
		int width;
		int height;

		// 메소드
		public void input() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로 길이 입력 : ");
			width = sc.nextInt();
			
			System.out.print("세로 길이 입력 : ");
			height = sc.nextInt();
			
			sc.close();
		}
		
		public void area() {
			System.out.println("사각형의 면적 : " + (width*height));
			
		}

}

```



#### RectangleEx.java

```java
package ch06.sec01;

public class RectangleEx {

	public static void main(String[] args) {
		// 인스턴스 객체 rec 생성
		Rectangle rec = new Rectangle();
		
		// input() 메소드 호출
		rec.input();
		
		// area() 메소드 호출
		rec.area();
		
	}

}
  
```



#### Student.java

```java

package ch06.sec01;

import java.util.Scanner;

public class Student {
	
	String stdNo;
	String stdName;
	int year;
	int score;

	public void inputStdInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****학생 정보 입력*****");
		
		System.out.print("학번 : ");
		stdNo = sc.next();
		
		System.out.print("성명 : ");
		stdName = sc.next();
		
		System.out.print("학년 : ");
		year = sc.nextInt();
		
		System.out.print("점수 : ");
		score = sc.nextInt();
		
		sc.close();
		
	}
	
	public void showStdInfo() {
		System.out.println("\n*****학생 정보 출력*****");
		
		System.out.println("학번 : " + stdNo);
		System.out.println("성명 : " + stdName);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
		
	}

}

```



#### StudentEx.java

```java
package ch06.sec01;

public class StudentEx {
	public static void main(String[] args) {
		Student std = new Student();
		
		std.inputStdInfo();
		std.showStdInfo();
		
	}

}

```

