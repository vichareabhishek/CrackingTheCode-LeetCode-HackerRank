package Collections;

import java.util.Stack;

public class PalindromeLinkedList {
	
	 public boolean isPalindrome(LinkedListNode head) {
	        
		 LinkedListNode fast=head;
		 LinkedListNode slow = head;
	      
	        Stack<Integer> stack = new Stack<Integer>();
	        while(fast!=null && fast.next!=null){
	            stack.push(slow.data);
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        
	        if(fast!=null){
	            slow = slow.next;
	        }
	        
	        while(slow!=null){
	            int data = stack.pop().intValue();
	            if(data!=slow.data){
	                return false;
	            }
	            slow = slow.next;
	        }
	        return true;
	        
	    }

}
