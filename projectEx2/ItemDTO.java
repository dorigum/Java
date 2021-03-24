package projectEx2;

public class ItemDTO {
	String itemNo;
	String itemName;
	String itemMaker;
	int itemPrice;
	String itemDate;
	int itemCount;

	public ItemDTO() {
	}

	public ItemDTO(String ino, String name, String company, int price, String mdate, int count) {
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemMaker = itemMaker;
		this.itemPrice = itemPrice;
		this.itemDate = itemDate;
		this.itemCount = itemCount;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemMaker() {
		return itemMaker;
	}

	public void setItemMaker(String itemMaker) {
		this.itemMaker = itemMaker;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDate() {
		return itemDate;
	}

	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(itemNo);
		builder.append("\t");

		builder.append(itemName);
		builder.append("\t");

		builder.append(itemMaker);
		builder.append("\t");

		builder.append(itemPrice);
		builder.append("\t");

		builder.append(itemDate);
		builder.append("\t");

		builder.append(itemCount);

		return builder.toString();
	}

}
