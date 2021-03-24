package ch14.sec06;

public class Course<T> {
	private String name; // ������
	private T[] students; // T Ÿ�� �迭�� ����
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
		// Ÿ�� �Ķ���͸� �迭�� ���� ��� : (T[])(new Object[capacity])
		// ���� : new T[] ���·� �迭�� ������ �� ����
		// T�� �������� �ʾұ� ������ new �����ڷ� �迭 ���� �Ұ�
		// Object Ÿ������ �����ϰ� T[] Ÿ������ ���� Ÿ�� ��ȯ
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	// �迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰�
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
				
			}
		}
	}
	
}
