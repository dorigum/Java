package ch04.sec02;

public class SwitchString {

	public static void main(String[] args) {
		String position = "����";
		
		switch(position) { // position : (���ڿ�)
		case "����":
			System.out.println("700����");
			break;
			
		case "����":
			System.out.println("500����");
			break;
			
		default:
			System.out.println("300����");

		}

	}

}
