package in.yash.string;

import java.util.Scanner;

public class UppercaseToLowercaseViceVersa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter characters");
		String nextLine = sc.nextLine();
		char[] ch = nextLine.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((int)ch[i] + 32);
			} else {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) ((int)ch[i] - 32);
				}

			}

		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);

		}
		sc.close();
	}

}
