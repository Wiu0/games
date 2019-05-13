package com.games.tictactoe.interfaces;

import com.games.tictactoe.Line;
import com.games.tictactoe.enums.Simbol;

public class EmptyRule extends Line implements LineRule {

	@Override
	public Line apply(Simbol[][] square) {
		int size = square.length;
		boolean ret = true;
		for(short i = 0; i < size; i++) {
			ret = true;
			for(short k = 0; k < size && ret; k++) {
				ret = square[i][k] == Simbol.EMPTY;
			}			
		}
		finish = !ret;
		return this;
	}
}
