package in.yash.array;

import java.util.Scanner;

public class LCMAndHCF {
	
	   public static void main(String arg[]){
	      
		   Scanner sc=new Scanner(System.in);
		   int n1=sc.nextInt();
		   int n2=sc.nextInt();
		   
		   int m1=n1;
		   int m2=n2;
		   
		   while(n1%n2!=0) {
			   int rem=n1%n2;
			   n1=n2;
			   n2=rem;
			   
		   }
		   int gcd=n2;
		   int lcm=(m1*m2)/gcd;
		   
		   System.out.println(lcm);
		   System.out.println(gcd);
	   }

}
