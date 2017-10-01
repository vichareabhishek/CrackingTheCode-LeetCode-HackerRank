package Strings;

public class StringPlay {
	public static void main(String[] args) {
		String college = new String("Princeton University");
		String town = new String("Princeton, NJ, USA");
		// part (a), fill in your code here

		int stringLength;
		String change1, change2, change3, change4, change5;
		stringLength = college.length();

		// part (b), fill in your code here

		System.out.println(college + " contains " + stringLength + " characters.");
		change1 = college.substring(0, 3);
		System.out.println("'" + change1 + "'");
		change2 = college.substring(10, 20);
		System.out.println("'" + change2 + "'");
		change3 = college.toUpperCase();
		System.out.println("'" + change3 + "'");
		change4 = change3.replaceAll("O", "*");
		System.out.println("'" + change3 + "'");
		// part (c), fill in your code here
		change5 = college.concat(town);
		System.out.println("'" + change5 + "'");
		// part (d), fill in your code here

		// part (e), fill in your code here

		// part (f), fill in your code here

		// part (g), fill in your code here

		// fill in your code here to print out each changed string.
	}
}
