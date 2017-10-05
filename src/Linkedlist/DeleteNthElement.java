package Linkedlist;

public class DeleteNthElement {

	Node Delete(Node head, int position) {

		if (position == 0) {
			head = head.next;
			return head;
		}

		int curPos = 0;
		Node current = head;

		while (curPos != position - 1) {
			current = current.next;
			curPos++;
		}
		current.next = current.next.next;
		return head;
	}

}
