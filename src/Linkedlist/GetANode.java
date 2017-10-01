package Linkedlist;

public class GetANode {

	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 

		Node current =head;
		Node result = head;
		int i = 0;
		
		while(current != null){
			
			current = current.next;
			 
			if(i++>n){
				result = result.next;
			}
		}
		return  result.data;
	}
}
