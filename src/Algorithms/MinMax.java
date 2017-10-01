package Algorithms;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		long sum = 0;
		System.out.println("Enter the numbers");
		for (int i = 0; i < 5; i++) {
			long num = in.nextLong();

			if (num < min)
				min = num;
			if (num > max)
				max = num;
			sum = sum + num;
		}
		System.out.println((sum - max) + " " + (sum - min));
	}

}
