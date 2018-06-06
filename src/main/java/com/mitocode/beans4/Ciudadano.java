package com.mitocode.beans4;

import com.mitocode.beans4.Ciudad;

public class Ciudadano {

	private int id;
	private String nombre;
	private String apodo;
	private Ciudad ciudad;
	
	public void init() {
		System.out.println("INIT: Post Construct Ciudadano");
	}

	public void destroy() {
		System.out.println("DESTROY: Pre Destroy Ciudadano");
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", ciudad=" + ciudad + "]";
	}
	

	
	
	
	
}
