package datatyper;

public class Point extends Shapes2D{
	private Vertex2D p0;
	/**
	 * Creates a simple vertex for a point
	 * @param x
	 * @param y
	 */
	public Point(double x, double y){
		p0 = new Vertex2D(x, y);
	}
	/**
	 * Moves point
	 * @param factor_x
	 * @param factor_y
	 */
	public void moveBy(double d_x, double d_y){
		p0 = p0.moveBy(d_x, d_y);
	}
	/**
	 * Gives point/vertex new coordinates
	 */
	public void moveTo(double x, double y){
		p0 = p0.moveTo(x, y);
	}
	@Override
	public Vertex2D getP0() {
		return p0;
	}
	@Override
	public String toString(){
		return "P0:" + p0.toString();
	}
	
}//end class
