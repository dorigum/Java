package projectEx2;

import java.util.Vector;

public interface IItemDAO {
	public void insertItem (ItemDTO dto);
	public Vector<ItemDTO> selectAllBookList();
	public void updateItem(ItemDTO dto);
	public void deleteBook(ItemDTO dto);
}
