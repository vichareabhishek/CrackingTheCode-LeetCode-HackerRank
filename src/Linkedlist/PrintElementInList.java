package Linkedlist;

public class PrintElementInList {

	//Node head;
	public void print(Node head){
		Node current = head;
		if(head==null){
			return;
		}
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
	}

}


//class Node {
//    int data;
//    Node next;
//    public Node(int data){
//    	this.data=data;
//    }
// }