package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// 와일드 카드 타입 : 메소드의 매개값으로 제네릭 타입을 사용할 때
	// 구체적인 타입 대신에 와일드 카드(?) 형태로 사용
	
	// 와일드 카드 타입 3가지
	// (1) 제네릭 타입 <?> : 제한 없음 (모든 타입 다 받을 수 있음)
	// (2) 제네릭 타입 <? extends 상위 타입> : 상위 클래스 제한 (최고 지정한 상위 클래스까지)
	// (3) 제레릭 타입 <? super 하위 타입> : 하위 클래스 제한 (최저 지정한 하위 클래스까지)
	
	// (1) 제네릭 타입 <?> : 제한 없음 (모든 타입 다 받을 수 있음)
	// 모든 타입 가능 : Person, Worker, Student, HighStudent
	
	
	public static void registerCourse (Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent (Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker (Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		// 일반인 과정
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		// 직장인 과정
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		// 학생 과정
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		// 고등학생 과정
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		// 모든 수강생이 다 등록 가능 : 모든 과정 등록
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// 학생 과정만 등록 가능
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		System.out.println();
		// 직장인과 일반인 과정만 등록 가능
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseStudent(studentCourse);
		//registerCourseStudent(highstudentCourse);
	}

}
