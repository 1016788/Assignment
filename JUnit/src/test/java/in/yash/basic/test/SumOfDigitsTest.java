package in.yash.basic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.yash.basic.SumOfDigits;

public class SumOfDigitsTest {
	
	SumOfDigits sum=new SumOfDigits();
	
	@Test
	 public void test(){  
	        assertEquals(7,sum.getSum(2+5));  
	    }
	@Test
	 public void test1(){  
	        assertEquals(21,sum.getSum(678));  
	    }

}
