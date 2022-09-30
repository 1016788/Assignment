package in.yash.basic.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.yash.basic.Binary;

public class BinaryTest {
	
	Binary b=new Binary();
	
	@Test  
    public void test(){  
        assertEquals(111,b.bin(111));  
    } 
	@Test  
    public void test2(){  
        assertEquals(110,b.bin(111));  
    } 

}
