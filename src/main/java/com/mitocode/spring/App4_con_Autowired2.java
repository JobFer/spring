package com.mitocode.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.mitocode.beans.Planeta;

@Component
public class App4_con_Autowired2 {

	@Autowired
	private Planeta planeta;
	
	public String hacer() {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();			
		App4_con_Autowired2 app4 = (App4_con_Autowired2)context.getBean("app4_con_Autowired2");
		
		return "Saludo desde app4: " + app4.planeta.getSaludo();
	}

	public static void main(String[] args) {
		App4_con_Autowired2 app4 = new App4_con_Autowired2();
		String saludo = app4.hacer();
		System.out.println(saludo);
	}	
}
