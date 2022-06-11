package bean;

import java.io.Serializable;

public class ItemBean implements Serializable {
	private int itemPrice;
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	private String itemName;
}
