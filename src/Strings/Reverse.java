package Strings;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int a[] = new int[s.length()];
		s = s.replaceAll("\\s", "");
		for (int i = 0; i < s.length(); i++)
			a[i] = scan.nextInt();

		s = s.replaceAll("\\s", "");
		System.out.println(s.length());
		for (int i = s.length(); i > 0; i--)
			System.out.print(s.charAt(i - 1));

	}
}
