package chess;

import java.util.*;

/**
 * This class is used to calculate the Knight's moves and show the shortest
 * results
 * 
 * @author Junting ZHU
 * 
 */
public class Move {

	private Position startPos; // The starting position
	private Position endPos; // The ending position
	private ChessBoard chessBoard; // A chess board used for demonstration
	private Square[][] board; // A chess board used to calculation the path

	private int[] direction;// 8 directions used for check the valid moves

	private ArrayList<String> path;// A list used to store all the possible
									// shortest paths

	/**
	 * Construct Move with starting position and ending position
	 * 
	 * @param startPos
	 *            the starting position
	 * @param endPos
	 *            the ending position
	 */
	public Move(Position startPos, Position endPos) {
		this.startPos = startPos;
		this.endPos = endPos;
		this.direction = new int[2];

		this.path = new ArrayList<String>();
		this.chessBoard = new ChessBoard();
		this.init();
		this.run();
	}

	/**
	 * Initial the chess board for calculation
	 */
	public void init() {
		this.chessBoard.init();
		Square startSquare = new Square(this.startPos);
		startSquare.setSteps(0);
		this.chessBoard.setSquare(startSquare);

		Square endSquare = new Square(this.endPos);
		endSquare.setSteps(128);
		this.chessBoard.setSquare(endSquare);

		this.board = this.chessBoard.getBoard();
	}

	/**
	 * Check and calculate the shortest path
	 */
	public void run() {
		int shotestPath = 64;
		for (int steps = 1; steps < shotestPath; steps++) {
			for (int i = 7; i >= 0; i--) {
				for (int j = 0; j <= 7; j++) {
					Square square = this.board[i][j];
					if (square.getSteps() == steps - 1) {
						for (int d = 0; d <= 7; d++) {
							this.setDirection(d);
							int tempX = i + this.direction[0];
							int tempY = j + this.direction[1];
							if (tempX >= 0 && tempX <= 7 && tempY >= 0
									&& tempY <= 7) {
								if (this.board[tempX][tempY].getSteps() == -1) {
									this.board[tempX][tempY].setSteps(steps);
									this.board[tempX][tempY].setParent(square
											.getPosition());
								} else if (this.board[tempX][tempY].getSteps() == 128) {
									shotestPath = steps;
									this.board[tempX][tempY].setParent(square
											.getPosition());

								} else if (this.board[tempX][tempY].getSteps() == steps) {
									this.board[tempX][tempY].setParent(square
											.getPosition());
								} else if (this.board[tempX][tempY].getSteps() >= steps) {
									this.board[tempX][tempY].clearParent();
									this.board[tempX][tempY].setSteps(steps);
									this.board[tempX][tempY].setParent(square
											.getPosition());
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Change the checking directions
	 * 
	 * @param d
	 *            the index of possible move directions
	 */
	public void setDirection(int d) {
		if (d == 0) {
			direction[0] = 1;
			direction[1] = 2;
		} else if (d == 1) {
			direction[0] = 1;
			direction[1] = -2;
		} else if (d == 2) {
			direction[0] = -1;
			direction[1] = 2;
		} else if (d == 3) {
			direction[0] = -1;
			direction[1] = -2;
		} else if (d == 4) {
			direction[0] = 2;
			direction[1] = 1;
		} else if (d == 5) {
			direction[0] = 2;
			direction[1] = -1;
		} else if (d == 6) {
			direction[0] = -2;
			direction[1] = 1;
		} else if (d == 7) {
			direction[0] = -2;
			direction[1] = -1;
		}
	}

	/**
	 * Show the shortest results in both words and chess board graph
	 */
	public void showResult() {
		int tempX = this.board[this.endPos.getX()][this.endPos.getY()]
				.getParent().get(0).getX();
		int tempY = this.board[this.endPos.getX()][this.endPos.getY()]
				.getParent().get(0).getY();
		int steps = this.board[tempX][tempY].getSteps() + 1;

		this.buildPath(this.endPos);
		System.out.println("There are " + this.path.size()
				+ " shotest path paths in " + steps + " step(s):");
		for (String s : this.path) {
			System.out.println("\n" + s.substring(3));
			String[] p = s.split(" ");
			this.buildBoard(p);
			this.chessBoard.setBoard(this.board);
			this.chessBoard.showBoard();
		}
		System.out
				.println("******************End of the Results*****************");

	}

	/**
	 * Rebuild the path of the Knight's possible moves
	 * 
	 * @param position
	 *            a position which records its parents
	 */
	public void buildPath(Position position) {
		Square square = this.board[position.getX()][position.getY()];
		ArrayList<Position> parents = square.getParent();
		if (square.getSteps() == 128) {
			for (Position p : parents) {
				String str = p.getPosition() + " " + position.getPosition();
				this.path.add(str);
				this.buildPath(p);
			}
		} else if (square.getSteps() == 0) {

		} else {
			for (int i = 0; i < this.path.size(); i++) {
				String currentString = this.path.get(i);
				if (currentString.substring(0, 2).equalsIgnoreCase(
						position.getPosition())) {

					for (Position p : parents) {
						String str = p.getPosition() + " " + currentString;
						this.path.add(str);
						this.buildPath(p);
					}
					this.path.remove(i);
					i = -1;
				}

			}
		}

	}

	/**
	 * Rebuild the chess board for demonstration
	 * 
	 * @param p
	 *            a sequence of shortest path
	 */
	public void buildBoard(String[] p) {
		this.init();
		for (int i = 1; i < p.length - 1; i++) {
			Position pos = new Position(p[i]);
			Square squ = new Square(pos);
			squ.setSteps(i);
			this.chessBoard.setSquare(squ);
		}
	}
}
