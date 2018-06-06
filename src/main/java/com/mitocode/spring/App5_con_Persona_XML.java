package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mitocode.beans.Persona;

public class App5_con_Persona_XML {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans3.xml");
		Persona p = (Persona) appContext.getBean("persona"); 
		System.out.println(p.toString());
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
