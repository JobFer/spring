package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
//							//Esto es lo mismo que poner en el applicationContext.xml
//							//<property name="saludo" value="Hola Mundo!!!"></property>
//	                        //pero para que funcione, es necesario usar ANOTACIONES
	
	@Value("Hola Mundo2!!!") //Usamos esto con la clase "App2_con_JAVACONFIG" 
	
	/*****************************************/
	
	public String saludo;   

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
