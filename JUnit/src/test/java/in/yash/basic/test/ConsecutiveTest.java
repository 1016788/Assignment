package in.yash.basic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.yash.basic.Consecutive;

public class ConsecutiveTest {
	
	Consecutive cons=new Consecutive();
	
	@Test
	 public void testaddUpTo(){  
	        assertEquals(21,cons.addUpTo(6));  
	    } 
	
}
