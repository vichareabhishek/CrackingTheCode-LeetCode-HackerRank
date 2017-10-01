package Linkedlist;

public class MergeTwoLink {
	
	Node mergeLists(Node headA, Node headB) {
		
		if(headA==null && headB!=null){
			return headB;
		}
		if(headA !=null && headB==null){
			return headA;
		}
		if(headA.data<=headB.data){
			headA.next = mergeLists(headA.next, headB);
		}
		if(headA.data>headB.data){
			Node temp = headB;
			headB = headB.next;
			temp.next = headA;
			headA = temp;
			headA.next = mergeLists(headA.next, headB);
		}
		return headA;
		
	}

}
