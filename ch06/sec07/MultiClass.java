package ch06.sec07;

import java.util.Scanner;

// �ϳ��� java ���Ͽ� ���� Ŭ���� �ۼ�

class Add {
	private int a, b;
	
	// ������ : �ʵ� �� �ʱ�ȭ
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("���ϱ� : " + (a+b));
	}
	
}


class Substract {
	private int a, b;
	
	// ������ : �ʵ� �� �ʱ�ȭ
	public Substract(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("���� : " + (a-b));
	}
	
}


class Mutiply {
	private int a, b;
	
	// ������ : �ʵ� �� �ʱ�ȭ
	public Mutiply(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("���ϱ� : " + (a*b));
	}
	
}


class Divide {
	private int a, b;
	
	// ������ : �ʵ� �� �ʱ�ȭ
	public Divide(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// �޼ҵ�
	public void calculate() {
		System.out.println("������ : " + (a/b));
	}
	
}







public class MultiClass {

	public static void main(String[] args) {
		// ������ ���ڿ� �����ڸ� �Է� �޾Ƽ� ���� ����� ���
		// switch ���� ����ؼ� �����ڿ� �ش��ϴ� Ŭ������ ��ü �����ؼ� �޼ҵ� ���
		// ���� ����
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		// ����
		// ����1 �Է�
		// ����2 �Է�
		System.out.print("����1 �Է� : ");
		a = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		b = sc.nextInt();
		
		// ������ �Է�
		System.out.println("������ �Է� (+,-,*,/) : ");
		operator = sc.next().charAt(0); // ������ �� ���� �Է�
		
		// switch�� ���
		// �����ڿ� �ش��ϴ� Ŭ������ ��ü�� �����ؼ� �޼ҵ� ȣ��
		// ����� ���
		switch(operator) {
			case '+' :
			Add add = new Add(a, b);
			add.calculate();
			break;
		
			case'-' :
			Substract sub = new Substract(a, b);
			sub.calculate();
			break;
			
			case '*' :
			Mutiply mul = new Mutiply(a, b);
			mul.calculate();
			break;
			
			case '/' :
			Divide div = new Divide(a, b);
			div.calculate();
			break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
		}
		
		sc.close();
	
	}
		
}
