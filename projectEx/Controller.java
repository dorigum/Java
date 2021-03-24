package projectEx;

import java.util.Vector;

// Controller 클래스에도 insert() 메소드 있습니다.
// BookInsert 객체가 데이터 전달할 때 호출하는 메소드 입니다.

public class Controller {
	// 싱글톤(Singleton) 클래스 : 단 하나의 객체만 생성
	private static Controller instance = new Controller();

	// new 연산자로 생성자 호출할 수 없도록 막음
	private Controller() {
	}

	// 외부에서 호출해서 객체 생성할 수 있도록
	// 자신의 객체 (instance) 반환
	public static Controller getInstance() {
		return instance;
	}

	// 도서 정보 입력 받는 BookInsert 클래스에서 호출하고
	// 입력된 데이터를 전달
	// 전달받은 데이터를 BookDTO에 담아서
	// BookDAO에 전달 (그러면 BookDAO가 DB에 저장하든지, 파일로 저장)
	public void insert(Vector<String> v) {
		BookDTO dto = new BookDTO();
		BookDAO dao = new BookDAO();

		// 전달 받은 Vector값을 BookDTO에 저장
		dto.setBookNo(v.get(0));
		dto.setBookName(v.get(1));
		dto.setBookAuthor(v.get(2));
		dto.setBookPrice(Integer.parseInt(v.get(3)));
		dto.setBookDate(v.get(4));
		dto.setBookStock(Integer.parseInt(v.get(5)));

		// BookDAO 클래스의 insertBook() 호출 : dto 전달
		dao.insertBook(dto);

	}
}
