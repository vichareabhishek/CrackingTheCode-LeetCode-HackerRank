package Algorithms;

public class Staircase {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
