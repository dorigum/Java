package ch11.sec07;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		String id = "java";
		String name = "ȫ�浿";
		String tel = "010-1234-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		
		System.out.println("--------------------------------");
		
		
		String sql = "insert into member values({0}, {1}, {2})";
		Object[] arguments = {"'Java'", "'ȫ�浿'", "'010-1234-1234'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);

	}

}
