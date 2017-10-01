package Linkedlist;

public class AddElementAtEnd {

	Node Insert(Node head,int data) {
		//This is a "method-only" submission. 
		//You only need to complete this method. 
		
		 Node temp = new Node(data);
		 
		 temp.next=null;
		 
		  if(head == null){
			   temp = head;
			   return temp;
		  }
		  Node current = head;
		  while(current.next != null){ 
			  current=current.next;
		  }
		  current.next = temp;
		  return head;
		}
}



