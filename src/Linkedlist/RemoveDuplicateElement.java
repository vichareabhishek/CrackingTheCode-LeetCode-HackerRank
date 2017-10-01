package Linkedlist;

public class RemoveDuplicateElement {
	
	Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method.
		
		if(head==null || head.next ==null){
			return head;
		}
		
		Node current = head;
		while(current.next!=null){
			if(current.data != current.next.data){
				current = current.next;
			}else{
				current.next = current.next.next;
			}
		}
		return head;

		}

}
