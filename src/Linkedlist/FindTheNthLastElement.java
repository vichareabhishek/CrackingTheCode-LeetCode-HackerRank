package Linkedlist;

public class FindTheNthLastElement {
	
	public Node returnNthElement(Node head, int k){
		
		
		Node p1=head;
		Node p2 = head;
		
		for(int i=0; i<k-1; i++){
			p2=p2.next;
		}
		
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}

}
