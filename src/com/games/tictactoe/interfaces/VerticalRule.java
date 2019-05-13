package com.games.tictactoe.interfaces;

import com.games.tictactoe.Line;
import com.games.tictactoe.enums.Simbol;

public class VerticalRule extends Line implements LineRule {

	@Override
	public Line apply(Simbol[][] square) {
		int size = square.length;
		boolean ret = false;
		for(short k = 0; k < size && !ret; k++) {
			ret = true;
			for(short i = 0; i < size - 1 && ret; i++) {
				ret = square[i][k] != Simbol.EMPTY && square[i + 1][k] != Simbol.EMPTY && square[i][k] == square[i + 1][k];
			}			
		}
		finish = ret;
		return this;
	}

}
