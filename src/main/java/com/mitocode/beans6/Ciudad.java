package com.mitocode.beans6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Ciudad implements InitializingBean, DisposableBean{

	private String nombre;

//	@PostConstruct
//	public void init() {
//		System.out.println("Post Construct Ciudad");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Pre Destroy Ciudad");
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + "]";
	}
	
	public void destroy() throws Exception {
		System.out.println("Pre Destroy Ciudad Interfaces");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Post Construct Ciudad Interfaces");
	}	
}
