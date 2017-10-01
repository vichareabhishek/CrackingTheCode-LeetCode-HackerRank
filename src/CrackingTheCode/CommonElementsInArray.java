package CrackingTheCode;

import java.util.*;

public class CommonElementsInArray {

	

	public static void main(String[] args) {
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	
		Map<String,String> map1= new HashMap<String, String>();
		Map<String,String> map2 = new HashMap<String, String>();
		
		for(int i=0; i<s1.length; i++){
			map1.put(s1[i],  "Const");
		}
		for(int i=0; i<s2.length; i++){
			if(!map1.containsKey(s2[i])){
				map1.put(s1[i], "Const");
			}else{
				map2.put(s2[i], "Const");
			}
		}
		
		System.out.println(map2);
	}

}
