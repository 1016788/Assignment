package in.yash.basic;

public class CountOfEvenOdd {
	public  int countEvenOdd(int n)
	{
	    int even_count = 0;
	    int odd_count = 0;
	    while (n > 0)
	    {
	        int rem = n % 10;
	        if (rem % 2 == 0)
	            even_count++;
	        else
	            odd_count++;
	        n = n / 10;
	    }
	    System.out.println ( "Even count : " +
	                              even_count);
	    System.out.println ( "Odd count : " +
	                              odd_count);
	    if (even_count % 2 == 0 &&
	         odd_count % 2 != 0)
	        return 1;
	    else
	        return 0;
	}
	 
	    public static void main (String[] args)
	    {
	    	CountOfEvenOdd count=new CountOfEvenOdd();
	    int n;
	    n = 135246;
	    int t = count.countEvenOdd(n);
	     
	    if (t == 1)
	        System.out.println ( "YES" );
	    else
	        System.out.println( "NO") ;
	         
	    }

}
