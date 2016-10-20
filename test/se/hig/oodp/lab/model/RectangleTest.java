package se.hig.oodp.lab.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datatyper.Rectangle;

public class RectangleTest {
	private Rectangle r;
	private double height = 6, width = 4;

	@Before
	public void setUp() throws Exception {
		r = new Rectangle(height, width, 2, 1);
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void testVertexPositions() {
		//P2
		assertEquals("Wrong position1", -1, r.getP2().getX(), 0.0001);
		assertEquals("Wrong position2", -1, r.getP2().getY(), 0.0001);
		//P1
		assertEquals("Wrong position3", 5, r.getP1().getX(), 0.0001);
		assertEquals("Wrong position4", 3, r.getP1().getY(), 0.0001);
		//P3
		assertEquals("Wrong position5", 5, r.getP3().getX(), 0.0001);
		assertEquals("Wrong position6", -1, r.getP3().getY(), 0.0001);
		//P0
		assertEquals("Wrong position7", -1, r.getP0().getX(), 0.0001);
		assertEquals("Wrong position8", 3, r.getP0().getY(), 0.0001);
	}
	
	@Test
	public void testCentre(){
		assertEquals("Wrong position", 2, r.getCentre().getX(), 0.0001);
		assertEquals("Wrong position", 1, r.getCentre().getY(), 0.0001);
	}
	
	@Test
	public void testScale(){
		r.scale(1.21, 1.21);;
		//P3
		assertEquals("Wrong position", -1.63, r.getP2().getX(), 0.0001);
		assertEquals("Wrong position", -1.42, r.getP2().getY(), 0.0001);
		//P1
		assertEquals("Wrong position", 5.63, r.getP1().getX(), 0.0001);
		assertEquals("Wrong position", 3.42, r.getP1().getY(), 0.0001);
		//P2
		assertEquals("Wrong position", 5.63, r.getP3().getX(), 0.0001);
		assertEquals("Wrong position", -1.42, r.getP3().getY(), 0.0001);
		//P0
		assertEquals("Wrong position", -1.63, r.getP0().getX(), 0.0001);
		assertEquals("Wrong position", 3.42, r.getP0().getY(), 0.0001);
	}

	@Test
	public void testRotate(){
		r.rotate(30.0);
		
		assertEquals("Wrong position", 0.402, r.getP2().getX(), 0.0001);
		assertEquals("Wrong position", -2.232, r.getP2().getY(), 0.0001);
	}
}
