package Algorithms;

import java.io.*;
import java.util.*;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		double p = 0, s = 0, q = 0;
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {

			a[i] = scan.nextInt();
			if (a[i] > 0)
				p++;
			if (a[i] < 0)
				s++;
			if (a[i] == 0)
				q++;
		}
		System.out.println(p / n);
		System.out.println(s / n);
		System.out.println(q / n);

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
	}
}