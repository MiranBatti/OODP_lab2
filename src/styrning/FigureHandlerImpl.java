package styrning;

import java.util.List;
import datatyper.*;

public class FigureHandlerImpl implements FigureHandler{
	private List<Shapes2D> l1;

	@Override
	public void createCircle(double x, double y, double radius) {
		l1.add(new Circle(x, y, radius));
	}

	@Override
	public void createLine(double x0, double y0, double x1, double y1) {
		l1.add(new Line(x0, y0, x1, y1));
	}

	@Override
	public void createPoint(double x, double y) {
		l1.add(new Point(x, y));
	}

	@Override
	public void createRectangle(double width, double height, double centreX, double centreY) {
		l1.add(new Rectangle(width, height, centreX, centreY));
	}

	@Override
	public void createTriangle(double vx0, double vy0, double vx1, double vy1,
			double vx2, double vy2) {
	}

	@Override
	public void removeAll() {
		l1.removeAll(l1);
	}
}
