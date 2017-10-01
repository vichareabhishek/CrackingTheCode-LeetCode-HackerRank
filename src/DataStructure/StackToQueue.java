package DataStructure;
import java.util.Stack;

//Program to convert stack to queue using 2 stacks
public class StackToQueue<E> {
	

	  private Stack<E> inbox = new Stack<E>();
	  private Stack<E> outbox = new Stack<E>(); 
	  
	  public void enqueue(E item ){
		 
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
