package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
	
	 public String[] findWords(String[] words) {
	        
	        String[] arr = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
	        
	       Map<Character, Integer> map = new HashMap<Character, Integer>();
	        
	       for(int i=0; i<arr.length; i++){
	    	   for(char c: arr[i].toCharArray()){
	    		   map.put(c, i);
	    	   }
	       }
	       List<String> list = new LinkedList<String>();
	       for(String w : words){
	    	   
	    	   int index = map.get(w.toUpperCase().charAt(0));
	    	   
	    	   for(char c: w.toUpperCase().toCharArray()){
	    		   if(map.get(c)!=index){
	    			   index=-1;
	    			   break;
	    		   }
	    		  
	    		   }
	    	   if(index!=-1){
    			   list.add(w);
	    	   }
	    	   
	       }
	       return list.toArray(new String[0]);
	 }

}
