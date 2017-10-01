
package Algorithms;

import java.io.*;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {

		int n = 4;
		int[] array = new int[n];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();

		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print((array[i]) + " ");
		}

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
	}
}
