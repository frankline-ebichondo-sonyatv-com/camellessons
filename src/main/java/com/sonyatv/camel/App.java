package com.sonyatv.camel;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.sonyatv.camel.routes.SimpleRouteBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		CamelContext camelContext = new DefaultCamelContext();
    		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616?broker.persistent=false");
    		camelContext.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
            camelContext.addRoutes(new SimpleRouteBuilder());
            camelContext.start();
    		Thread.sleep(10000);
    		camelContext.stop();
    	}catch(Exception e){
    		e.printStackTrace();
    	}        
    }
}
