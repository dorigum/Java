package ch11.sec03;

public class StringCharAt {

	public static void main(String[] args) {
		String ssn = "010624-4230123";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�."); break;
			
		case '2':
		case '4':
			System.out.println("�����Դϴ�."); break;
		}

	}

}
