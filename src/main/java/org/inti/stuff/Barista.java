package org.inti.stuff;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.model.DelayDefinition;
import org.inti.OrderItem;
import org.inti.model.Drink;

public class Barista {
	private static Drink drink;
	private long hotDrinkDelay = 300;
	private long coldDrinkDelay = 100;
	private AtomicInteger hotDrinkCounter = new AtomicInteger();
	private AtomicInteger coldDrinkCounter = new AtomicInteger();
	
	public Drink prepareHotDrink(OrderItem orderItem) throws InterruptedException 
	{
		System.out.println("hotdrink");
		Thread.sleep(hotDrinkDelay);
		return drink;
		
	}

	public Drink prepareColdDrink(OrderItem orderItem) throws InterruptedException 
	{
		System.out.println("colddrink");

		Thread.sleep(coldDrinkDelay);
		return drink;
		
	}

	
}
