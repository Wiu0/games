package com.games.hash;

public class BoardTest {

	static Board b = new Board();
	static byte qttMoves = 0;

	static boolean call(short x, short y) {

		showBoard(b);
		System.out.println("Type EXIT to finish the game. \n");
		try {
			b.setSimbol(Simbol.values()[(qttMoves++ % 2) + 1], x, y);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (UsedPosition e) {
			e.printStackTrace();
		} catch (InvalidPosition e) {
			e.printStackTrace();
		}
		return b.isCompletedGame();
	}

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); while(!call(Short.parseShort(sc.next()),
		 * Short.parseShort(sc.next()))); sc.close();
		 */
//		diagonalTest1();
//		diagonalTest2();
//		verticalTest1();
//		verticalTest2();
//		verticalTest3();
		horizontal1();
		System.out.println();
		showBoard(b);
		System.exit(0);
	}
	private static void horizontal1() {
		System.out.println("horizontal test 1");
		System.out.println(call((short)1,(short)1));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)3));
		System.out.println(call((short)1,(short)3));
		showBoard(b);
	}
	
	private static void verticalTest1() {
		System.out.println("Vertical test 1");
		System.out.println(call((short)1,(short)1));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)1));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)3,(short)1));
		showBoard(b);
	}

	private static void verticalTest2() {
		System.out.println("Vertical test 2");
		System.out.println(call((short)3,(short)3));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)1));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)3,(short)1));
		System.out.println(call((short)3,(short)2));
		showBoard(b);
	}
	private static void verticalTest3() {
		System.out.println("Vertical test 3");
		System.out.println(call((short)1,(short)3));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)3));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)3,(short)3));
		showBoard(b);
	}
	
	private static void diagonalTest1() {
		System.out.println("Diagonal test 1");
		System.out.println(call((short)1,(short)1));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)1,(short)3));
		System.out.println(call((short)3,(short)3));

		showBoard(b);
	}

	private static void diagonalTest2() {
		System.out.println("Diagonal test 2");
		System.out.println(call((short)1,(short)3));
		System.out.println(call((short)1,(short)2));
		System.out.println(call((short)2,(short)2));
		System.out.println(call((short)1,(short)3));
		System.out.println(call((short)3,(short)1));

		showBoard(b);
	}

	private static void showBoard(Board b) {
		for(short i = 0; i < b.getSize(); i++) {
			for(short k = 0; k < b.getSize(); k++) 
				System.out.print(b.getBoard()[i][k].simbol + " ");		
			System.out.println();		
		}
	}
}
