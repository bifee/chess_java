package boardgame;

public class Board {
	private int rows;
	private int collum;
	private Piece[][] pieces;
	public Board(int rows, int collum) {
		this.rows = rows;
		this.collum = collum;
		pieces = new Piece[rows][collum];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getCollum() {
		return collum;
	}
	public void setCollum(int collum) {
		this.collum = collum;
	}
	public Piece piece(int rows, int collum) {
		return pieces[rows][collum];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollum()];
	}
}
