package datatyper;

public class Circle extends Shapes2D implements Scaleable{
	private double radius, circumference;
	private Vertex2D centre;
	/**
	 * Create Circle and sets an end point which helps
	 * with calculations when scaling the circle and moving the centre point.
	 * Calculates circumference as well
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(double x, double y, double radius){
		centre = new Vertex2D(x, y);
		this.radius = radius;
		p0 = this.calculateRadiusEndPoint();
		circumference = (Math.PI * 2) * radius;
	}
	/**
	 * Moves centre point by a certain amount.
	 * Sets a new end point from radius.
	 * @param d_x
	 * @param d_y
	 */
	public void moveBy(double d_x, double d_y){
		centre = centre.moveBy(d_x, d_y);
		p0 = this.calculateRadiusEndPoint();		
		radius = calculateNewRadius();
	}
	/**
	 * Moves centre to a new coordinate.
	 * Sets a new end point from radius.
	 * @param x
	 * @param y
	 */
	public void moveTo(double x, double y){
		centre = centre.moveTo(x, y);
		p0 = this.calculateRadiusEndPoint();		
		radius = this.calculateNewRadius();
	}
	/**
	 * Scales the circle by moving the radius end point.
	 * A new radius is then set.
	 * @param factor_x
	 * @param factor_y
	 */
	public void scale(double factor_x, double factor_y){
		p0 = p0.scale(centre, factor_x, factor_y);
		radius = this.calculateNewRadius();
	}
		/**
	 * Calculates a new radius when the circle is enlarged or reduced.
	 * @return newRadius
	 */
	private double calculateNewRadius() {
		double x = p0.getX() - centre.getX();
		double y = p0.getY() - centre.getY();
		double newRadius = (x + y) / 2;
//		double newRadius = (Math.PI * 2) / this.getCircumference();
//		double newRadius = Math.abs(p0.getX() + centre.getX());
//		double newRadius = Math.pow(centre.getX(), 2) + Math.pow(centre.getY(), 2);
		return newRadius;
	}
	/**
	 * From the radius end point, a new vertex is created
	 * @return Vertex2D instance
	 */
	private Vertex2D calculateRadiusEndPoint(){
		double x = centre.getX() + radius;
		double y = centre.getY() + radius;
		return new Vertex2D(x, y);
	}
	/**
	 * Getters
	 */
	@Override
	public Vertex2D getP0() {
		return p0;
	}
	public Vertex2D getCentre() {
		return centre;
	}
	public double getCircumference(){
		return circumference;
	}
	public double getRadius(){
		return radius;
	}

	@Override
	public String toString(){
		return "Centre:" + centre.toString() + " Radius:" + this.radius + " P0:" + p0.toString();
	}
	
} // end class
