package com.mitocode.beans4;

public class Ciudad {

	private String nombre;

	public void init() {
		System.out.println("INIT: Post Construct Ciudad");
	}

	public void destroy() {
		System.out.println("DESTROY: Pre Destroy Ciudad");
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
