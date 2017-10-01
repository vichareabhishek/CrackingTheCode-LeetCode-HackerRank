package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Sparse {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// String stn[] = new String[n];
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			arr.add(scan.next());

		int n1 = scan.nextInt();
		// String que[] = new String[n1];
		ArrayList<String> arr1 = new ArrayList<>();

		for (int i = 0; i < n1; i++)
			arr1.add(scan.next());

		for (int i = 0; i < n1; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr1.get(i).equals(arr.get(j))) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}
