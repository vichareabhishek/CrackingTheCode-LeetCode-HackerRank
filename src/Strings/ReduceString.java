package Strings;

import java.util.Scanner;

public class ReduceString {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		StringBuilder str = new StringBuilder(s);
		if (s.length() == 0)
			System.out.print("Empty String");
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				str.deleteCharAt(i);
				str.deleteCharAt(i - 1);
				i = 0;
			}

		}
		if (str.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(str);
	}

}
