package DataStructure;

public class Queue {

	class Node{
		
		Node next;
		int data;
		
		public Node(int data){
			this.data=data;
		}
	}
	private Node head;
	private Node tail;
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int peek(){
		
		int data = head.data;
		return data;
	}
	
	public void insert(int value){
		Node newNode = new Node(value);
		
		if(tail!=null){
			tail.next = newNode;
		}
		tail = newNode;
		
		if(tail==null){
			head=newNode;
		}
	}
	
	public int remove(){
		
		int data = head.data;
		head = head.next;
		if(head==null){
			tail=
					null;
		}
		return data;
	}
}
