package se.hig.oodp.lab.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datatyper.Triangle;

public class TriangleTest {
	Triangle t;

	@Before
	public void setUp() throws Exception {
		t = new Triangle(-1, 1, 3, -1, 5, 3);
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testVertexPositions() {
		assertEquals("Error: Centre x position", 2, Math.round(t.getCentre().getX()), 0.0001);
		assertEquals("Error: Centre y position", 1, Math.round(t.getCentre().getY()), 0.0001);
	}
	
	@Test
	public void testMoveBy(){
		t.moveBy(3, 3);
		// Centre
		assertEquals("Error: MoveBy, x position", 5, Math.round(t.getCentre().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 4, Math.round(t.getCentre().getY()), 0.0001);
		// P0
		assertEquals("Error: MoveBy, x position", 2, Math.round(t.getP0().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 4, Math.round(t.getP0().getY()), 0.0001);
		// P1
		assertEquals("Error: MoveBy, x position", 6, Math.round(t.getP1().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 2, Math.round(t.getP1().getY()), 0.0001);
		// P2
		assertEquals("Error: MoveBy, x position", 8, Math.round(t.getP2().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 6, Math.round(t.getP2().getY()), 0.0001);
	}
	
	@Test
	public void testScale(){
		t.scale(1.21, 1.21);
		// Centre
		assertEquals("Error: MoveBy, x position", 2, Math.round(t.getCentre().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 1, Math.round(t.getCentre().getY()), 0.0001);
		// P0
		assertEquals("Error: MoveBy, x position", -2, Math.round(t.getP0().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 1, Math.round(t.getP0().getY()), 0.0001);
		// P1
		assertEquals("Error: MoveBy, x position", 3, Math.round(t.getP1().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", -1, Math.round(t.getP1().getY()), 0.0001);
		// P2
		assertEquals("Error: MoveBy, x position", 6, Math.round(t.getP2().getX()), 0.0001);
		assertEquals("Error: MoveBy, x position", 3, Math.round(t.getP2().getY()), 0.0001);
	}
	
	@Test
	public void testRotate(){
		t.rotate(30);
		// Centre
		assertEquals("Error: Rotate, x position", 2, Math.round(t.getCentre().getX()), 0.0001);
		assertEquals("Error: Rotate, y position", 1, Math.round(t.getCentre().getY()), 0.0001);
		// P0
		assertEquals("Error: Rotate P0, x position", -1, Math.round(t.getP0().getX()), 0.0001);
		assertEquals("Error: Rotate P0, y position", -1, Math.round(t.getP0().getY()), 0.0001);
		// P1
		assertEquals("Error: Rotate P1, x position", 4, Math.round(t.getP1().getX()), 0.0001);
		assertEquals("Error: Rotate P1, y position", 0, Math.round(t.getP1().getY()), 0.0001);
		// P2
		assertEquals("Error: Rotate P2, x position", 4, Math.round(t.getP2().getX()), 0.0001);
		assertEquals("Error: Rotate P2, y position", 4, Math.round(t.getP2().getY()), 0.0001);
	}
}
