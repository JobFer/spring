package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.jugador2.Jugador;

public class App13_con_Jugador_Equipo_Autowired {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansJugadorEquipoAutowired.xml");
		
		Jugador j = (Jugador) appContext.getBean("messi"); 
//		System.out.println(j.toString() + " - " + j.getEquipo().mostrarEquipo());
		System.out.println(j);
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
