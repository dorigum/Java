package javaExample.addEx;

public class MemberEx {
	public static void main(String[] args) {
		Member m1 = new Member("abcd", "1234", "È«±æµ¿", 30, "010-1234-1234", "¼­¿ï");
		Member m2 = new Member("flower", "5678", "ÀÌ¸ù·æ", 30, "010-1111-1111", "°æ±â");
		Member m3 = new Member("sky", "1111", "¼ºÃáÇâ", 30, "010-2222-2222", "Á¦ÁÖ");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}
}
