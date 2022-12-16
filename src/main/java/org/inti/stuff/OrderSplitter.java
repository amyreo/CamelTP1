package org.inti.stuff;

import java.util.ArrayList;
import java.util.List;

import org.inti.OrderItem;
import org.inti.model.Order;

public class OrderSplitter {

	
	public List<OrderItem> split(Order order)
	{	
		System.out.println("ordersplitter");

		List<OrderItem> lisOrderItems = order.getListOrderItems();

		return lisOrderItems;	
	}
}
