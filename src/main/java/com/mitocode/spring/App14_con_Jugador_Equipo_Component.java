package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.jugador3.Jugador;

public class App14_con_Jugador_Equipo_Component {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beansJugadorEquipoComponent.xml");
		Jugador p = (Jugador) appContext.getBean("messi"); 
		System.out.println(p.toString() + " - " + p.getEquipo().mostrarEquipo());
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
