package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3, 4);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
        assertEquals(4, pt.getZ());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
        assertEquals(0, pt.getZ());
    }

    @Test
    public void testModulo() {
        assertEquals(5.3851, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
        assertEquals(3, pt.getZ());
    }

    @Test
    public void testSetX() {
        assertEquals(2, pt.getX());
        pt.setX(5);
        assertEquals(5, pt.getX());
    }

    @Test
    public void testSetY() {
        assertEquals(3, pt.getY());
        pt.setY(6);
        assertEquals(6, pt.getY());
    }

    @Test
    public void testSetZ() {
        assertEquals(4, pt.getZ());
        pt.setZ(7);
        assertEquals(7, pt.getZ());
    }

}
