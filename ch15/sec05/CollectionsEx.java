package ch15.sec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsEx {
	
	static void printList(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String element = it.next();
			String separator;
			if(it.hasNext()) separator = " -> ";
			else separator = "\n";
			
			System.out.print(element + separator);
			
		}
	}

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add("�͹̳�����");
		myList.add("�ƹ�Ÿ");

		System.out.println("List ���� : ");
		for(String movie : myList) {
			System.out.print(movie + " | ");
		}
		
		// sort : ��������
		System.out.print("\n�������� ���� : ");
		Collections.sort(myList);
		printList(myList);
		
		// reverse : ��������
		System.out.println("�������� ���� : ");
		Collections.reverse(myList);
		printList(myList);
		
		
	}

}
