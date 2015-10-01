package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class UsTest {
	private User user;
	
	@Before
	public void before() {
        user = new User(1,"juan","perez");
    }

	
	 @Test
	 public void testFullName() {
	      assertEquals("Juan Perez", user.fullName());   
	    }
	 
	 @Test
	 public void testInitials() {
	      assertEquals("J.", user.initials());   
	    }
	 
	 @Test
	 public void testNumber() {
	      assertEquals(1, user.getNumber());   
	    }
	 
	 @Test
	 public void testName() {
	      assertEquals("Juan", user.getName());   
	    }
	 
	 @Test
	 public void testFamily() {
	      assertEquals("Perez", user.getFamilyName());   
	    }
	

}
