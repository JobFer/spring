package com.mitocode.beans5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ciudad {

	private String nombre;

	@PostConstruct
	public void init() {
		System.out.println("Post Construct Ciudad");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Pre Destroy Ciudad");
	}

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
	
	
}
