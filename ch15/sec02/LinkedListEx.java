package ch15.sec02;

// p 733
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	private static void printTime(List<String> list) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			list.add(0, String.valueOf(i));
		}

		long endTime = System.nanoTime();

		System.out.println(endTime - startTime);
	}

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();

		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();

		System.out.print("List-ArrayList :");
		printTime(listArrayList);

		System.out.print("List-LinkedList :");
		printTime(listLinkedList);

		System.out.print("ArrayList :");
		printTime(arrayList);

		System.out.print("LinkedList :");
		printTime(linkedList);

	}

}

/*		long startTime;
long endTime;

startTime = System.nanoTime();
for (int i = 0; i < 10000; i++) {
	list1.add(0, String.ValueOf(i));
}

endTime = System.nanoTime();
System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");


startTime = System.nanoTime();
for (int i = 0; i < 10000; i++) {
	list2.add(0, String.ValueOf(i));
}

endTime = System.nanoTime();
System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");*/
