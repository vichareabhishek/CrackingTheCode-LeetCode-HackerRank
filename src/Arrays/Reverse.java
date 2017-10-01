package Arrays;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers");
		int length = scan.nextInt();
		int[] values = new int[length];
		System.out.println("Enter numbers");
		for (int i = 0; i < length; i++)
			values[i] = scan.nextInt();
		System.out.println("the String is " + Arrays.toString(values));
		for (int i = length - 1; i >= 0; i--)
			System.out.print(values[i] + " ");

	}
}
