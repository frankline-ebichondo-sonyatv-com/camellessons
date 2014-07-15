package com.sonyatv.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ConsoleLogProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println("Moved:" + exchange.getIn().getHeader("CamelFileName") + " from ftp server to jms queue");
		
	}

}
