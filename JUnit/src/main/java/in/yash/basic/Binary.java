package in.yash.basic;

public class Binary {
	public int bin(int n)
    {
        if (n > 1)
            bin(n / 2);
 
        System.out.print(n % 2);
		return n;
    }
 
    public static void main(String[] args)
    {
    	Binary b=new Binary();
       b. bin(7);
        System.out.println();
       b. bin(4);
    }

}
