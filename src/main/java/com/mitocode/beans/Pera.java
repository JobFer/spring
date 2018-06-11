package com.mitocode.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component //o @Repository o @Controller o @Service
public class Pera extends Fruta {

	@Override
	public void saludo() {
		System.out.println("Hola, soy una pera");
	}

}
