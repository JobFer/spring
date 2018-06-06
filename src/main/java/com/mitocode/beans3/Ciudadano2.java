package com.mitocode.beans3;

public class Ciudadano2 {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	public Ciudadano2(int id, String nombre, String apodo, Pais pais, Ciudad ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
		this.pais = pais;
		this.ciudad = ciudad;
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Ciudadano2 [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", pais=" + pais + ", ciudad="
				+ ciudad + "]";
	}


	
}
