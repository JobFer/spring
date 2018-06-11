package com.mitocode.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.mitocode.beans.Fruta;

@Component
//@Scope(value="prototype")  
public class Manzana extends Fruta {

	public void saludo() {
		System.out.println("Soy una manzana");
	}
}
