package datatyper;

public class Rectangle extends Shapes2D implements Rotateable, Scaleable{
	private Vertex2D p1, p2, p3, centre;
	/**
	 * Create first 2 vertices, then the other 2
	 * by rotating the "line"
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 */
	public Rectangle(double width, double height, double centreX, double centreY){
		centre = new Vertex2D(centreX, centreY); 
		p0 = new Vertex2D(centre.getX() - (width / 2), centre.getY() + (height / 2));
		p1 = new Vertex2D(centre.getX() + (width / 2), centre.getY() + (height / 2));
		p2 = new Vertex2D(centre.getX() - (width / 2), centre.getY() - (height / 2));
		p3 = new Vertex2D(centre.getX() + (width / 2), centre.getY() - (height / 2));
	}
	/**
	 * Computes the center of the rectangle
	 * @return centre
	 */
	private Vertex2D calculateCentre(){
		double x = (p0.getX() + p1.getX()) / 2;
		double y = (p0.getY() + p1.getY()) / 2;
		return new Vertex2D(x, y);
	}
	/**
	 * Rotates the rectangle
	 * @param angle degrees
	 */
	public void rotate(double angle){
		centre = getCentre();
		p0 = p0.rotate(centre, angle);
		p1 = p1.rotate(centre, angle);
		p2 = p2.rotate(centre, angle);
		p3 = p3.rotate(centre, angle);
	}
	/**
	 * Move rectangle to a new position
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 */
	public void moveTo(double x0, double y0, double x1, double y1, double x2 , double y2, double x3, double y3){
		p0 = p0.moveTo(x0, y0);
		p1 = p1.moveTo(x1, y1);
		centre = this.calculateCentre();
		p2 = p2.moveTo(x2, y2);
		p3 = p3.moveTo(x3, y3);
	}
	/**
	 * Move rectangle coordinates by x and y amount
	 * @param d_x0
	 * @param d_y0
	 * @param d_x1
	 * @param d_y1
	 */
	public void moveBy(double d_x, double d_y){
		p0 = p0.moveBy(d_x, d_y);
		p1 = p1.moveBy(d_x, d_y);
		centre = this.calculateCentre();
		p2 = p2.moveBy(d_x, d_y);
		p3 = p3.moveBy(d_x, d_y);
	}
	public void scale(double factor_x, double factor_y){
		p0 = p0.scale(centre, factor_x, factor_y);
		p1 = p1.scale(centre, factor_x, factor_y);
		p2 = p2.scale(centre, factor_x, factor_y);
		p3 = p3.scale(centre, factor_x, factor_y);
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
	public Vertex2D getP2(){
		return p2;
	}
	public Vertex2D getP3(){
		return p3;
	}
	public Vertex2D getCentre(){
		return centre;
	}
	/**
	 * Returns String with locations of each vertex
	 */
	@Override
	public String toString(){
		return p0.toString() + p1.toString() + p2.toString() + p3.toString();
	}
	
}//end class
