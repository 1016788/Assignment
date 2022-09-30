package in.yash.basic;

import java.util.Scanner;

public class Consecutive {

	public static void main(String arg[])	
	{
		Consecutive con=new Consecutive();
	    int n;
            Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter a number :");
	      n=sc.nextInt();
	    
	    System.out.println("Add Up To("+n+") ----->"+con.addUpTo(n));	  
	}
	public int addUpTo(int n)
	{
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		sum=sum+i;
	   }
	   return sum;
        }     
	}    


