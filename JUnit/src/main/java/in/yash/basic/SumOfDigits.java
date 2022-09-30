package in.yash.basic;

public class SumOfDigits {
	 public static int getSum(int n)
	    {
	        int sum = 0;
	 
	        while (n != 0) {
	            sum = sum + n % 10;
	            n = n / 10;
	        }
	 
	        return sum;
	    }
	 
	    public static void main(String[] args)
	    {
	        int n = 2+6/2*2;
	 
	        System.out.println(getSum(n));
	    }

}
