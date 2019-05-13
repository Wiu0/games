package com.games.hash;

public interface LineRule {

	public void next(Line rule);
	public Line apply(Simbol[][] square);
	public boolean isFinished();
}
