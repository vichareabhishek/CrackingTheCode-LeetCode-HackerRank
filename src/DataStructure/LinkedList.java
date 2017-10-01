package DataStructure;

public class LinkedList {
	
	Node head;
	
	public void append(int data){
		
		Node current = head;
		Node newNode = new Node(data);
		if(head==null){
			newNode = head;
			return;
		}
		
		while(current.next!=null){
			current = current.next;	
		}
		current.next=newNode;
		return;
	}
	
	public void prepend(int data){
		Node newNode =new Node(data);
		if(head==null){
			head =newNode;
			return;
		}
		
		newNode.next =head;
		head = newNode;
		return;
		
	}
	
	
	public void delete(int data){
		Node current = head;
		
		if(head==null){
			return;
		}
		
		if(head.data==data){
			head = head.next;
			return;
		}
		
		while(current !=null){
			if(current.next.data==data){
				current.next = current.next.next;
			}
			
			current = current.next;
			return;
		}
		
	}
	
	

}

class Node{
	
	Node next;
	int data;
	
	public Node(int data){
		
		this.data=data;
	}
	
}