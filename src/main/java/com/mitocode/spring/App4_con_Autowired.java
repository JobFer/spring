package com.mitocode.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.mitocode.beans.Planeta;

@Component
public class App4_con_Autowired {

	@Autowired
	private Planeta planeta;
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();		
		
		App4_con_Autowired app4 = (App4_con_Autowired)context.getBean("app4_con_Autowired");
		System.out.println(app4.planeta.getSaludo());
		
	}	
	
	/******************************************************/
	
//	//Esto es equivalente a lo de arriba
//	@Autowired
//	private Planeta planeta;
//	
//	public String hacer() {
//		return "Saludo desde app4: " + planeta.getSaludo();
//	}
//
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
//		context.scan("com");
//		context.refresh();		
//		
//		App4_con_Autowired app4 = (App4_con_Autowired)context.getBean("app4_con_Autowired");
//		String saludo = app4.hacer();
//		System.out.println(saludo);
//		
////		//Forma 2:
////		System.out.println(app4.planeta.getSaludo());
//		
//	}	
	
}
