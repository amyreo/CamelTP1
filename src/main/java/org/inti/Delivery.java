package org.inti;

import java.util.List;

public class Delivery {
	
	private List<Drink> listeDrink;
	private int orderNumber;
	
	
	public Delivery() {
		super();
	}


	public Delivery(List<Drink> listeDrink, int orderNumber) {
		super();
		this.listeDrink = listeDrink;
		this.orderNumber = orderNumber;
	}


	public List<Drink> getListeDrink() {
		return listeDrink;
	}


	public void setListeDrink(List<Drink> listeDrink) {
		this.listeDrink = listeDrink;
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	

}
