package ch13.sec08;

// p695

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {

	// Student ��ü�� ���� �÷��� (���� ��ü�� ���� ���� ��ü) ����
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 95), // Student ��ü1
			new Student("�ſ��", 95, 93) // Student ��ü2
	);

	// Function �Լ��� �������̽��� �޼ҵ��� �Ű�Ÿ������ ���
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}

	// int Ÿ�� ��� �޼ҵ� ����
	// �Ű������� ToIntFunction �Լ��� �������̽� Ÿ�� ���
	// �Ű����� Student�� �޾Ƽ� int�� ����
	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			// ��µǴ� ���� printInt()�� �Ű������� ���޵Ǵ� ���ٽĿ� ���� �޶���
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("�л� �̸�");
		printString(t -> t.getName());

		System.out.println("���� ����");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("���� ����");
		printInt(t -> t.getMathScore());

	}

}
