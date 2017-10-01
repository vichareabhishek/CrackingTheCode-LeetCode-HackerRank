package Arrays;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array");
		int n = scan.nextInt();
		int[] array = new int[4];

		int d = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i > d)
				System.out.print(array[i] + " ");
		}
		for (int i = 0; i < d; i++)
			System.out.print(array[i] + " ");

	}

}
