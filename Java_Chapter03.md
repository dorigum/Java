# Chapter 03 : 연산자

## Section 03

#### IncreaseOperator.java

```java
package ch03.sec03;

// 증감 연산자 : ++, --
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
		
		z = x++; // 먼저 x값을 z에 저장한 후에, x값 증가
		System.out.println("z=" + z); // z=12
		System.out.println("x=" + x); // x=13
		
		// 증감 연산자가 변수 뒤에 있으면 다른 연산자 먼저 처리한 후 증감 연산자 처리
		z = ++x + y++;
		System.out.println("z=" + z); // z=14+8=22
		System.out.println("x=" + x); // x=14
		System.out.println("y=" + y); // y=9

		
	}

}

```

## Section 03

#### ArithmeticOperator.java

```java
package ch03.sec04;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println("곱셈 : " + (num1 * num2));
		System.out.println("나눗셈 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));

		
		//float average = 88.333336f;
		
		//DecimalFormat df = new DecimalFormat("0.00");
		
		//System.out.println("평균 : " + df.format(average));
		
		sc.close();

	}

}

```



#### ArithmeticOperatorEx.java

```java
package ch03.sec04;

import java.util.Scanner;

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		float average;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		average = total / 3f; // 또는 3.0f
		
		
		System.out.println("-----------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);

		sc.close();
		
		
	}

}

```



#### AssignmentOperator.java

```java
package ch03.sec04;

// 누적 대입 연산자
// 정해진 연산을 수행한 후, 결과를 변수에 저장
// a = a + 10 --> a += 10

public class AssignmentOperator {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);

		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);

		result %= 3;
		System.out.println("result = " + result);


	}

}

```



#### BitLogicExample.java

```java
package ch03.sec04;

// 비트 연산자 : &, |, ^, ~
public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));

	}

}

```



#### BitShiftExample.java

```java
package ch03.sec04;

// 비트 연산자

public class BitShiftExample {

	public static void main(String[] args) {
		// 1을 왼쪽으로 3비트 이동
		// 왼쪽 3비트는 밀려서 버려지고, 오른쪽은 0으로 채운다.
		System.out.println("1 << 3 = " + (1 << 3));
		
		// 8을 오른쪽으로 3비트 이동
		// 오른쪽 3비트는 밀려서 버려지고, 왼쪽은 최상위 부호 비트 값으로 채운다.
		System.out.println("8 >> 3 = " + (8 >> 3));
		
		// >>> : -8을 오른쪽으로 3비트 이동
		// 오른쪽 3비트는 밀려서 버려지고, 왼쪽은 무조건 0으로 채운다.
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));

	}

}

```



#### CompareOperator1.java

```java
package ch03.sec04;

// 비교 연산자

public class CompareOperator1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
		System.out.println("result3 :" + result3);

		char ch1 = 'a';
		char ch2 = 'b';
		
		boolean result4 = (ch1 < ch2);
		System.out.println("result4 :" + result4);
		
		System.out.println("A값 :" + (int)ch1); // 65
		System.out.println("B값 :" + (int)ch2); // 66

		//대문자 A는 65부터 시작
		//소문자 a는 97부터 시작
		
	}

}

```



#### CompareOperator2.java

```java
package ch03.sec04;

import java.util.Scanner;

// 비교 연산자
// 문자열 비교 : equals() 메소드 사용

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";
		String userPass;
		
		System.out.print("비밀번호 입력 : ");
		userPass = sc.next();
		
		// 문자열 비교
		// == 사용하지 않고 equals() 메소드 사용
		
		if(pass.contentEquals(userPass))
			System.out.print("PASS");
		else
			System.out.print("NO PASS");
		
		sc.close();

	}

}

```



#### ConditionalOperator.java

```java
package ch03.sec04;

// 3항 연산자
// 조건식 ? 조건식이 참일 때 : 조건식이 거짓일 때

public class ConditionalOperator {

	public static void main(String[] args) {
		int score = 75;
		char grade = (score > 90 ) ? 'A' : 'B';

		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}

```



#### LogicalOperator.java

```java
package ch03.sec04;

// 논리 연산자
// &&, & (AND)
// ||, | (OR)
// ! (NOT)

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 49; // 65
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");
		}
	
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		// "2 또는 3의 배수 이군요"
		// 2의 배수 : 2로 나눈 나머지가 0인 수
		// 3의 배수 : 3으로 나눈 나머지가 0인 수
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
			
		}
	}
}

```



#### TimeCalculation.java

```java
package ch03.sec04;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		int time, seconds, minutes, hours;
		Scanner s = new Scanner(System.in);
		
		System.out.print("시간 입력 (초) : ");
		time = s.nextInt();
		
		hours = time / 3600;
		minutes = time % 3600 / 60;
		seconds = time % 3600 % 60;
		//seconds = time % 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hours + "시간, ");
		System.out.print(minutes + "분, ");
		System.out.print(seconds + "초 입니다. ");
		
		s.close();
		
	}

}

```

