package ch11.sec05;

// 사용자 정의 클래스 배열 : Arrays.sort()
// Arrays.sort()는 자동으로 오름차순 정렬
// 사용자 정의 클래스 배열을 정렬하기 위해서는
// 클래스가 Comparable 인터페이스를 구현하고 있어야 정렬이 된다.

public class Member implements Comparable<Member> {
	String name;

	public Member(String name) {
		this.name = name;
	}

	// 인터페이스 추상 메소드 재정의
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		// compareTo() 리턴 값
		// 오름차순인 경우 : 자신이 매개 값보다 낮을 경우 음수,
		// 같을 경우 0,
		// 높을 경우 양수 반환
		// name 필드 값으로 정렬 : 유니코드 비교

	}

}
