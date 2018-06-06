package com.mitocode.beans8;

import com.mitocode.beans8.Ciudad;

public class Ciudadano {// implements InitializingBean, DisposableBean {

	private int id;
	private String nombre;
	private String apodo;
	private Ciudad ciudad;
	
//	@PostConstruct
//	public void init() {
//		System.out.println("Post Construct Ciudadano Anotaciones");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Pre Destroy Ciudadano Anotaciones");
//	}

//	public Ciudadano() throws InterruptedException {
//		System.out.println("Constructor Ciudadano");
//	}
	
//	public Ciudadano(int id, String nombre, String apodo, Ciudad ciudad) {
//		System.out.println("Constructor Ciudadano con parametros");
//		this.id = id;
//		this.nombre = nombre;
//		this.apodo = apodo;
//		this.ciudad = ciudad;
//	}	
	
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
	
//	public void destroy() throws Exception {
//		System.out.println("Pre Destroy Ciudadano Interfaces");
//		
//	}
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Post Construct Ciudadano Interfaces");
//	}
	
}
