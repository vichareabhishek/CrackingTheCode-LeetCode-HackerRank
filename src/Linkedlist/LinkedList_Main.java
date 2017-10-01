package Linkedlist;

class   Node{
	Node next;
	int data;
	
	public Node(int data){
		this.data=data;
	}
}

public class LinkedList_Main {
	
	Node head;
	
	public void append(int data){
		
		if(head==null){
			head = new Node(data);
		}
		
		Node current=head;
		
		while(current.next !=null){
			
			current = current.next;
		}
		
		current.next = new Node(data);
		
	}
	
	public void prepend(int data){
		
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteElement(int data){
		if(head.data==data){
			head = head.next;
			return;
		}
		
		Node current=head;
		while(current.next !=null){
			if(current.next.data==data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

}
 