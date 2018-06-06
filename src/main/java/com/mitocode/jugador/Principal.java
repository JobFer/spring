package com.mitocode.jugador;

public class Principal {

	public static void main(String[] args) {
		
//		IEquipo barcelona = new Equipo("Barcelona");
//		Jugador messi = new Jugador("Messi", barcelona);
		
		Jugador messi = new Jugador("Messi", new Barcelona());
		System.out.println(messi.toString());
		
		/****************/
		
//		Jugador messi = new Jugador("Messi", new Juventus());
////		messi.setEquipo(new Juventus());
//		System.out.println(messi.toString());
	}

}
