package com.mitocode.jugador3;

import org.springframework.stereotype.Component;

@Component
public class Barcelona implements IEquipo {

	public String mostrarEquipo() {

		return  "Barcelona FC";
	}

}
