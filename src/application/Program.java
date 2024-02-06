package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch yes = new ChessMatch();
		UI.printBoard(yes.getPieces());
	}

}
