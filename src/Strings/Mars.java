package Strings;

import java.util.Scanner;

public class Mars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int count = 0;
		for (int i = 0; i < S.length(); i = i + 3) {
			if (S.charAt(i) != 'S')
				count++;
			if (S.charAt(i + 1) != 'O')
				count++;
			if (S.charAt(i + 2) != 'S')
				count++;
		}
		System.out.println(count);

	}

}