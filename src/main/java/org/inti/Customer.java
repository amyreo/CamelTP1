package org.inti;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.Order;

public class Customer extends RouteBuilder implements InitializingBean, CamelContextAware {
	private CamelContext camelContext;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if (camelContext == null) {
			//this.addRoutesToCamelContext(camelContext);
			camelContext.addRoutes(this);
		}

	}

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("myTimer?fixedRate=true&period=60000")
		.to("direct:cafe")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				// TODO Auto-generated method stub
				Order order = exchange.getIn().getBody(Order.class);
				order.additem
				exchange.getIn().setBody(order);
				
			}
		});

	}

	public CamelContext getCamelContext() {
		return camelContext;
	}

	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}

}
