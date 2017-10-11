package CrackingTheCode;
import java.util.*;
public class TwoStackToQueue {

	private Stack<E> inbox = new Stack<E>();
	private Stack<E> outbox = new Stack<E>();
	
	public void enqueue(E item){
		inbox.push(item);
	}
	
	public E dequeue(){
		
		if(outbox.isEmpty()){
			while(!inbox.isEmpty()){
				
				outbox.push(inbox.pop());
				
			}
			
		}
		return outbox.pop();
		
		
	}
	
	
	
}
class E{
	
}