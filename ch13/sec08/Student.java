package ch13.sec08;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	// �Ű����� �ִ� ������
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

}
