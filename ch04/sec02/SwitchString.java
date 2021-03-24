package ch04.sec02;

public class SwitchString {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) { // position : (문자열)
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만원");

		}

	}

}
