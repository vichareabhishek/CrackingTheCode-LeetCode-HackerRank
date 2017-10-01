package Linkedlist;

import java.util.Scanner;
//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

public class MagazineRack {
	private static Scanner scan;
	private static MagazineList rack = new MagazineList();

	// Magazine mag;
	// ----------------------------------------------------------------
	// Creates a MagazineList object, adds several magazines to the
	// list, then prints it.
	// ----------------------------------------------------------------
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		printMenu();
		int select = scan.nextInt();
		while (true) {
			if (select == 1) {
				System.out.println("Program terminated");
				break;
			} else {
				dispatch(select);
				printMenu();
				select = scan.nextInt();

			}
		}
		// System.out.println("Program terminated");
		// rack.add (new Magazine("Time"));
		// rack.add (new Magazine("Woodworking Today"));
		// rack.add (new Magazine("Communications of the ACM"));
		// rack.add (new Magazine("House and Garden"));
		// rack.add (new Magazine("GQ"));

		// System.out.println (rack);
	}

	public static void dispatch(int select) {
		String newMag;
		switch (select) {
		/*case 1:
			System.out.println("Program terminated");
			break;*/
		case 2:
			System.out.println("Enter title of magazine: ");
			newMag = scan.next();
			rack.addToFront(new Magazine(newMag));
			break;
		case 3:
			System.out.println("Enter title of magazine: ");
			newMag = scan.next();
			rack.addToEnd(new Magazine(newMag));
			break;
		case 4:
			rack.removeFirst();
			break;
		case 5:
			rack.removeLast();
			break;
		case 6:
			// rack.print();
			System.out.println(rack);
			break;
		default:
			System.out.println("Invalid selection");
		}
	}

	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println("------------------");
		System.out.println("1: Exit");
		System.out.println("2: Add a magazine to the front of the list ");
		System.out.println("3: Add a magazine to the end of the list ");
		System.out.println("4: Remove a magazine from the front of the list ");
		System.out.println("5: Remove a magazine from the end of the list ");
		System.out.println("6: Print list of magaines ");
		System.out.print("\nEnter your selection: ");
	}
}
