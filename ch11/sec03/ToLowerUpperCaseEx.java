package ch11.sec03;

public class ToLowerUpperCaseEx {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		// 둘 다 소문자로 변경해서 비교
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 대소문자 무시하고 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
