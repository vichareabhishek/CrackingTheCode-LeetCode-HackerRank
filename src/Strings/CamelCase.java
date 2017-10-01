package Strings;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int num = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				num++;
		}
		System.out.println(num);

	}
}
