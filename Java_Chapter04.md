# Chapter 04 : 조건문과 반복문

## 4.1 코드 실행 흐름 제어

### Section 02

#### IfElse.java

```
package ch04.sec02;

// if ~ else 문

public class IfElse {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A 입니다.");
		}
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}

	}

}

```



#### IfElseEx1.java

```
package ch04.sec02;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 1)
			System.out.println("홀수");
		
		else
			System.out.println("짝수");

		sc.close();
	}

}

```

#### IfNested.java

```
package ch04.sec02;

import java.util.Scanner;

// 중첩 if문 : if문 블록 안에 또다른 if문 포함

public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.print("번호 입력 (1. 현금 2. 카드) :");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			// 제대로 입력한 경우
			System.out.print("지불액 입력 :");
			pay = sc.nextInt();
			
			if(num == 1) {
				System.out.println("할인액 10%");
				System.out.println("할인액 :" + (int) (pay * 0.1) + " 원");
				//System.out.println("할인액 :" + (int) (pay / 10) + " 원");
			} else {
				System.out.println("할인액 5%");
				System.out.println("할인액 :" + (int) (pay / 20) + " 원");
			}
			
		} else { // 잘못 입력한 경우
			System.out.println("잘못 입력하였습니다. 종료합니다.");
			}

	}

}

```

#### IfNestedEx.java

```
// 9일 오전에 풀이!!!

package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item, itemcount;
		
		item = sc.nextInt();
		
		if(item == 1) {
			System.out.println("******상품 정보******");
			System.out.println(item + "노트북 : " + "1,200,000원");
		}
		
		else if(item == 2) {
			System.out.println("******상품 정보******");
			System.out.println(item + "디지털카메라 : " + "400,000원");
			System.out.println("***************");
		}
		else {
			System.out.println("잘못 입력하셨습니다. 종료합니다.");
		}

	}

}

```

#### IfNestedExx.java(아마 연습용?)

```
package ch04.sec02;

import java.util.Scanner;

public class IfNestedExx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, qty, price, amount, discount, total;
		String product;
		
		System.out.println("********상품정보*******");
		System.out.println("1. 노트북 : 1,200,000");
		System.out.println("2. 디지털카메라 : 400,000");
		System.out.println("*********************");
	}

}

```



#### MultipleIfElse.java

```
package ch04.sec02;

import java.util.Scanner;

// 다중 if ~ else 문 : 조건식이 여러 개인 경우

public class MultipleIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("점수 입력 (0~100) : ");
		int score = sc.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("성적 : " + grade);
		
		sc.close();

	}

}

```



#### MultipleIfElseEx.java

```
package ch04.sec02;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		
		System.out.print("숫자1 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("숫자3 입력 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
			max = num1;
		else if (num2 > num3)
			max = num2;
		else
			max = num3;
		
		System.out.print("가장 큰 수 : " + max);
		
		sc.close();

	}

}

```



#### Switch.java

```
package ch04.sec02;

// switch문
// 주의!!
// 수식으로는 값의 결과가 정수, 문자열, 문자 값이어야 한다.
// case 뒤의 value는 반드시 하나의 값만 사용(범위 1~10는 올수 없음)
// case 다음에는 콜론(:)사용 (세미콜론(;)아님)
// break문이 없는 경우에는 해당 case에서 실행이 멈추지 않고 다음 case까지 수행된다.


import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("학년 입력 : ");
		year= sc.nextInt();
		
		switch(year) { //year : 정수값
		case 1:System.out.println("1학년"); break;
		case 2:System.out.println("2학년"); break;
		case 3:System.out.println("3학년"); break;
		case 4:System.out.println("4학년"); break;
		
		default : System.out.println("잘못 입력하였습니다."); break;
		}
		
		sc.close();

	}

}

```



#### SwitchEx.java

```
package ch04.sec02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("점수 입력(0~100) : ");
		score = sc.nextInt();
		
		switch(score / 10) {
		
		case 10:	
		case 9: grade='A'; break;
		case 8: grade='A'; break;
		case 7: grade='A'; break;
		case 6: grade='A'; break;
		
		default:
			System.out.println("F");
		
			}
		
		}

}

```



#### SwitchString.java

```
package ch04.sec02;

public class SwitchString {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) { // position : (문자열)
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만원");

		}

	}

}

```



### Seciton 03

#### Break1.java

```java
package ch04.sec03;

// break문
// 반복문 하나를 빠져 나갈 때 사용
// 자신이 속한 가장 가까운 하나의 반복문만 벗어난다.

public class Break1 {

	public static void main(String[] args) {
		int i=0;
		
		while(true) { // 조건이 true이므로 무한 반복
			// 반복문을 중단 시킬 문장이 반드시 있어야 한다.
			i+=3;		// 3씩 증가
			if(i>20) 	// 20보다 크면
				break;	// 반복문 종료
			
			System.out.println(i);
			
		}

	}

}

```



#### Break2.java

```java
package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		// 반복문에 이름(라벨)을 붙이고 break 이름;
		// break;
		// break Outter;
		// break문 2개 사용
		
		Outter:for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter; // 안쪽 반복문 종료
				}
				
				if(upper=='K') {
					break Outter; // 바깥쪽 반복문까지 종료
				}
			}
		System.out.println("프로그램 실행 종료");
		
		// 바깥쪽 반복문까지 종료
		// 반복문에 이름(라벨)을 붙이고 break 이름;
		/* Outter:for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter; // 바깥쪽 반복문까지 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료"); */
		
		
		
		
		
		
		// 안의 for문만 종료
		/*for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break; // 안의 for문만 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료");*/
		}

	}
}

```



#### BreakEx.java

```java
package ch04.sec03;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdrawal, balance=100000;
		
		System.out.println("현재 잔액 : " + balance);
		
		while(true) {
			System.out.println("인출액 입력 : ");
			withdrawal = sc.nextInt();
		
			
		if(withdrawal<=balance)
			balance=sc.nextInt();
		else {
			System.out.println("잔액 부족. 현재 잔액 : " + balance);
			break;
		}
		
		}
		
		sc.close();

	}

}

```



#### Continue.java

```java
package ch04.sec03;

// continue문
// 수행 중인 문장은 중단하고, 다음 반복 계속 수행

public class Continue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2!=0) { // i값이 홀수면 출력하지 않고, 다음 반복 계속
				continue;
			}
			System.out.println(i);
		}
	}

}

```



#### DoWhile1.java

```java
package ch04.sec03;

import java.util.Scanner;

// do~while문
// 조건에 따라 계속할 지 결정할 때 사용 (while문과 동일)
// 무조건 한번은 수행된다.

public class DoWhile1 {

	public static void main(String[] args) {
		// 반복해서 숫자 입력
		// 0 입력하면 반복문 종료
		// 입력한 숫자 총합 출력
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num;
		} while(num!=0);
			
			System.out.println("0 입력. 반복 종료");
			System.out.println("입력한 숫자 종합 : " + sum);
		
			sc.close();
		}

}

```



#### Dowhile2.java

```java
package ch04.sec03;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		
		do {
			System.out.println("\n1~4 번호 입력 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("Java 프로그래밍"); break;
			case 2 : System.out.println("데이터베이스"); break;
			case 3 : System.out.println("빅데이터 분석"); break;
			case 4 : System.out.println("AI"); break;
			default : System.out.print("잘못 입력하였습니다.");
		}
		
			System.out.print("\n계속 입력하시겠습니까? (y/n 입력) : ");
			answer = sc.next();
		}	
		
			while(answer.contentEquals("y")); // 5가 아니면 반복

			System.out.print("종료합니다.");
			sc.close();

		}

}

```



#### For.java

```java
package ch04.sec03;

// for문
// for(초기식; 조건식; 증감식) { ... }
// 반복 횟수를 알고 있을 때 주로 사용

public class For {

	public static void main(String[] args) {
		// for문에서 선언된 변수 (int i)는 for문에서만 사용 가능
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int sum = 0; // 반드시 값을 0으로 초기화하고 사용
		int i; // for문 밖에서 선언되었기 때문에
		// main()에서 사용 가능
		// 아래 for문에서도 사용 가능
		
		// 1~100까지의 합 구하기
		// 1부터 100까지 1씩 증가하면서 sum에 더해져서 저장된다.
		// 조건에서 i가 100이 되면 true이므로 문장을 수행
		// 그리고 1즈악 : 101이 되면 조건에 맞지 않으므로 반복문 종료
		// 반복문을 수행하고 난 후의 i값은 101
		
		for(i=1; i<=100; i++) {	// i는 for문 밖에서 선언된 변수이므로 사용 가능
			//sum = sum + i;
			sum += i;
		}

		// i는 for문 밖에서 선언된 변수이므로 사용 가능
		System.out.println("1~"+(i-1)+" 합 :" + sum);
	}

}

```



#### ForEx1.java

```java
package ch04.sec03;

public class ForEx1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for (i=1; i<=10; i+=2) { // i=i+2 (2씩 증가)
			System.out.println(i);
			sum += i;

		}
		
		System.out.println("1~" + (i-1)+ "홀수의 합 : " + sum);
			
	}

}

```



#### ForEx2.java

```java
package ch04.sec03;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gop;
		
		System.out.print("단 수 입력 : ");
		gop = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			
			sc.close();
			
		}

	}

}

```



#### ForEx3.java

```java
package ch04.sec03;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, sum=0;
		
		System.out.print("Start 입력 : ");
		start = sc.nextInt();
		
		System.out.print("End 입력 : ");
		end = sc.nextInt();
		
		for(int i=start; i<=end; i++)
			sum += i;
		
		System.out.print(start + "~" + end + "의 합 : " + sum);
		
		sc.close();
		
	}

}

```



#### ForEx4.java

```java
package ch04.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int jjak=0, hol=0, zero=0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("숫자" + i + " 입력 : ");
			num = sc.nextInt();
			if(num>0)
				jjak++;
			else if(num<0)
				hol++;
			else
				zero++;
		}
		
		System.out.println("\n양의 개수 : " + jjak);
		System.out.println("음의 개수 : " + hol);
		System.out.println("0의 개수 : " + zero);
		
		
		sc.close();

	}

}

```



#### ForEx5.java

```java
package ch04.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		float average;
		
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		for(int i=1; i <= num; i++) {
		System.out.print("학생" + i + " 점수 입력 : ");
		score = sc.nextInt();
		sum+=score;
		}
		
		average=sum/(float)num;
		
		System.out.println("평균 : " + average);
		
		sc.close();
		
	}

}

```



#### ForNested.java

```java
package ch04.sec03;

public class ForNested {

	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("---" + m + "단 ---");
			
			for(int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
			
		}

	}

}

```



#### ForNestedEx.java

```java
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
```



#### RandomNum1.java

```java
package ch04.sec03;

// 랜덤 숫자 생성
// (1) Math.random() 사용
// (2) Random 클래스 사용

public class RandomNum1 {

	public static void main(String[] args) {
		// (1) Math.random() 사용
		for (int i = 1; i <= 10; i++) {
			// 1. 0 < 랜덤 숫자 < 1
			// double num = Math.random();

			// 2. 정수 부분 값 존재
			// double num = Math.random()*10;

			// 3. 0부터 시작해서 10개의 정수 : 0~9 숫자 출력
			//int num = (int)(Math.random() * 10);
			
			// 4. 1~10 사이의 정수 출력
			int num = (int)(Math.random() * 10) + 1;
			
			System.out.println(num);

		}

	}

}

```



#### RandomNum2.java

```java
package ch04.sec03;

import java.util.Random;

// Random 클래스 사용

public class RandomNum2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=1; i<=10; i++) {
			int num = r.nextInt(10) + 2 ;
			
			System.out.println(num);
			
		}

	}

}

```



#### While1.java

```java
package ch04.sec03;

// while문
// 조건에 따라 반복을 계속할 지 결정할 때 사용
// 조건식이 true일 경우 계속해서 반복
// 주의 : 초기값과 증감식을 반드시 적는다!

public class While1 {

	public static void main(String[] args) {
		int i=1; // 초기값
		while(i<=10) { // 조건
			//반복 수행되는 문장
			System.out.println(i);
			
			//증감식
			i++;
			
		}

		// while문 종료 후 i값 출력
		System.out.println("i=" + i);
	}

}

```



#### While2.java

```java
package ch04.sec03;

import java.util.Scanner;

// 숫자 입력 반복
// 7 입력 종료

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		System.out.print("숫자 입력");
		i = sc.nextInt();
		
		while(i!=7) {
			
		}
		
		System.out.println("입력 종료");
		
	}

}

```



#### WhileEx1.java

```java
package ch04.sec03;

public class WhileEx1 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		
		while(i<=100) {
			sum += i;
			i += 2;
		}

		System.out.println("1~" + (i-2) + "짝수의 합 : " + sum);
	
	}

}

```



#### WhileEx2.java

```java
package ch04.sec03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		int i=1;
		float average;
		
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		while(i <= num) {
		System.out.print("학생" + i + " 점수 입력 : ");
		score = sc.nextInt();
		sum+=score;
		i++;
		
		}
		
		average=sum/(float)num;
		
		System.out.println("평균 : " + average);
		
		sc.close();
		
	}

}

```

