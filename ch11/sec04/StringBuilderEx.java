package ch11.sec04;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		// append() : 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		// insert(위치, 문자열) : 특정 위치에 문자열 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		// setCharAt(위치, 문자 1개) : 특정 위치에 문자 설정(변경)
		// 새 문자열로 대체(대치)
		sb.setCharAt(4,'6');
		System.out.println(sb.toString());
		
		// replace(시작, 끝) : 시작부터 끝-1 까지의 문자열을
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		// delete(start, end) : start에서 start-1 까지 문자열 삭제
		sb.delete(4 , 5);	// 4에서 4까지 - 4위치 1개 문자
		System.out.println(sb.toString());
		
		
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
