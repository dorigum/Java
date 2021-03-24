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
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");

		System.out.println("List 내용 : ");
		for(String movie : myList) {
			System.out.print(movie + " | ");
		}
		
		// sort : 오름차순
		System.out.print("\n오름차순 정렬 : ");
		Collections.sort(myList);
		printList(myList);
		
		// reverse : 내림차순
		System.out.println("내림차순 정렬 : ");
		Collections.reverse(myList);
		printList(myList);
		
		
	}

}
