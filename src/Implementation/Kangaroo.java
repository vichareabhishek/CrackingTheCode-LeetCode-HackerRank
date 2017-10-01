package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		boolean matched = false;
		boolean matchPossible = true;
		while (!matched && matchPossible) {

			x1 = x1 + v1;
			x2 = x2 + v2;

			if ((x1 > x2) && (v1 >= v2)) {
				matchPossible = false;
			}

			if ((x2 > x1) && (v2 >= v1)) {
				matchPossible = false;
			}

			if (x1 == x2) {
				matched = true;
			}
		}

		System.out.println(matched == true ? "YES" : "NO");
	}
}
