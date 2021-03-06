package ch13.sec08;

// p695

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {

	// Student 객체를 갖는 컬렉션 (여러 객체를 묶어 놓은 객체) 생성
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 95), // Student 객체1
			new Student("신용권", 95, 93) // Student 객체2
	);

	// Function 함수적 인터페이스를 메소드의 매개타입으로 사용
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}

	// int 타입 출력 메소드 정의
	// 매개변수로 ToIntFunction 함수적 인터페이스 타입 사용
	// 매개값을 Student를 받아서 int로 매핑
	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			// 출력되는 값은 printInt()의 매개값으로 전달되는 람다식에 따라 달라짐
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("학생 이름");
		printString(t -> t.getName());

		System.out.println("영어 점수");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("수학 점수");
		printInt(t -> t.getMathScore());

	}

}
