package ch11.sec03;

public class ToLowerUpperCaseEx {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		// �� �� �ҹ��ڷ� �����ؼ� ��
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// ��ҹ��� �����ϰ� ��
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
