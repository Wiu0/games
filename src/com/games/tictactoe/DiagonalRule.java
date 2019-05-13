package com.games.tictactoe;

public class DiagonalRule extends Line implements LineRule {

	@Override
	public Line apply(Simbol[][] square) {

		int size = square.length;
		boolean ret = true;
		for(short i = 0; i < size-1 && ret; i++) {
			ret = square[i][i] != Simbol.EMPTY && square[i][i] == square[i+1][i+1];
		}
		finish = ret;
		if(finish) return this;
		ret = true;
		for(short i = (short)(size - 1); i > 0 && ret; i--) {
			ret = square[i][size - 1 - i] != Simbol.EMPTY && square[i][size - 1 - i] == square[i-1][size - i];
		}
		finish = ret;
		return this;
	}
}
