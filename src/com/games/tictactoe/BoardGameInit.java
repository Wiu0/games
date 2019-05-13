package com.games.tictactoe;

import java.util.Scanner;

public class BoardGameInit {

	static Board b = new Board();
	static byte qttMoves = 0;

	static boolean call(short x, short y) {

		System.out.println("Type EXIT to finish the game.\n");
		try {
			b.setSimbol(Simbol.values()[(qttMoves++ % 2) + 1], x, y);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (UsedPosition e) {
			e.printStackTrace();
		} catch (InvalidPosition e) {
			e.printStackTrace();
		}
		showBoard(b);
		return b.isCompletedGame();
	}

	public static void main(String[] args) {
		showBoard(b);
		System.out.println();
		Scanner sc = new Scanner(System.in); 
		boolean win;
		while(!(win = call(Short.parseShort(sc.next()),Short.parseShort(sc.next())))); 
		sc.close();
		System.out.println(win);
	}
	
	private static void showBoard(Board b) {
		for(short i = 0; i < b.getSize(); i++) {
			for(short k = 0; k < b.getSize(); k++) 
				System.out.print(b.getBoard()[i][k].simbol + " ");		
			System.out.println();		
		}
	}
}
