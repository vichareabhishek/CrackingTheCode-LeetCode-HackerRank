package CrackingTheCode;

public class DetectCycle {
	
	public static class Node{
		
		Node next;
		int data;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	public boolean dextectCycle(Node head){
	Node slow = head;
	Node fast = head.next;
	
	while(fast!=null && fast.next!=null && slow!=null){
		
		if(fast==slow){
			return true;
			}
			else{
				slow = slow.next;
				fast = fast.next.next;
			}
		
	}
	return false;
	}
}
