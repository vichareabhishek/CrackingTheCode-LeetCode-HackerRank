package Linkedlist;

public class AddATNthElement {
	Node InsertNth(Node head, int data, int position) {
	    Node newNode = new Node(data);
	    
	    if(position==0){
	    	newNode = head.next;
	    	head = newNode;
	    }
	    Node current = head;
	    int curPos=0;
	    while(curPos != position-1){
	    	current = current.next;
	    	curPos++;
	    }
	    
	    newNode.next = current.next;
	    current.next=newNode;
	    return head;
	    
	}

}
