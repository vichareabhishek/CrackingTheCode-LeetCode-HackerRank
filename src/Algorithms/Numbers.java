package Algorithms;

import java.util.Scanner;

public class Numbers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scan.nextInt();
		int zero = 0;
		int even = 0;
		int odd = 0;
		while (n != -1) {
			while (n > 0) {
				int q = n % 10;
				if (q == 0)
					zero++;
				else if (q % 2 == 0)
					even++;
				else
					odd++;
				n = n / 10;
			}
			System.out.println("Zero are " + zero + ", ODD are " + odd + ", Even are " + even);
			System.out.println("Enter postive number or -1 to exist");
			n = scan.nextInt();
		}
		System.out.println("Exist");
	}
}
