package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMath {
	private Board board;
	public ChessMath() {
		board = new Board(8,8);

		initialSetup();
	}
	public ChessPiece[][] getPieces(){
		 ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		 for (int i = 0; i< board.getRows() ; i++) {
			 for(int j = 0; j < board.getColumns() ; j++) {
				 mat[i][j] = (ChessPiece) board.piece(i,j);
			 }
		 }
		 return mat;
	}
	
	private void initialSetup() {
		placeNewPiece('B',6,new Rook(board, Color.White));
	}
	private void placeNewPiece(char column,int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		
	}
}