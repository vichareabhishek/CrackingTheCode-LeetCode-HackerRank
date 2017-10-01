package Linkedlist;

public class ReverseLinkList {
	
	Node Reverse(Node head) {
		if(head==null){
			return null;
		}
		
		if(head.next==null){
			return head;
		}
		
		Node preNode=null;
		Node curNode=head;
		Node nextNode =null;
		
		while(curNode !=null){
			
			nextNode = curNode.next;
			curNode.next = preNode;
			preNode = curNode;
			curNode = nextNode;
		}
		head = preNode;
		return head;
	}

}
