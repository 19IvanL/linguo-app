package ams2.linguo.model;

import java.io.Serializable;

public class Inventory implements Serializable {

	private static final long serialVersionUID = 4139440724071299773L;

    private User user;

    private ShopItem shopItem;

	private int quantity;

	public Inventory() {}

	public Inventory(User user, ShopItem shopItem, int quantity) {
		this.user = user;
		this.shopItem = shopItem;
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShopItem getShopItem() {
		return shopItem;
	}

	public void setShopItem(ShopItem shopItem) {
		this.shopItem = shopItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
