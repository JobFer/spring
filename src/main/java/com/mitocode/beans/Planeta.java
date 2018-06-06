package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="planeta")
public class Planeta {
	
	@Value("Hola Planeta!!!") 
	public String saludo= "kk";   

	public Planeta() {
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
