package CrackingTheCode;
import java.util.*;
public class FrequencyOfWords {

	 public String frequencySort(String s) {
	        
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(char c: s.toCharArray()){
	            if(map.containsKey(c)){
	            	map.put(c,map.get(c)+1);
	            }else{
	                map.put(c,1);
	            }
	        }
	        
	        List<Character>[] bucket = new List[s.length()+1];
	        
	        for(char a: map.keySet()){
	            int b = map.get(a);
	            if(bucket[b]==null){
	                bucket[b]= new ArrayList<Character>();
	            }
	                bucket[b].add(a);
	            
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(int l=bucket.length-1; l>=0; l--){
	            if(bucket[l]!=null){
	            for(char z: bucket[l]){
	                for(int k =0; k<map.get(z); k++){
	                    sb.append(z);
	                }
	            }
	            }
	        }
	        return sb.toString();    
	        
	    }
}
