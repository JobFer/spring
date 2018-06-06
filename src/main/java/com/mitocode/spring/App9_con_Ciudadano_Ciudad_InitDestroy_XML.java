package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans4.Ciudadano;


public class App9_con_Ciudadano_Ciudad_InitDestroy_XML {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoCiudadInitDestroy.xml");
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
		System.out.println(c.toString());

		((ConfigurableApplicationContext)appContext).close();
	}
}
