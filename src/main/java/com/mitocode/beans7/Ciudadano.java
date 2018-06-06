package com.mitocode.beans7;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mitocode.beans7.Ciudad;

public class Ciudadano implements InitializingBean, DisposableBean {

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
	
	public void destroy() throws Exception {
		System.out.println("Pre Destroy Ciudadano Interfaces");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Post Construct Ciudadano Interfaces");
	}
	
}
