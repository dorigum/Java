package ch06.sec04;

// static �ʱ�ȭ ���
// Ŭ������ �޼ҵ� ����(static ����)���� �ε��� �� �ڵ����� �����ϴ� ���
// ���� ���� ����Ǹ�, ����� ������� ����

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}

}
