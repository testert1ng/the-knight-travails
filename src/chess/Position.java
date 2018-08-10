package chess;

/**
 * This class is used to create position data type to store the position info
 * and translate between the coordinate and Algebraic chess notation
 * 
 * @author Junting ZHU
 * 
 */
public class Position {
	private String position; // Algebraic chess notation
	private int x; // The x coordinate
	private int y; // The y coordinate
	private boolean valid; // Whether the Algebraic chess notation is valid

	/**
	 * Construct a position with Algebraic chess notation
	 * 
	 * @param position
	 *            the Algebraic chess notation style of position
	 */
	public Position(String position) {
		this.setPosition(position);
		this.checkValid();
	}

	/**
	 * Construct a position with x and y coordinates
	 * 
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 */
	public Position(int x, int y) {
		this.setX(x);
		this.setY(y);
		char c = (char) (y + 65);
		int i = x + 1;
		String p = String.valueOf(c) + i;
		this.setPosition(p);
	}

	/**
	 * Check the validation of an Algebraic chess notation
	 */
	public void checkValid() {
		char p1 = this.position.charAt(0);
		int p2 = Integer.parseInt(this.position.substring(1));

		if (p1 >= 65 && p1 <= 72 && p2 >= 1 && p2 <= 8) {
			this.valid = true;
			this.setX(p2 - 1);
			this.setY(p1 - 65);
		} else {
			this.valid = false;
			this.setX(-1);
			this.setY(-1);
		}

	}

	/**
	 * Set Algebraic chess notation
	 * 
	 * @param position
	 *            Algebraic chess notation format position
	 */
	public void setPosition(String position) {
		this.position = position.trim();
	}

	/**
	 * Set X coordinate
	 * 
	 * @param x
	 *            value of X coordinate
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Set Y coordinate
	 * 
	 * @param y
	 *            value of Y coordinate
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Get Algebraic chess notation
	 * 
	 * @return the Algebraic chess notation format position
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Get X coordinate
	 * 
	 * @return the value of X coordinate
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Get Y coordinate
	 * 
	 * @return the value of Y coordinate
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Get position validation
	 * 
	 * @return the validation of the position
	 */
	public boolean isValid() {
		return this.valid;
	}
}
