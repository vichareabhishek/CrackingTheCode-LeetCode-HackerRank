package Collections;

import java.util.*;
public class Question5_Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','p','p','l','e'};
		Question5_Coll examp = new Question5_Coll();
		System.out.println(examp.getCount(arr));
		
	}
	public Map<Character,Integer> getCount(char[] ab){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c: ab)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		return map;
	}

}
