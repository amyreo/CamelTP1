package org.inti.stuff;

import org.inti.OrderItem;

public class DrinkRouter {

	public String resolveOrderItemChannel(OrderItem orderItem) {
		System.out.println("drinkrouter");

		if(orderItem.isIced() == true)
			return "seda:coldDrinks";
		else
			return "seda:hotDrinks";
	}
}
