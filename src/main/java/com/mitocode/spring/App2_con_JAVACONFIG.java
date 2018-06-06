package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App2_con_JAVACONFIG {

	public static void main(String[] args) {
		
//		//Forma 1: Esta línea es para usar Spring con anotaciones
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

//		//Forma 2: La linea anterior es lo mismo que estas 4 lineas:
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
//		
//		//Forma 3: 
//		ApplicationContext appContext = new AnnotationConfigApplicationContext();
//		((AnnotationConfigApplicationContext) appContext).register(AppConfig.class);
//		((AnnotationConfigApplicationContext) appContext).register(AppConfig2.class);
//		((AnnotationConfigApplicationContext) appContext).refresh();
		
		Mundo m = (Mundo) appContext.getBean("mundo"); 
		Mundo m2 = (Mundo) appContext.getBean("marte"); 

		System.out.println("1 "+m.getSaludo());
		System.out.println("2 "+m2.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();		
		
	}

}
