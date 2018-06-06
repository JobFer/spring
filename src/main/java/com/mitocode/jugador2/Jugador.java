package com.mitocode.jugador2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Jugador {
	
	private String nombre;
	@Autowired
	@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
//		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo.mostrarEquipo() + "]";
	}
	
	
}
