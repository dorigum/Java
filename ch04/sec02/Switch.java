package ch04.sec02;

// switch��
// ����!!
// �������δ� ���� ����� ����, ���ڿ�, ���� ���̾�� �Ѵ�.
// case ���� value�� �ݵ�� �ϳ��� ���� ���(���� 1~10�� �ü� ����)
// case �������� �ݷ�(:)��� (�����ݷ�(;)�ƴ�)
// break���� ���� ��쿡�� �ش� case���� ������ ������ �ʰ� ���� case���� ����ȴ�.


import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("�г� �Է� : ");
		year= sc.nextInt();
		
		switch(year) { //year : ������
		case 1:System.out.println("1�г�"); break;
		case 2:System.out.println("2�г�"); break;
		case 3:System.out.println("3�г�"); break;
		case 4:System.out.println("4�г�"); break;
		
		default : System.out.println("�߸� �Է��Ͽ����ϴ�."); break;
		}
		
		sc.close();

	}

}
