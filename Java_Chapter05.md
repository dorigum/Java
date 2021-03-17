# Chapter 05 : 참조 타입

## 5.1 데이터 타입 분류

### Section 01

#### StringEquals.java

```java
package ch05.sec01;

// 문자열 비교 : equals() 메소드 사용
// 객체 참조 비교 : == 사용

public class StringEquals {

	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		
		// 동일한 객체를 참조하는지 조사
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		// 문자열이 같은지 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		
		
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		
		
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		// 문자열이 같은지 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		
	}

}

```



### Section 02

#### AdvancedFor.java

```java
package ch05.sec02;

// 향상된 for문 : 배열 및 컬렉션의 항목 요소를 순차적으로 처리
// 인덱스 사용하지 않고 바로 항목 요소(원소) 반복

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		// for(타입 변수 : 배열)
		for(int score:scores) {
			sum += score;
		}
		
		System.out.println("총점 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}

```



#### ArraryCopy2.java

```java
package ch05.sec02;

// 배열 복사 : System.arraycopy() 메소드 사용
// System.arraycopy(원본, 시작 인덱스, 대상, 시작 인덱스, 복사할 개수)

public class ArraryCopy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "Array", "Copy"};
		String[] newStrArray = new String[5]; // 기본값 null로 초기화
		
		// System.arraycopy() 메소드 사용 배열 복사
		// System.arraycopy(원본, 시작 인덱스, 대상, 시작 인덱스, 복사할 개수)
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + ",");

	}

}

```



#### Array1.java

```java
package ch05.sec02;

public class Array1 {

	public static void main(String[] args) {
		int[] a; // 배열 선언. 아직 메모리 할당 없음
		a = new int[3]; // 메모리 할당
		
		// 배열 a의 각 원소에 값 저장
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("----------------");
		
		// 배열 전체 원소 출력 : for문 사용
		// 배열 각 원소의 값 출력
		// 원소=요소=항목 : 동일 표현
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}

	}

}

```



#### Array2.java

```java
package ch05.sec02;

public class Array2 {

	public static void main(String[] args) {
		// 선언과 동시에 메모리 할당
		int[] b = new int[5];
		// 초기화 리스트
		// 선언 + 메모리 할당 + 값 저장
		
		String[] flower = {"해바라기", "장미", "진달래"};
		
		// for문을 사용해서 배열 b의 각 원소에 값 저장
		// 0, 1, 2, 3, 4
		for(int i=0; i<b.length; i++)
			b[i]=i;
		
		
		// 배열 b의 각 원소의 값 출력
		// b[0] = 0
		for(int i=0; i<b.length; i++)
		System.out.println("b[" + i + "] = " + b[i]);
		

		// 배열 flower의 각 원소의 값 출력
		// flower[0] = 해바라기
		for(int i=0; i<flower.length; i++)
			System.out.println("flower[" + i + "] = " + flower[i]);


		// 각 배열의 크기 출력 : length
		System.out.println("배열 b의 크기 : " + b.length);
		System.out.println("배열 flower의 크기 : " + flower.length);
		
	}

}

```



#### Array2D.java

```java
package ch05.sec02;

public class Array2D {

	public static void main(String[] args) {
		// 3행 4열의 2차원 배열 선언 및 초기화
		int[][] a = { {1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12} };
		
		System.out.println("2차원 배열 a의 원소 값 출력");
		for(int i=0; i<a.length; i++) { // 행
			for(int j=0; j<a[i].length; j++) { //열
				System.out.print("a[" + i + "]" + "[" + j + "] : " + a[i][j]);
			
				System.out.println();
			}
		}
			
			// 2차원 테이블 형태로 원소 값 출력
			for(int i=0; i<a.length; i++) { // 행
				for(int j=0; j<a[i].length; j++) { //열
					System.out.print(a[i][j] + '\t');
				
					System.out.println();
			}	
		}
}
}
```



#### Array3.java

```java
package ch05.sec02;

// 배열 초기값 : 메모리 할당 받을 때 자료형의 기본값으로 초기화
// 정수 : 0
// 실수 : 0.0
// boolean : false
// 참조 타입 : null

public class Array3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}

		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
		}

}

```



#### Array4.java

```java
package ch05.sec02;

import java.util.Scanner;

// 입력 받아서 배열에 저장

public class Array4 {

	public static void main(String[] args) {
		// 크기가 5인 정수 배열에 숫자를 입력 받아서 저장
		// 숫자 입력
		// num[0] : ...
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("숫자 입력");
		for(int i=0; i<num.length; i++) {
		System.out.print("num[" + i + "] : ");
		num[i] = sc.nextInt();
		
		}
		
		// 배열의 값 출력
		// num[0] : ...
		System.out.println("입력된 값 출력");
		for(int i=0; i<num.length; i++) {
		System.out.println("num[" + i + "]" + num[i]);

		}
		
		// 이름 입력
		// 5명의 이름을 입력받아 출력
		// 크기가 5인 String 배열에 이름을 입력 받아서 저장하고 출력
		String[] name = new String[5];
		
		System.out.println("이름 입력");
		for(int i=0; i<name.length; i++) {
			System.out.print("name[" + i + "]");
			name[i] = sc.next();
		}
		
			System.out.println("입력된 값 출력");
			for(int i=0; i<name.length; i++) {
				System.out.println("name[" + i + "]" + name[i]);
			}
		
			
		}
	
}

```



#### ArrayCopy1.java

```java
package ch05.sec02;

// 배열 복사 : for문 이용해서 배열 복사
// 복사되지 않은 원소는 기본 초기값 유지

public class ArrayCopy1 {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		// for문 이용해서 배열 복사
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
	}

}

```



#### ArrayEx.java

```java
package ch05.sec02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] gram = new int[5];
		int[] list = new int[5];
		int[] read = new int[5];
		int total, count=0;
		String answer, grade;
		
		System.out.println("*****TOEIC 점수 입력*****");
		
		do {	
			System.out.print((count+1) + "번 성명 입력 : ");
			name[count] = sc.next();
			
			System.out.print((count+1) + "번 문법 점수 입력 : ");
			gram[count] = sc.nextInt();
			
			System.out.print((count+1) + "번 듣기 점수 입력 : ");
			list[count] = sc.nextInt();
			
			System.out.print((count+1) + "번 독해 점수 입력 : ");
			read[count] = sc.nextInt();
		
			count++;
			
		
			System.out.print("계속 입력하시겠습니까? (y 입력하면 계속) : ");
			answer = sc.next();

	}	while(answer.equals("y") && count < 5);
		
		System.out.println("\n*****TOEIC 시험 결과*****");
		for(int j=0; j<count; j++) {
			total = (gram[j] + list[j] + read[j]);
			
			switch(total / 200) {
			case 4 : grade = "1등급"; break;
			case 3 : grade = "2등급"; break;
			case 2 : grade = "3등급"; break;
			default : grade = "4등급";
			}
			
			System.out.println((j+1) + "번" + name[j] + " " + total + " " + grade);
		}

		sc.close();
		
	}
}

```



#### ArrayInput.java

```java
package ch05.sec02;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// 점수 입력 : 5개 입력
		// 총점과 평균 출력
		// score, total, average
		// 점수 입력
		// 학생1 : 95 ...
		// 총점 : ...
		// 평균 : ...

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		float average;
		
		System.out.println("점수 입력");
		for(int i=0; i<score.length; i++) {
			System.out.print("학생" + (i+1) + ":");
			
			score[i] = sc.nextInt();
			total += score[i];
		
		}
		
		average = total/(float)score.length;
		System.out.println("\n총점:" + total);
		System.out.println("평균:" + average);
		
		sc.close();
	
	}

}

```



#### ArrayInputEx.java

```java
package ch05.sec02;

import java.util.Scanner;

public class ArrayInputEx {

	public static void main(String[] args) {
		// 정수 5개를 입력 받아서 최대값을 구하는 프로그램
		// 숫자 입력
		// num[0] : ...
		// 입력된 값 : ...
		// 최대값 : ...
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int max = 0; // 최대값 저장
		
		System.out.println("숫자 입력");
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "]:");	
			num[i] = sc.nextInt();
			
			if(num[i] > max) // 입력된 값이 max보다 크면
				max = num[i];
		}
		
		System.out.print("\n입력된 값 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\n최대값 : " + max);
		
		sc.close();
		
	}

}

```



### Section 03

#### EnumWeekEx.java

```java
package ch05.sec03;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거 타입 변수 선언
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일

		// 열거 타입 변수 today에 열거 상수 대입
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		}

		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");

		}
		// Calendar 클래스 사용 현재 시간 출력
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.print("지금은" + year + "년" + month + "월" + day + "일");
		System.out.println(hour + "시" + minute + "분" + second + "초 입니다.");

	}
}

```



#### Week.java

```java
package ch05.sec03;

// 열거 타입 생성 : 7개의 열거 상수 포함(7개의 Week 객체로 생성)

public enum Week {
	// 열거 상수 : 객체로 생성 (열거 객체)
	MONDAY,
	TUESDAY,
	WEDNSDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY

}

```



