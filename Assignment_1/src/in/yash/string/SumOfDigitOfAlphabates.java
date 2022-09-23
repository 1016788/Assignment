package in.yash.string;

import java.util.Scanner;

public class SumOfDigitOfAlphabates {
		static int findTheSum(char []str)
		{
		    String alpha="";
		 
		    for (int i = 0; i < str.length; i++) {
		 
		        if ((str[i] >= 'A' && str[i] <= 'Z')
		            || (str[i] >= 'a' && str[i] <= 'z'))
		            alpha+=(str[i]);
		    }
		 
		    int sum = 0, n = 0;
		 
		    for (int i = 0; i < alpha.length(); i++) {
		 
		        if (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z')
		            sum += alpha.charAt(i) - 'A' + 1;
		        else
		            sum += alpha.charAt(i) - 'a' + 1;
		    }
		 
		    while (sum > 0 || n > 9) {
		        if (sum == 0) {
		            sum = n;
		            n = 0;
		        }
		        n += sum % 10;
		        sum /= 10;
		    }
		 
		    return n;
		}
		 
		public static void main(String[] args)
		{
		    String S = "abc";
		    System.out.print(findTheSum(S.toCharArray()));
		}
		
		
		
	}


