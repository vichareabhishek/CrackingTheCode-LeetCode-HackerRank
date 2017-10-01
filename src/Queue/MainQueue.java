package Queue;

public class MainQueue {

	private Node head;// remove from head
	private Node tail;// enter or add from tail
	
	public boolean isEmpty(){
		if(head==null){
			return true;
		}else
			return false;
	}
	
	
	public int peek(){
		return head.data;
	}
	
	
	public void add(int value){
		if(tail==null){
			Node newNode = new Node(value);
			tail= newNode;
		}else{
			Node newNode = new Node(value);
			if(tail!=null){
				tail.next=newNode;
			}
			
			
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