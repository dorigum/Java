package ch15.sec03;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() 메소드 실행");
		
		// Student 객체인지 확인
		if(obj instanceof Student) {
			// Student 객체이면 Student 타입으로 형변환
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		System.out.println(sno + name.hashCode());
		return sno + name.hashCode();
	}

}
