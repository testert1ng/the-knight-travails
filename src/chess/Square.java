package chess;

import java.util.*;

/**
 * This class is used to create square data type to store the path information
 * 
 * @author Junting ZHU
 * 
 */
public class Square {

	private Position position; // The position info of the square
	private ArrayList<Position> parent; // The parent positions of the square
										// (the last step position)
	private int steps; // The steps count

	/**
	 * Construct a Square with a specific position
	 * 
	 * @param position
	 *            the position of a square
	 */
	public Square(Position position) {
		this.position = position;
		this.parent = new ArrayList<Position>();
		this.steps = -1;
	}

	/**
	 * Set position of the square
	 * 
	 * @param position
	 *            the position of a square
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Record position of the parents
	 * 
	 * @param parent
	 *            the position of a parent square
	 */
	public void setParent(Position parent) {
		this.parent.add(parent);
	}

	/**
	 * Clear all the parents record
	 */
	public void clearParent() {
		this.parent.clear();
	}

	/**
	 * Set the step count -1: default 0: starting position 128: ending position
	 * other: the steps count
	 * 
	 * @param steps
	 *            the step count
	 */
	public void setSteps(int steps) {
		this.steps = steps;
	}

	/**
	 * Get the position
	 * 
	 * @return the position of square
	 */
	public Position getPosition() {
		return this.position;
	}

	/**
	 * Get the parent position list
	 * 
	 * @return the list of parent position
	 */
	public ArrayList<Position> getParent() {
		return this.parent;
	}

	/**
	 * Get the steps
	 * 
	 * @return the value of steps
	 */
	public int getSteps() {
		return this.steps;
	}

}
