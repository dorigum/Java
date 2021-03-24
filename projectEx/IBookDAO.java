package projectEx;

import java.util.Vector;

public interface IBookDAO {
	public void insertBook(BookDTO dto);
	public Vector<BookDTO> selectAllBookList();
	public void updateBook(BookDTO dto);
	public void deleteBook(BookDTO dto); // (String BookNo) ¸¸ ¹Þ¾Æµµ µÊ

}
