package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TutorialChalenge {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (m == arr[i]) {
				System.out.println(i);
			}
		}

	}
}
