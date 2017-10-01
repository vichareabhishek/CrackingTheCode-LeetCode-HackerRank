package Linkedlist;

public class MergeList {
	
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
		
		Node currA = headA;
		Node currB = headB;
		
		while(currA != currB){
			
			if(currA.next == null){
				currA = headB;
			}
			else{
				currA = currA.next;
				
			}
			if( currB.next == null){
				currB = headA;
			}
			else{
				currB = currB.next;
			}
		
		}
		return currB.data;
		
		
		

	}


}
