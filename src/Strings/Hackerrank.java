package Strings;

import java.util.Scanner;

public class Hackerrank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		String hack = "hackerrank";
		for (int a0 = 0; a0 < q; a0++) {
			String s = scan.next();

			int i = 0;
			int j = 0;
			while (i < s.length() && j < hack.length()) {
				if (s.charAt(i) == hack.charAt(j)) {
					i++;
					j++;
				} else
					i++;
			}
			if (j == 10)
				System.out.println("YES");
			else
				System.out.println("No");
		}
	}
}