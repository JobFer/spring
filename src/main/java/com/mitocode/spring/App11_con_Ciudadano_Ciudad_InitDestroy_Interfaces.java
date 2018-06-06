package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans6.Ciudadano;


public class App11_con_Ciudadano_Ciudad_InitDestroy_Interfaces {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoCiudadInitDestroyInterfaces.xml");
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
		System.out.println(c.toString());

		((ConfigurableApplicationContext)appContext).close();
	}
}
