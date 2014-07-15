package com.sonyatv.camel.routes;

import java.io.InputStream;
import java.util.Properties;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream is = SimpleRouteBuilder.class.getClassLoader().getResourceAsStream("config.properties");
		prop.load(is);
		from("ftp://192.168.38.144/ftp?username=frank&password=password").to("jms:queue:simpleTopic");
	}

}
