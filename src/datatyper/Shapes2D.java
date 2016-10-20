package datatyper;

public abstract class Shapes2D {
	protected Vertex2D p0;
	
	public abstract void moveBy(double d_x, double d_y);
		
	public abstract Vertex2D getP0();
		
	public abstract String toString();
}// end class
