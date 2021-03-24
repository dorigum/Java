package projectEx2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ItemDAO implements IItemDAO {

	@Override
	public void insertItem(ItemDTO dto) {
		System.out.println("상품 정보가 등록되었습니다.");
		System.out.println(dto);

		String data = dto.getItemNo() + "\t" +
					dto.getItemName() + "\t" +
					dto.getItemMaker()+ "\t" +
					dto.getItemPrice()+ "\t" +
					dto.getItemDate()+ "\t" +
					dto.getItemCount();
		
		File file = new File("src\\projectEx2\\item.txt"); // "C:/test/item.txt"
		FileWriter fw;
		
		try {
			fw = new FileWriter(file, true);
			fw.write(data + "\r\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {}
	}

	@Override
	public Vector<ItemDTO> selectAllBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(ItemDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(ItemDTO dto) {
		// TODO Auto-generated method stub

	}

}
