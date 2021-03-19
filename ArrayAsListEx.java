package ch15.sec01;

import java.util.Arrays;
import java.util.List;

// Arrays.asList() : 绊沥等 按眉甸肺 备己等 List 积己

public class ArrayAsListEx {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("全辨悼", "捞根锋", "己冕氢");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
