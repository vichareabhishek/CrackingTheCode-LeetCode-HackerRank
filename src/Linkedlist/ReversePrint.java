package Linkedlist;

public class ReversePrint {

	void ReversePrint(Node head) {
		
		if(head==null){
			return;
		}
		else{
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}
}
