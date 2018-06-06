package com.mitocode.jugador;

import org.springframework.beans.factory.annotation.Required;

public class Jugador {

	private String nombre;
	private IEquipo equipo;

	//Necesario cuando usemos el XML
	public Jugador() {
	}

	public Jugador(String nombre, IEquipo equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo.mostrarEquipo() + "]";
//		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}

//	//Llevamos esto a la clase PRINCIPAL
//	public static void main(String[] args) {
//		
////		Equipo barcelona = new Equipo("Barcelona");
////		Jugador messi = new Jugador("Messi", barcelona);
//		
//		Jugador messi = new Jugador("Messi", new Barcelona());
//		System.out.println(messi.toString());
//		
//		/****************/
//		
//		messi.setEquipo(new Juventus());
//		System.out.println(messi.toString());
//	}

	
}
