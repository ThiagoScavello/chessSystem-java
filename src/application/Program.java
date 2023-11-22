package application;

import boardgame.Board;
import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		Board board = new Board(0, 0);
		ChessMath chessMath = new ChessMath();
		UI.printBoard(chessMath.getPieces());

	}

}
