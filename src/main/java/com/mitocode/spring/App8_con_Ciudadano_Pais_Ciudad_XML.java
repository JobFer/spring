package com.mitocode.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans3.Ciudadano2;
import com.mitocode.beans3.Ciudadano;


public class App8_con_Ciudadano_Pais_Ciudad_XML {

	public static void main(String[] args) {

//		//Caso 1
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		((ConfigurableApplicationContext)appContext).close();
		
		/***************************/
		
//		//Caso 2: Autowire by name
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad2.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		((ConfigurableApplicationContext)appContext).close();
		
		/***************************/
		
//		//Caso 3: Autowire by type
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad3.xml");
//		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		((ConfigurableApplicationContext)appContext).close();
		
		/***************************/
		
//		//Caso 4: Autowire by constructor
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad4.xml");
//		Ciudadano2 c = (Ciudadano2) appContext.getBean("ciudadano");
//		System.out.println(c.toString());
//		((ConfigurableApplicationContext)appContext).close();		
		
		/***************************/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad5.xml");
//		BeanFactory appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansCiudadanoPaisCiudad5.xml");
		
		Ciudadano c = (Ciudadano) appContext.getBean("ciudadano");
		Ciudadano c2 = (Ciudadano) appContext.getBean("ciudadano");
		
		//Prueba valida
		c.setNombre("Pepe");
		
		//Prueba que no es valida
		System.out.println(c.toString());
		System.out.println(c2);

		//Prueba 1
		System.out.println(c==c2);
		
		//Prueba 2
		System.out.println("c: " + c.hashCode());
		System.out.println("c2: " + c2.hashCode()); 
		//Si el scope="singleton", estos 2 valores son iguales,
		// lo que indica que es el mismo objeto.
		//Si el scope="prototype", dara distintos valores
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
