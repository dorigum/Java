# Chapter 02 : 변수와 타입

## 2.1 변수

### 2.1.1 변수(Variable)란?

> 변수는 하나의 값을 저장할 수 있는 메모리 공간이다.
>
> 변수에는 한 가지 타입의 값만 저장할 수 있다. (다양한 타입의 값을 저장할 수 없다.)
>
> ​	ex) 정수 타입 변수에는 정수값만 저장할 수 있다.



| 작성 규칙                                                    | 예시                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 첫번째 글자는 문자이거나 `$`, `_` 이어야 하고, 숫자로 시작할 수 없다. (필수) | 가능 : price, $price, _companyName<br />불가능 : 1v, @speed, $#value |
| 영어 대소문자가 구분된다. (필수)                             | firstname != firstName                                       |
| 첫 문자는 영어 소문자로 시작하되, 다른 언어가 붙을 경우 첫 문자를 대문자로 한다. (관례) | maxSpeed, firstName, carBodyColor                            |
| 문자 수(길이)의 제한은 없다.                                 |                                                              |
| 자바 예약어는 사용할 수 없다. (필수)                         | 아래 표 참조                                                 |



| 분류             | 예약어                                                       |
| ---------------- | ------------------------------------------------------------ |
| 기본 데이터 타입 | `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, `double` |
| 접근 지정자      | `private`, `protected`, `public`                             |
|                  |                                                              |
|                  |                                                              |



### 2.1.3 변수의 사용

* 정수 리터럴
* 실수 리터럴
* 문자 리터럴
* 문자열 리터럴
* 논리 리터럴

#### `Final.java`

```java
package ch02.sec01;

// 상수 : 정해진 값을 가지며, 프로그램 실행 중에 값이 변하지 않음
// final 키워드 사용
// 관례적으로 대문자로 선언

public class Final {
public static void main(String[] args) {
	final double PI = 3.14;
	double radius = 10;
	double circleArea = 0;
	
	circleArea = radius * radius * PI;
	
	System.out.println("원의 면적 : " + circleArea);

}

// System.out.println(); sys
}
```



#### Literal.java

```java
package ch02.sec01;

// 리터럴 : 변수에 저장되는 값
public class Literal {
	
	public static void main(String[] args) {
		int score = 95; // 정수 리터럴
		double average = 88.5; // 실수 리터럴
		char familyName = '김'; // 문자 리터럴
		String name = "홍길동"; // 문자열 리터럴
		boolean result = true; // 논리 리터럴
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(familyName);
		System.out.println(name);
		System.out.println(result);
		
	}

}

```



#### VariableExample.java

```java
package ch02.sec01;


// 변수 선언
// 변수에 값 저장
// 변수에 저장되어 있는 값 출력
public class VariableExample {
	
	public static void main(String[] args) {
		// 10을 value 변수에 초기값으로 해서 변수 선언
		int value = 10 ;
		
		System.out.println(value);
		
		// 변수 value 값을 읽어서 10을 더해서
		// 변수 result에 저장
		
		int result = value + 10 ;
		
		// 변수 result 값 출력
		System.out.println(result);
		
	}

}

```



## Section 02

#### DataType.java

```java
package ch02.sec02;
// 데이터 타입

public class DataType {

	public static void main(String[] args) {
		// 문자 타입 변수 선언 및 초기화
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("----------------------------");
		
		// 정수 타입 변수 선언 및 초기화
		int byteValue = 10;					// 1바이트 정수
		int shortValue = 1000;				// 2바이트 정수
		int intValue = 2100100100;			// 4바이트 정수
		long longValue = 100010001000100L;	// 8바이트 정수
		
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		System.out.println("----------------------------");

		// 실수 타입 변수 선언 및 초기화
		double doubleValue = 0.1234567890123456789; // 8바이트 실수(더 정밀함)
		float floatValue = 0.1234567890123456789f;	// 4바이트 실수 : f 안붙이면 오류
		
		System.out.println("doubleValue : " + doubleValue);
		System.out.println("floatValue : " + floatValue);

		System.out.println("----------------------------");

		// 지수 표현 : e 사용하기
		int var1 = 3000000;		
		double var2 = 3e6;		// 0이 6개
		float var3 = 3e6f;		// float이므로 f 붙임
		double var4 = 2e-3;		// -3 : 소수점 이하 3자리
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);

		System.out.println("----------------------------");

		//논리 타입 변수 선언 및 초기화
		boolean booleanValue = true;
		System.out.println("booleanValue : " + booleanValue);
		
		System.out.println("----------------------------");

		// String 타입(문자열) 변수 선언 및 초기화
		String name = "홍길동";
		System.out.println("name : " + name);
		

	}

}

```



#### VariableEX1.java

```java
package ch02.sec02;

public class VariableEX1 {
	
	public static void main(String[] args) {

		String name = "홍길동";
		String no = "2015001";
		int year = 4;
		char grade = 'A';
		float average = 93.5f;
		
		System.out.println("성명 : " + name);
		System.out.println("학번 : " + no);
		System.out.println("학년 : " + year);
		System.out.println("학점: " + grade);
		System.out.println("평균 : " + average);


	}

}

```



#### VariableEX2.java

```java
package ch02.sec02;

public class VariableEX2 {

	public static void main(String[] args) {
		
		String title = "자바 프로그래밍";
		String author = "홍길동";
		String year = "2018";
		String price = "30000";
		
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출간 : " + year + "년");
		System.out.println("정가 : " + price + "원");
		
	}

}

```



## Section 03

#### CastingExample.java

```java
package ch02.sec03;

// 강제 타입 변환(강제 형변환)
// 큰 크기의 타입을 작은 크기의 타입으로 강제로 변환하는 것

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);

	}

}
```



#### OperationPromotionExample.java

```java
package ch02.sec03;

// 연산식에서 자동 타입 변환
public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; // 컴파일 오류
		// 정수 연산일 경우 : int 타입이 기본(4 byte)
		// 4바이트보다 작은 타입 (byte, char, short)은
		// int타입으로 변환된 후 연산 수행
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// char타입 + char타입 : int타입
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // 컴파일 오류
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 : " + intValue2);
		System.out.println("출력문자 : " + (char)intValue2);

	}

```



#### PromotionExample.java

```java
package ch02.sec03;

// 자동 타입 변환 : 프로그램 실행 도중 자동적으로 타입 변환이 일어나는 것
// 작은 크기의 타입이 큰 크기의 타입에 저장될 때 발생

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드 : " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}

```



## Section 04

#### input.java

```java
package ch02.sec04;

import java.util.Scanner;

// 자동 import : Ctrl + Shift + O

// Scanner 클래스를 이용한 키 입력

public class input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = sc.nextInt(); // 입력한 값을 정수로 반환해서 num1에 저장
		// 지우기 System.out.println(num1);
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = sc.nextInt(); // 입력한 값을 정수로 반환해서 num2에 저장
		// 지우기 System.out.println(num2);

		// 두 수의 합 출력
		System.out.println("두 수의 합 : " + (num1 + num2));
		
		// 두 수의 곱 출력
		System.out.println("두 수의 곱 : " + (num1 * num2));

		
		sc.close(); // 리소스 낭비를 막기 위해 닫기
		
	}

}

```



#### InputEx.java

```java
package ch02.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String name;
		int year;
		float score;
		String grade;
		//char grade;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("학년 입력 : ");
		year = sc.nextInt();
		
		System.out.print("점수 입력 : ");
		score = sc.nextFloat();

		System.out.print("학점 입력 : ");
		grade = sc.next();
		//String g = sc.next();
		//grade = g.charAt(O); charAt(O) : 문자열에서 첫번째 문자 반환
		
		System.out.println("---------------------");
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);

		sc.close();
		
	}

}

```





