package com.mitocode.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mitocode.beans.Planeta;

public class App3_con_Anotaciones {

	private Planeta planeta;

	public static void main(String[] args) {

		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		Planeta planeta = (Planeta)context.getBean("planeta");
		System.out.println( "Saludo: " + planeta.getSaludo());		
	}	
	
	/**************************************************/
	
//	private Planeta planeta;
//	
//	public String hacer() {
//		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
//		context.scan("com");
//		context.refresh();
//		Planeta planeta = (Planeta)context.getBean("planeta");
//		return "Saludo: " + planeta.getSaludo();
//	}
//
//	public static void main(String[] args) {
//
//		App3_con_Anotaciones app3 = new App3_con_Anotaciones();
//		System.out.println(app3.hacer());
//	}	

}
