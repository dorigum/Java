// 9일 오전에 풀이!!!

package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item, itemcount;
		
		item = sc.nextInt();
		
		if(item == 1) {
			System.out.println("******상품 정보******");
			System.out.println(item + "노트북 : " + "1,200,000원");
		}
		
		else if(item == 2) {
			System.out.println("******상품 정보******");
			System.out.println(item + "디지털카메라 : " + "400,000원");
			System.out.println("***************");
		}
		else {
			System.out.println("잘못 입력하셨습니다. 종료합니다.");
		}

	}

}
