package algorithms.edition4th.exercises.module1.utils;

public class Point2D {
	private int x;
	private int y;

	/**
	 * 
	 */
	public Point2D() {
	}

	/**
	 * @param x
	 * @param y
	 */
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point2D p) {
		double newX = (p.getX() - this.x) * (p.getX() - this.x);
		double newY = (p.getY() - this.y) * (p.getY() - this.y);
		return Math.sqrt(newX + newY);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

}
