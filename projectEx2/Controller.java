package projectEx2;

import java.util.Vector;

public class Controller {
	private static Controller instance = new Controller();

	private Controller() {}

	public static Controller getInstance() {
		return instance;
	}

	public void insert(Vector<String> v) {
		ItemDTO dto = new ItemDTO();
		ItemDAO dao = new ItemDAO();

		dto.setItemNo(v.get(0));
		dto.setItemName(v.get(1));
		dto.setItemMaker(v.get(2));
		dto.setItemPrice(Integer.parseInt(v.get(3)));
		dto.setItemDate(v.get(4));
		dto.setItemCount(Integer.parseInt(v.get(5)));

		dao.insertItem(dto);

	}
}
