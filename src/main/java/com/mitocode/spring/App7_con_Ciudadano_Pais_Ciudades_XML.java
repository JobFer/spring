package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans2.Ciudadano;


public class App7_con_Ciudadano_Pais_Ciudades_XML {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudades.xml");
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano"); //o "ciudadanoBean", o "ciudadanoBean2", de cq de las 3 formas
		System.out.println(c.toString());
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
