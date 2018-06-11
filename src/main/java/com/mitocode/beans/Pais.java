package com.mitocode.beans;

public class Pais {
	
//	private String nombre;
//
//	
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	@Override
//	public String toString() {
//		return "Pais [nombre=" + nombre + "]";
//	}
	/*****************************************************/

	//Caso 2, 3, 4 y 5:
	private String nombre;
	private Ciudad ciudad;	

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", ciudad=" + ciudad + "]";
		
	}
	
}
