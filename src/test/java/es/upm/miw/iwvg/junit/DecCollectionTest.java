package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class DecCollectionTest {
	private DecimalCollection decimalCollection;
	
	@Before
	public void before() {
        decimalCollection = new DecimalCollection();
    }

	
	 @Test
	 public void testSize() {
	      decimalCollection.add(1);
	      assertEquals(1, decimalCollection.size());
	    }
	
	 @Test
	 public void testSum() {
		  decimalCollection.add(1);
		  decimalCollection.add(2);
		  decimalCollection.add(3);
	      assertEquals(6,decimalCollection.sum(),0.00);
	      
	    }
	 
	 @Test
	 public void testHigher() {
		  decimalCollection.add(1);
		  decimalCollection.add(2);
		  decimalCollection.add(3);
	      assertEquals(3,decimalCollection.higher(),0);
	      
	    }
	
	 
	
}
