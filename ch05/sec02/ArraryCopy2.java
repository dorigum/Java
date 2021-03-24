package ch05.sec02;

// 배열 복사 : System.arraycopy() 메소드 사용
// System.arraycopy(원본, 시작 인덱스, 대상, 시작 인덱스, 복사할 개수)

public class ArraryCopy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "Array", "Copy"};
		String[] newStrArray = new String[5]; // 기본값 null로 초기화
		
		// System.arraycopy() 메소드 사용 배열 복사
		// System.arraycopy(원본, 시작 인덱스, 대상, 시작 인덱스, 복사할 개수)
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + ",");

	}

}
