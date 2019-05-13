package com.games.tictactoe;

public interface LineRule {

	public void next(Line rule);
	public Line apply(Simbol[][] square);
	public boolean isFinished();
}
