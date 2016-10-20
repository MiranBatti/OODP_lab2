package datatyper;

public class Line extends Shapes2D implements Rotateable, Scaleable{
	private Vertex2D p1, centre;
	/**
	 * Creates a line by creating 2 vertices
	 * Also marks the centre of the line
	 * @param x0 -x-coordinates for the first vertex
	 * @param y0 -y-coordinates for the first vertex
	 * @param x1 -x-coordinates for the second vertex
	 * @param y1 -y-coordinates for the second vertex
	 */
	public Line(double x0, double y0, double x1, double y1){
		p0 = new Vertex2D(x0, y0);
		p1 = new Vertex2D(x1, y1);
		centre = this.calculateCentre();
	}
	/**
	 * Calculates the centre of the line
	 * by dividing the length by 2
	 * returns a Vertex2D object
	 * @return centre vertex
	 */
	private Vertex2D calculateCentre(){
		double x = (p0.getX() + p1.getX()) / 2;
		double y = (p0.getY() + p1.getY()) / 2;
		return new Vertex2D(x, y);
	}
	/**
	 * Move vertices to new coordinates
	 * Centre is moved and therefore re-calculated
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 */
	public void moveTo(double x0, double y0, double x1, double y1){
		p0 = p0.moveTo(x0, y0);
		p1 = p1.moveTo(x1, y1);
		centre = this.calculateCentre();
	}
	/**
	 * Moves verices to new positions by a certain amount from
	 * the previous position
	 * @param d_x0
	 * @param d_y0
	 * @param d_x1
	 * @param d_y1
	 */
	public void moveBy(double d_x, double d_y){
		p0 = p0.moveBy(d_x, d_y);
		p1 = p1.moveBy(d_x, d_y);
		centre = this.calculateCentre();
	}
	/**
	 * rotates line anti-clockwise(if positive angle)
	 * by using the centre of the line as reference
	 * @param angle
	 */
	public void rotate(double angle){
		p0 = p0.rotate(centre, angle);
		p1 = p1.rotate(centre, angle);
	}
	/**
	 * enlarge or shrink the line
	 * @param factor_x
	 * @param factor_y
	 */
	public void scale(double factor_x, double factor_y){
		p0 = p0.scale(centre, factor_x, factor_y);
		p1 = p1.scale(centre, factor_x, factor_y);
		centre = this.calculateCentre();
	}
	/**
	 * Getters
	 */
	@Override
	public Vertex2D getP0() {
		return p0;
	}
	public Vertex2D getP1(){
		return p1;
	}
	public Vertex2D getCentre() {
		return centre;
	}
	@Override
	public String toString(){
		return "v0:" + p0.toString() + "v1:" + p1.toString();
	}
}// end class
