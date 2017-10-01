package Linkedlist;

//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList {
	private MagazineNode list;

	// ----------------------------------------------------------------
	// Sets up an initially empty list of magazines.
	// ----------------------------------------------------------------
	public MagazineList() {
		list = null;
	}

	// ----------------------------------------------------------------
	// Creates a new MagazineNode object and adds it to the end of
	// the linked list.
	// ----------------------------------------------------------------
	public void addToFront(Magazine mag) {
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;
		// MagazineNode tempNode;

		if (list == null) {
			list = node;
			list.next = null;
		}

		else {
			current = list;
			list = node;
			list.next = current;

		}
	}

	// public void addToFront(Magazine mag){

	// list = new MagazineNode(mag);

	// }
	public void addToEnd(Magazine mag) {
		MagazineNode newNode = new MagazineNode(mag);

		if (list == null) {
			list = newNode;
			list.next = null;
		} else {
			// System.out.println("next is" + temp.next);
			MagazineNode temp = list;
			if (!(temp.next == null)) {
				temp = temp.next;
				temp.next = newNode;
			}
		}
	}

	public void removeFirst() {
		if (list != null)
			list = list.next;
	}

	public void removeLast() {
		MagazineNode last = list.next;
		MagazineNode previous = list;
		if (last.next == null) {
			last = previous;
			previous.next = null;
		}

	}

	public void print() {
		System.out.println("-----------------------");
		System.out.println("List Magazines: ");
		MagazineNode temp = list;
		while (temp != null) {
			System.out.println(temp.magazine + " ");
			temp = temp.next;
		}
		System.out.println("\n---------------------\n");
	}

	// ----------------------------------------------------------------
	// Returns this list of magazines as a string.
	// ----------------------------------------------------------------
	public String toString() {
		String result = "";

		MagazineNode current = list;

		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}

		return result;
	}

	// *****************************************************************
	// An inner class that represents a node in the magazine list.
	// The public variables are accessed by the MagazineList class.
	// *****************************************************************
	private class MagazineNode {
		public Magazine magazine;
		public MagazineNode next;

		// --------------------------------------------------------------
		// Sets up the node
		// --------------------------------------------------------------
		public MagazineNode(Magazine mag) {
			this.magazine = mag;
			this.next = null;
		}
	}
}
