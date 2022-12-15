package org.inti.model;

public class Drink {

	private boolean iced;
	private int shots;
	private DrinkType drinkType;
	private int orderNumber;

	public Drink(boolean iced, int shots, DrinkType drinkType, int orderNumber) {
		super();
		this.iced = iced;
		this.shots = shots;
		this.drinkType = drinkType;
		this.orderNumber = orderNumber;
	}

	public Drink() {
		super();
	}

	public boolean isIced() {
		return iced;
	}

	public void setIced(boolean iced) {
		this.iced = iced;
	}

	public int getShots() {
		return shots;
	}

	public void setShots(int shots) {
		this.shots = shots;
	}

	public DrinkType getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(DrinkType drinkType) {
		this.drinkType = drinkType;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Drink [iced=" + iced + ", shots=" + shots + ", drinkType=" + drinkType + ", orderNumber=" + orderNumber
				+ "]";
	}

}
