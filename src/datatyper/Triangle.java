package datatyper;

public class Triangle extends Shapes2D implements Rotateable, Scaleable{
	private Vertex2D p1, p2, centre;
	private double AB, BC, AC;
	/**
	 * Create 3 points of a triangle
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Triangle(double x0, double y0, double x1, double y1, double x2, double y2){
		p0 = new Vertex2D(x0, y0);
		p1 = new Vertex2D(x1, y1);
		p2 = new Vertex2D(x2, y2);
		AB = this.calculateSideAB();
		BC = this.calculateSideBC();
		AC = this.calculateSideAC();
		centre = this.calculateCentre();
	}
	/**
	 * Calculate the sides of the triangle
	 * @return double
	 */
	private double calculateSideAB(){
		double x = Math.sqrt(Math.pow(p0.getX(), 2) + Math.pow(p1.getX(), 2));
		double y = Math.sqrt(Math.pow(p0.getY(), 2) + Math.pow(p1.getY(), 2));
		return x + y;
	}
	private double calculateSideBC(){
		double x = Math.sqrt(Math.pow(p1.getX(), 2) + Math.pow(p2.getX(), 2));
		double y = Math.sqrt(Math.pow(p1.getY(), 2) + Math.pow(p2.getY(), 2));
		return x + y;
	}
	private double calculateSideAC(){;
		double x = Math.sqrt(Math.pow(p0.getX(), 2) + Math.pow(p2.getX(), 2));
		double y = Math.sqrt(Math.pow(p0.getY(), 2) + Math.pow(p2.getY(), 2));
		return x + y;
	}
	/**
	 * Calculates and creates a centre vertex
	 * @return new Vertex2D(x, y);
	 */
	private Vertex2D calculateCentre(){
		double x = p0.getX() + p1.getX() + p2.getX();
		double y = p0.getY() + p1.getY() + p2.getY();
		return new Vertex2D(x/3, y/3);
	}
	/**
	 * Move vertices to new positions
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public void moveTo(double x0, double y0, double x1, double y1, double x2, double y2){
		p0 = p0.moveTo(x0, y0);
		p1 = p1.moveTo(x1, y1);
		p2 = p2.moveTo(x2, y2);
		centre = null;
		centre = this.calculateCentre();
	}
	/**
	 * Move vertices by x and y amount
	 * @param d_x
	 * @param d_y
	 */
	public void moveBy(double d_x, double d_y){
		p0 = p0.moveBy(d_x, d_y);
		p1 = p1.moveBy(d_x, d_y);
		p2 = p2.moveBy(d_x, d_y);
		centre = null;
		centre = this.calculateCentre();
	}
	/**
	 * Rotate triangle by using the centre as reference.
	 * @param angle
	 */
	public void rotate(double angle){
		p0 = p0.rotate(centre, angle);
		p1 = p1.rotate(centre, angle);
		p2 = p2.rotate(centre, angle);
	}
	/**
	 * Enlarge or shrink the triangle
	 */
	public void scale(double factor_x, double factor_y){
		p0 = p0.scale(centre, factor_x, factor_y);
		p1 = p1.scale(centre, factor_x, factor_y);
		p2 = p2.scale(centre, factor_x, factor_y);
		centre = null;
		centre = this.calculateCentre();
		AB = Double.NaN;
		BC = Double.NaN;
		AC = Double.NaN;
		AB = this.calculateSideAB();
		BC = this.calculateSideBC();
		AC = this.calculateSideAC();
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
	public Vertex2D getP2(){
		return p2;
	}
	public double getSideAB(){
		return AB;
	}
	public double getSideBC(){
		return BC;
	}
	public double getSideAC(){
		return AC;
	}
	@Override
	public String toString(){
		return "P0:" + p0.toString() + " P1:" + p1.toString()
				+ " P2:" + p2.toString() + "Cent:" + centre.toString();
	}
	
}// end class
