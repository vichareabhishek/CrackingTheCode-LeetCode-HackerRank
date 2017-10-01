package Implementation;

import java.util.Scanner;

public class Calender {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s;
		int n;
		System.out.println("Enter the year ");
		s = scan.next();

		while (!(s.equals("Quit"))) {
			n = Integer.parseInt(s);
			while (n < 1582) {
				System.out.println("Enter the year after 1582");
				n = scan.nextInt();
			}
			if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
				System.out.println("The year is leap year");
				System.out.println("Enter another year to check OR Enter 0 to exist");
				s = scan.next();
			} else {
				System.out.println("Not a leap year");
				System.out.println("Enter another year to check OR Enter 0 to exist");
				s = scan.next();
			}

		}
		System.out.println("End.....");

	}

}
