package Linkedlist;

public class CompareLinkedList {
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	 
		while(headA !=null && headB !=null && headA.data==headB.data){
			headA = headA.next;
			headB = headB.next;
		}
		if(headA==headB){
			return 1;
		}
			
			else{
				return 0;
			
		}
	
	}
}
