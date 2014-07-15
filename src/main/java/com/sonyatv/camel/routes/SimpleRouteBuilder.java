package com.sonyatv.camel.routes;

import java.io.InputStream;
import java.util.Properties;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream is = SimpleRouteBuilder.class.getResourceAsStream("config.properties");
		prop.load(is);
		from("ftp://" + prop.getProperty("host") + "/ftp?username=" + prop.getProperty("username") + "&password=" + prop.getProperty("password")).to("jms:queue:simpleTopic");
	}

}
