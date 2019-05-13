package com.games.tictactoe.interfaces;

import com.games.tictactoe.Line;
import com.games.tictactoe.enums.Simbol;

public interface LineRule {

	public void next(Line rule);
	public Line apply(Simbol[][] square);
	public boolean isFinished();
}
