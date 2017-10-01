package Linkedlist;

public class AddElementAtStart {
	
	Node Insert(Node head,int x) {
		
		Node temp = new Node(x);
		
		temp = head;
		temp.next = head;
		head = temp;
		return head;
	    
	}

}
