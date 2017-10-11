package Linkedlist;

public class ArrangeElemensBeforeAfterValue {
	
	public Node returnArrangedNode(Node head, int value){
		
		
		Node before=null;
		Node after=null;
		
		while(head!=null){
			
			Node node = head.next;
			
			if(head.data<value){
				
				head.next=before;
				before = head;
			}else{
				head.next=after;
				after = head;
			}
			head=node;
			
		}
		
		if(before==null){
			return after;
			
		}else{
			while(before.next!=null){
				before = before.next;
			}
			before.next=after;
		}
		return head;
	}

}
