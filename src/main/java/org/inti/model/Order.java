package org.inti.model;

import java.util.List;

import org.inti.OrderItem;

public class Order {

	private int number;
	private List<OrderItem> listOrderItems;

	public Order() {
		super();
	}

	public Order(int number, List<OrderItem> listOrderItems) {
		super();
		this.number = number;
		this.listOrderItems = listOrderItems;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<OrderItem> getListOrderItems() {
		return listOrderItems;
	}

	public void setListOrderItems(List<OrderItem> listOrderItems) {
		this.listOrderItems = listOrderItems;
	}

	@Override
	public String toString() {
		return "Order [number=" + number + ", listOrderItems=" + listOrderItems + "]";
	}

	public void additem(DrinkType drinkType, Drink shots, Drink iced) {
		for (OrderItem orderItem : listOrderItems) {
			listOrderItems.add(orderItem);
		}
		
	}
}
