package Strings;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().toLowerCase();
		HashSet<Character> strn = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch))
				strn.add(ch);

		}
		System.out.println(strn.size() == 26 ? "pangram" : "not pangram");

	}
}
