package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSort {

	public static void main(String[] args) {
		int count=0;
		Map <Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Hi");
		map.put(8, "Hee");
		map.put(14, "hello");
		map.put(18, "mom");
		map.put(24, "kid");
		map.put(22, "father");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			int i =(int) it.next();
			if(i%4!=0){
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
