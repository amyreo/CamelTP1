package org.inti.stuff;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.inti.model.Drink;

public class CafeAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		List<Drink> listeD;
		if (oldExchange == null) {
			listeD = new ArrayList<>();
		} else {
			listeD = oldExchange.getIn().getBody(List.class);
		}
		Drink boisson = newExchange.getIn().getBody(Drink.class);
		listeD.add(boisson);
		newExchange.getIn().setBody(listeD);
		return newExchange;
	}

}
