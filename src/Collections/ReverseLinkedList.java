package Collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedListNode reverse(LinkedListNode head){
		
		
			LinkedListNode newHead =null;
	        if(head==null|| head.next==null){
	            return head;
	        }
	        
	        while(head!=null){
	            
	        	LinkedListNode Node = head.next;
	            head.next= newHead;
	            newHead = head;
	            head= Node;
	        }
	        
	        return newHead;
	    }
		 
		
	

}
