package projectEx;

import java.util.Vector;

// Controller Ŭ�������� insert() �޼ҵ� �ֽ��ϴ�.
// BookInsert ��ü�� ������ ������ �� ȣ���ϴ� �޼ҵ� �Դϴ�.

public class Controller {
	// �̱���(Singleton) Ŭ���� : �� �ϳ��� ��ü�� ����
	private static Controller instance = new Controller();

	// new �����ڷ� ������ ȣ���� �� ������ ����
	private Controller() {
	}

	// �ܺο��� ȣ���ؼ� ��ü ������ �� �ֵ���
	// �ڽ��� ��ü (instance) ��ȯ
	public static Controller getInstance() {
		return instance;
	}

	// ���� ���� �Է� �޴� BookInsert Ŭ�������� ȣ���ϰ�
	// �Էµ� �����͸� ����
	// ���޹��� �����͸� BookDTO�� ��Ƽ�
	// BookDAO�� ���� (�׷��� BookDAO�� DB�� �����ϵ���, ���Ϸ� ����)
	public void insert(Vector<String> v) {
		BookDTO dto = new BookDTO();
		BookDAO dao = new BookDAO();

		// ���� ���� Vector���� BookDTO�� ����
		dto.setBookNo(v.get(0));
		dto.setBookName(v.get(1));
		dto.setBookAuthor(v.get(2));
		dto.setBookPrice(Integer.parseInt(v.get(3)));
		dto.setBookDate(v.get(4));
		dto.setBookStock(Integer.parseInt(v.get(5)));

		// BookDAO Ŭ������ insertBook() ȣ�� : dto ����
		dao.insertBook(dto);

	}
}
