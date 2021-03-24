package ch11.sec03;

public class SubStringEx {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// substring(start, end) : start에서 end-1까지 추출
		String firstNum = ssn.substring(0, 6);	// 인덱스 5까지 추출(6번째까지 추출)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// 인덱스 7부터 끝까지
		System.out.println(secondNum);
		
		// 당신은 88년 8월 15일에 태어나셨군요.
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String date = ssn.substring(4, 6);
		
		System.out.println("당신은 " + year + "년 "
						  + month + "월 " + date + "일에 "
						  + "태어나셨군요.");
	}

}
