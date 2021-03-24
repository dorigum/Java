package ch11.sec01;

public class FinalizeEx {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i=1; i<50; i++) {
			counter = new Counter(i);	// 객체 생성
			counter = null;	// 객체 사용하지 않음(제거)
			System.gc();
	
		}

	}

}
