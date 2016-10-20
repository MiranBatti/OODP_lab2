package se.hig.oodp.lab.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datatyper.*;

public class CircleTest {
	Scaleable c;

	@Before
	public void setUp() throws Exception {
		c = new Circle(2, 1, 1);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testVertexPositions() {
		assertEquals("Wrong x position", 2, ((Circle) c).getCentre().getX(), 0.0001);
		assertEquals("Wrong y position", 1, ((Circle) c).getCentre().getY(), 0.0001);
		assertEquals("Wrong radius", 1, ((Circle) c).getRadius(), 0.0001);
	}
	
	@Test
	public void testMoveBy(){
		((Circle) c).moveBy(3, 3);
		assertEquals("Error: MoveByX", 5, ((Circle) c).getCentre().getX(), 0.0001);
		assertEquals("Error: MoveByX", 4, ((Circle) c).getCentre().getY(), 0.0001);
	}

	@Test
	public void testScale(){
		c.scale(1.21, 1.21);
		assertEquals("Error: ScaleX", 2, ((Circle) c).getCentre().getX(), 0.0001);
		assertEquals("Error: ScaleY", 1, ((Circle) c).getCentre().getY(), 0.0001);
		assertEquals("Error: Radius", 1.21, ((Circle) c).getRadius(), 0.0001);
	}
}
