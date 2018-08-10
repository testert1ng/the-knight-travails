import java.util.Scanner;

import chess.*;

/**
 * The Knight's Travails main class
 * 
 * @author Junting ZHU
 * 
 */
public class KnightTravails {
	
	/**
	 * Call the run method to start the program
	 */
	public KnightTravails() {
		this.run();
	}

	/**
	 * Console based user interface which used to handle the user's choice 
	 */
	public void run() {
		System.out.println("******Welcome to the Knight's Travails******");
		System.out.println("***********Author: JUNTING ZHU**************");
		while (true) {
			System.out.println("\n");
			ChessBoard chessBoard = new ChessBoard();
			chessBoard.showBoard();
			System.out
					.println("Please input the Starting Position and Ending Position (Please separate them by a space):");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine().trim().toUpperCase();

			if (str.equalsIgnoreCase("Q")) {
				System.out.println("******End of the Knight's Travails******");
				break;
			}

			try {
				String[] positions = str.split(" ");
				Position startPos = new Position(positions[0]);
				Position endPos = new Position(positions[1]);

				if (positions.length != 2) {
					this.retry();
				} else if (startPos.isValid() && endPos.isValid()) {
					if (positions[0].equalsIgnoreCase(positions[1])) {
						System.out.println("No need to Move.");
					} else {
						Move move = new Move(startPos, endPos);

						move.showResult();
					}

				} else {
					this.retry();
				}
			} catch (Exception e) {
				this.retry();
			}

		}

	}

	/**
	 * When invalid input occurred, tell users what should do 
	 */
	public void retry() {
		System.out.println("\nInvalid Input! Please input as'Xi Yj'");
		System.out
				.println("X, Y are cloumns form A to H; i, j are rows from 1 to 8");
		System.out.println("or input 'Q' for QUIT");
	}

	/**
	 * This is the entry of the program
	 * 
	 * @param args
	 *            Command line inputs.
	 */
	public static void main(String[] args) {
		KnightTravails kt = new KnightTravails();
	}

}
