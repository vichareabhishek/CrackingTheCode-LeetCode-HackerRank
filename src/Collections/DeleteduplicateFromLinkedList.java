package Collections;
import java.util.*;
public class DeleteduplicateFromLinkedList {
	// with using buffer space uses O(n) space and uses O(n) time
	public void deleteDuplicate(LinkedListNode n){
		
		Hashtable table = new Hashtable();
		
		LinkedListNode previous = null;
		
		while(n!=null){
			if(table.contains(n.data)){
				previous = n.next;
				
			}else{
				table.put(n.data, true);
				previous = n;
			}
			n= n.next;
		}
		
	}
	
	//without using buffer space uses O(n) space but uses O(n^2) time
	
	public void deleteDublicteWithoutBuffer(LinkedListNode head){
		
		LinkedListNode current = head;
		
		while(current!=null){
			
			LinkedListNode runner = current;
			
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next = runner.next.next;
				}else{
				runner = runner.next;
				}
			}
			current = current.next;
		}
		
	}

}
