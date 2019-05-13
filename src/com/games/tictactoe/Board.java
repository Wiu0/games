package com.games.tictactoe;

import com.games.tictactoe.enums.Simbol;
import com.games.tictactoe.exception.InvalidPosition;
import com.games.tictactoe.exception.UsedPosition;
import com.games.tictactoe.interfaces.DiagonalRule;
import com.games.tictactoe.interfaces.HorizontalRule;
import com.games.tictactoe.interfaces.VerticalRule;

public class Board {

	private Simbol square[][];
	private short size;
	Line rule;
	
	public Board() {
		size = 3;
		initBoard();
		initRules();
	}

	private void initRules() {
//		rule =  new EmptyRule();
		rule = new HorizontalRule();
		rule.next(new VerticalRule());
		rule.next(new DiagonalRule());
	}

	private void initBoard() {
		square = new Simbol[size][size];		
		for(short i = 0; i < size; i++) for(short k = 0; k < size; k++) square[i][k] = Simbol.EMPTY;
	}
	
	public Simbol[][] getBoard(){
		Simbol newSquare[][] = new Simbol[size][size];		
		for(short i = 0; i < size; i++) for(short k = 0; k < size; k++) newSquare[i][k] = square[i][k];
		return newSquare;
	}

	public short getSize() {
		return size;
	}
	
	public void setSimbol(Simbol s, short x, short y) throws UsedPosition, InvalidPosition {
		short _x = (short) (x - 1), _y = (short) (y - 1); 
		if(x > size || x < 0) throw new InvalidPosition();
		if(y > size || y < 0) throw new InvalidPosition();
		if(square[_x][_y] != Simbol.EMPTY) throw new UsedPosition();
		square[_x][_y] = s;
	}

	public boolean isCompletedGame() {
		return rule.isGameEnded(square);
	}
}
