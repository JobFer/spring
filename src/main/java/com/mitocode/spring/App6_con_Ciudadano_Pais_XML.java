package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Ciudadano;

public class App6_con_Ciudadano_Pais_XML {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPais.xml");
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
		System.out.println(c.toString());
		
		((ConfigurableApplicationContext)appContext).close();
		
		/********* Caso 2 ************/

//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPais2.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		
//		((ConfigurableApplicationContext)appContext).close();

		/********* Caso 3 ************/

//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPais3.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		
//		((ConfigurableApplicationContext)appContext).close();
		
//		/********* Caso 4 ************/
//
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPais4.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadanoBean");
//		System.out.println(c.toString());
//		
//		((ConfigurableApplicationContext)appContext).close();		
		
		/********* Caso 5 ************/

//		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPais5.xml");
//		Ciudadano c2 = (Ciudadano) appContext2.getBean("ciudadanoBean2");
//		System.out.println(c2.toString());
//		
//		((ConfigurableApplicationContext)appContext2).close();			
		
	}
}
