package Strings;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		int len = s.length();
		String result = s.substring(0, 1).toUpperCase()+s.substring(1, len-1)+s.substring(len-1, len).toUpperCase();
		System.out.println(result);
		scan.close();
	}

}
