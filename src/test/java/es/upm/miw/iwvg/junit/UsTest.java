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
	      assertEquals("JUAN PEREZ", user.fullName());   
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
	      assertEquals("JUAN", user.getName());   
	    }
	 
	 @Test
	 public void testFamily() {
	      assertEquals("PEREZ", user.getFamilyName());   
	    }
	 
	 @Test
	 public void testHello() {
		 User pepe = new User(2, "Pepe", "Pérez");
		 assertEquals("Hola PEPE PÉREZ tu numero identificatorio es 2", pepe.hello());   
	    }
	

}
