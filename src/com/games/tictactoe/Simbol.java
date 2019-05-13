package com.games.tictactoe;


public enum Simbol {

	EMPTY("E"),
	SIMBOL_0("X"),
	SIMBOL_1("O");
	
	public final String simbol;
	
	Simbol(String simbol){
		this.simbol = simbol;
	}
}
