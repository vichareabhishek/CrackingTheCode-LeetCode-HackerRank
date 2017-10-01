package Algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int sum_primary_diagonal = 0;
		int sum_secondary_diagonal = 0;
		int absolute_difference_of_diagonals = 0;
		System.out.println("Enter the elements");
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();

				// logic for diagonal
				if (a_i == a_j) {
					sum_primary_diagonal = sum_primary_diagonal + a[a_i][a_j];
				}

				// logic for reverse diagonal
				if (a_i + a_j == n - 1)
					sum_secondary_diagonal = sum_secondary_diagonal + a[a_i][a_j];
			}
		}
		absolute_difference_of_diagonals = Math.abs(sum_primary_diagonal - sum_secondary_diagonal);
		System.out.println(absolute_difference_of_diagonals);
	}

}