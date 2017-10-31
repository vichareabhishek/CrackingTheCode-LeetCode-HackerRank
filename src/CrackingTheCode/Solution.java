package CrackingTheCode;

import java.util.*;

public class Solution {
	public static Map<String, Integer> map = new HashMap<String, Integer>();

	public static boolean solve(String magazine, String note) {
		String[] mag = magazine.split("\\s+");
		String[] not = note.split("\\s+");

		for (String s : mag) {
			if (map.containsKey(s)) {
				// int x = map.get(mag[i]);
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}
		// int count =0;
		for (String n : not) {
			if (!map.containsKey(n)) {
				return false;
			}
			int count = map.get(n) - 1;

			if (count == 0) {
				map.remove(n);
			} else {
				map.put(n, count);
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int m = scanner.nextInt();
		// int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		// scanner.nextLine();

		String a = scanner.nextLine();
		String b = scanner.nextLine();

		boolean answer = solve(a, b);
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");
		scanner.close();
	}
}
