package Implementation;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numner");
		int n = in.nextInt();
		System.out.println("Enter marks");
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			int num = (((grade / 5) + 1) * 5);
			if (grade >= 38 && ((num - grade) < 3))
				grade = num;
			System.out.println(grade);
		}
	}
}
