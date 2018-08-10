package chess;

/**
 * This class is used to create a chess board and show the board
 * 
 * @author Junting ZHU
 * 
 */
public class ChessBoard {

	private Square[][] board; // 8*8 size chess board

	/**
	 * Construct a chess board
	 */
	public ChessBoard() {
		this.board = new Square[8][8];
		this.init();
	}

	/**
	 * Initial the values of the squares in chess board
	 */
	public void init() {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				Square square = new Square(new Position(i, j));
				this.board[i][j] = square;
			}
		}
	}

	/**
	 * Get the chess board
	 * 
	 * @return the array of squares which are represent the chess board
	 */
	public Square[][] getBoard() {
		return this.board;
	}

	/**
	 * Set the chess board
	 * 
	 * @param booard
	 *            the array of squares which are represent the chess board
	 */
	public void setBoard(Square[][] board) {
		this.board = board;
	}

	/**
	 * Set the a single square
	 * 
	 * @param square
	 *            a single square in the chess board
	 */
	public void setSquare(Square square) {
		int x = square.getPosition().getX();
		int y = square.getPosition().getY();
		this.board[x][y] = square;
	}

	/**
	 * Show the chess board in console
	 */
	public void showBoard() {
		System.out.println("===================");
		System.out.println("  A B C D E F G H  ");
		for (int i = 7; i >= 0; i--) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j <= 7; j++) {
				if (this.board[i][j].getSteps() == -1) {
					System.out.print("_ ");
				} else if (this.board[i][j].getSteps() == 0) {
					System.out.print("S ");
				} else if (this.board[i][j].getSteps() == 128) {
					System.out.print("E ");
				} else {
					System.out.print(this.board[i][j].getSteps() + " ");
				}

			}
			System.out.println(i + 1 + " ");
		}
		System.out.println("  A B C D E F G H  ");
		System.out.println("===================");
	}

}
