package Threads_And_Locks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Question3_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of counter ");
		int k = scan.nextInt();
		Junior exmp = new Junior();
		
		for(int i=0; i<k;i++){
			Thread t = new Thread(exmp);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(exmp.map);
		
}

}
class Junior implements  Runnable{
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter the line ");
			String b = scan.nextLine();
			
			char [] ch = b.toCharArray();
			
			for(char c: ch)
			{
				if(c=='a'|| c=='e'||c=='i'|| c=='o' || c=='u'){
					if(map.containsKey(c))
						map.put(c, map.get(c)+1);
					else
						map.put(c, 1);
				}
			}
			
	}
		
		
}	
	
