package in.yash.basic;

public class SumOf100To200 {
	
	 public static void main(String args[])
	 {
	 int sum = 0, count = 0;
	 for (int i = 101; i < 200; i++)
	 {
	     if (i % 7 == 0)
	     {
	         sum = sum + i;
	         count++;
	     }
	 }
	 System.out.println("The Sum of the number between 100 to 200 which are divisible by 7 is: "+sum);
	 }

}
