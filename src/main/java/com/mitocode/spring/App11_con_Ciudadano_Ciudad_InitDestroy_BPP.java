package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans8.Ciudadano;


public class App11_con_Ciudadano_Ciudad_InitDestroy_BPP {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoCiudadInitDestroyBPP.xml");
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
		System.out.println(c.toString());

		((ConfigurableApplicationContext)appContext).close();
	}
}
