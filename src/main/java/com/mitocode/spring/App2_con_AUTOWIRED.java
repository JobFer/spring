package com.mitocode.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.mitocode.beans.Fruta;

@Component
public class App2_con_AUTOWIRED {

	//Forma 1: Con inyeccion en el constructor
	@Autowired
	public App2_con_AUTOWIRED(Fruta man) {
		
		System.out.println("Constructor de App2_con_AUTOWIRED con AUTOWIRED: ");
		man.saludo();
	}
	
	
//	//Forma 2: Tb se puede hacer la inyeccion en el "setter"
//	Fruta man;
//	
//	public Fruta getMan() {
//		return man;
//	}
//
//	@Autowired
//	public void setMan(Fruta man) {
//		this.man = man;
//		System.out.println("Inyectada fruta en el setter:");
//		man.saludo();
//	}	
	
	
//	//Forma 3: De igual manera, se puede usar un metodo "PostConstruct"
//	@Autowired
//	Fruta man;
//	
//	@PostConstruct
//	public void inicio(){
//		System.out.println("PostConstruct: "); 
//		man.saludo();
//	}	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.mitocode");
		appContext.refresh();	
		
		appContext.close();
	}		
	
	/**********************************************************/
	
//	static Fruta man;
//	
//	//Con inyeccion en el constructor
//	@Autowired
//	public App2_con_AUTOWIRED(Fruta man) {
//		this.man = man;
//	}
//	
////	//De igual manera, se puede hacer la inyeccion en el "setter"
////	public Fruta getMan() {
////		return man;
////	}
////
////	@Autowired
////	public void setMan(Fruta man) {
////		App2_con_AUTOWIRED.man = man;
////	}
//	
//	public static void main(String[] args) {
//		
//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//		appContext.scan("com.mitocode");
//		appContext.refresh();		
//		
//		man.saludo();
//		
//		appContext.close();	
//	}

}
