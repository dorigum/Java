package projectEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class BookDAO implements IBookDAO {
	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("다음과 같이 도서 정보를 입력하였습니다.");
		System.out.println(dto);
		// BookDTO를 받아서 DB에 저장하는 역할
		// dto를 받아서 파일에 저장
		// dto 각 필드의 값을 가져와서 변수에 저장하고
		// 변수 값을 파일로 저장
		
		// DTO 정보를 문자열로 저장
		String data = dto.getBookNo() + "\t" +
					dto.getBookName() + "\t" +
					dto.getBookAuthor() + "\t" +
					dto.getBookPrice() + "\t" +
					dto.getBookDate() + "\t" +
					dto.getBookStock();
		
		// 파일로 저장
		File file = new File("C:/test/book.txt");
		FileWriter fw;
		
		try {
			fw = new FileWriter(file, true); // true : append 모드 (끝에 추가)
			fw.write(data + "\r\n");
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Vector<BookDTO> selectAllBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(BookDTO dto) {
		// TODO Auto-generated method stub

	}

}
