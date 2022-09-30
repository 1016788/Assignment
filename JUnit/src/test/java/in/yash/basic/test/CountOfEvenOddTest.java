package in.yash.basic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.yash.basic.CountOfEvenOdd;

public class CountOfEvenOddTest {
	
	CountOfEvenOdd count=new CountOfEvenOdd();
	
	@Test
	 public void test(){  
	        assertEquals(2,2,count.countEvenOdd(1234));  
	    }

}
