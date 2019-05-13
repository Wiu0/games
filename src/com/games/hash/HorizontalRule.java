package com.games.hash;

public class HorizontalRule extends Line implements LineRule {

	@Override
	public Line apply(Simbol[][] square) {
		int size = square.length;
		boolean ret = false;
		for(short i = 0; i < size&& ret == false; i++) {
			ret = true;
			for(short k = 0; k < size - 1 && ret; k++) {
				ret = square[i][k] != Simbol.EMPTY && square[i][k] == square[i][k + 1];
			}			
		}
		finish = ret;
		return this;
	}

}
