package Threads_And_Locks;

public class ImplementRunnable implements Runnable {
	int count=0;
	public void run(){
		
		System.out.println("Thread Started ");
		
		while(count<5){
			System.out.println("Runnable Thread started "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
				count++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Thread Interupped");
			}
			
		}System.out.println("Thread Terminated");
	}
	

	public static void main(String[] args) {
		
		ImplementRunnable obj = new ImplementRunnable();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
		
		while(obj.count!=5){
			try{
			Thread.sleep(5000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
