package Threads_And_Locks;

public class ExtendThread extends Thread {
	int count=0;
	public void run(){
		System.out.println("Thread started");
		
		while(count<5){
			System.out.println("Thread Running "+Thread.currentThread().getName());
			try{
				
				Thread.sleep(500);
				count++;
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}System.out.println("Thread terminated");
	
	}

	public static void main(String[] args) {
		
		ExtendThread obj = new ExtendThread();
		//Thread t1 = new Thread();
		//Thread t2 = new Thread();
		obj.start();
		//obj.start();
		
		while(obj.count!=5){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
