package projectEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class BookDAO implements IBookDAO {
	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("������ ���� ���� ������ �Է��Ͽ����ϴ�.");
		System.out.println(dto);
		// BookDTO�� �޾Ƽ� DB�� �����ϴ� ����
		// dto�� �޾Ƽ� ���Ͽ� ����
		// dto �� �ʵ��� ���� �����ͼ� ������ �����ϰ�
		// ���� ���� ���Ϸ� ����
		
		// DTO ������ ���ڿ��� ����
		String data = dto.getBookNo() + "\t" +
					dto.getBookName() + "\t" +
					dto.getBookAuthor() + "\t" +
					dto.getBookPrice() + "\t" +
					dto.getBookDate() + "\t" +
					dto.getBookStock();
		
		// ���Ϸ� ����
		File file = new File("C:/test/book.txt");
		FileWriter fw;
		
		try {
			fw = new FileWriter(file, true); // true : append ��� (���� �߰�)
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
