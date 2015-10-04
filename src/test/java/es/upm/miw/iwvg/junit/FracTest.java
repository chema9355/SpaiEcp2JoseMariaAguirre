package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FracTest {
    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(1, 2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction(1, 1);
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, fraction.decimal(), 0.00001);
    }

    @Test
    public void testIsEquivalent() {
        assertEquals(true, fraction.isEquivalent(new Fraction(2, 4)));
    }
    
    @Test
    public void testIsInteger() {
    	Fraction integerFraction = new Fraction(40, 8);
    	Fraction notIntegerFraction = new Fraction(20, 7);
    	
        assertTrue(integerFraction.integerNumber());
        assertFalse(notIntegerFraction.integerNumber());
    }

}
