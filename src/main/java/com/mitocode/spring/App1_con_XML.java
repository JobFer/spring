package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Mundo;

public class App1_con_XML {

	public static void main(String[] args) {
		
		//Esta línea es para usar Spring con el fichero de configuracion xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");

		Mundo m = (Mundo) appContext.getBean("mundo"); //Antes teniamos que hacer el "new Mundo()"
//		Mundo m = (Mundo) appContext.getBean(Mundo.class); //Esto es lo mismo que lo anterior
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
