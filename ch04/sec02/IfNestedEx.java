// 9�� ������ Ǯ��!!!

package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item, itemcount;
		
		item = sc.nextInt();
		
		if(item == 1) {
			System.out.println("******��ǰ ����******");
			System.out.println(item + "��Ʈ�� : " + "1,200,000��");
		}
		
		else if(item == 2) {
			System.out.println("******��ǰ ����******");
			System.out.println(item + "������ī�޶� : " + "400,000��");
			System.out.println("***************");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �����մϴ�.");
		}

	}

}
