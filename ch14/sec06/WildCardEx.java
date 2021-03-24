package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// ���ϵ� ī�� Ÿ�� : �޼ҵ��� �Ű������� ���׸� Ÿ���� ����� ��
	// ��ü���� Ÿ�� ��ſ� ���ϵ� ī��(?) ���·� ���
	
	// ���ϵ� ī�� Ÿ�� 3����
	// (1) ���׸� Ÿ�� <?> : ���� ���� (��� Ÿ�� �� ���� �� ����)
	// (2) ���׸� Ÿ�� <? extends ���� Ÿ��> : ���� Ŭ���� ���� (�ְ� ������ ���� Ŭ��������)
	// (3) ������ Ÿ�� <? super ���� Ÿ��> : ���� Ŭ���� ���� (���� ������ ���� Ŭ��������)
	
	// (1) ���׸� Ÿ�� <?> : ���� ���� (��� Ÿ�� �� ���� �� ����)
	// ��� Ÿ�� ���� : Person, Worker, Student, HighStudent
	
	
	public static void registerCourse (Course<?> course) {
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent (Course<? extends Student> course) {
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker (Course<? super Worker> course) {
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		// �Ϲ��� ����
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));

		// ������ ����
		Course<Worker> workerCourse = new Course<Worker>("������ ����", 5);
		workerCourse.add(new Worker("������"));
		
		// �л� ����
		Course<Student> studentCourse = new Course<Student>("�л� ����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		// ����л� ����
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л� ����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		// ��� �������� �� ��� ���� : ��� ���� ���
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// �л� ������ ��� ����
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		System.out.println();
		// �����ΰ� �Ϲ��� ������ ��� ����
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseStudent(studentCourse);
		//registerCourseStudent(highstudentCourse);
	}

}
