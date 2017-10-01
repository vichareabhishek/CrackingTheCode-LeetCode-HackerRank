package DataStructure;

public class Stack {
	
	class Node{
		Node next;
		int data;
		public Node(int data){
			this.data = data;
		}
	}
	private Node top;
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public int peek(){
		return top.data;
	}
	
	public void push(int value){
		Node newNode = new Node(value);
		
		
			newNode.next = top;
			top = newNode;
		
		
	}
	public int pop(){
		
		int data = top.data;
		
		top = top.next;
		return data;
	}

}
