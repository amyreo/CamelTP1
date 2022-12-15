package org.inti;

public class OrderItem {
	
	private DrinkType drinkType;
	private int shots = 1;
	private boolean iced;
	private Order order;
	
	
	public OrderItem() {
		super();
	}


	public OrderItem(DrinkType drinkType, int shots, boolean iced, Order order) {
		super();
		this.drinkType = drinkType;
		this.shots = shots;
		this.iced = iced;
		this.order = order;
	}


	public DrinkType getDrinkType() {
		return drinkType;
	}


	public void setDrinkType(DrinkType drinkType) {
		this.drinkType = drinkType;
	}


	public int getShots() {
		return shots;
	}


	public void setShots(int shots) {
		this.shots = shots;
	}


	public boolean isIced() {
		return iced;
	}


	public void setIced(boolean iced) {
		this.iced = iced;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
