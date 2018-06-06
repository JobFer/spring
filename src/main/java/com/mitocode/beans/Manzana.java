package com.mitocode.beans;

import org.springframework.stereotype.Component;

@Component
public class Manzana extends Fruta {

	public void saludo() {
		System.out.println("Soy una manzana");
	}
}
