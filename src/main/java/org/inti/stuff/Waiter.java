package org.inti.stuff;

import java.util.List;

import org.inti.Delivery;
import org.inti.model.Drink;

public class Waiter {

	private static int count = 0;
	
	public Delivery  prepareDelivery(List<Drink> listDrink) {
		count ++;
		System.out.println("on est dans preparedelivery");
		Delivery delivery = new Delivery(listDrink, count);
		return delivery;
	}
	
	public void deliverCafes(Delivery delivery) {
		System.out.println(delivery.toString());
	}
	
	public int checkOrder(Drink drink) {
		int orderNumber = drink.getOrderNumber();
		return orderNumber;
	}
}
