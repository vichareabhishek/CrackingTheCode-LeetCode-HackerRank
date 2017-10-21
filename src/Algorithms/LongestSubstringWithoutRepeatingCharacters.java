package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

//Brute force Method of solving
public int lengthOfLongestSubstring(String s) {
     
        
        int ans=0;
       
        for(int i=0; i<s.length(); i++){
            
            for(int j=i+1; j<=s.length(); j++){
                if(returnSet(s,i,j)){
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }
        
        public boolean returnSet(String s, int start, int end){
            Set<Character> set = new HashSet<Character>();
            for(int i=start; i<end; i++){
                if(set.contains(s.charAt(i))){
                	return false;
                }else{
                     set.add(s.charAt(i));
                    
                }
               
            }
         return true;
        
    }
        
        
//Better way of solving	
 public int lengthOfLongestSubstring2(String s) {
                
                int i=0; int j=0; int ans=0;
                int n = s.length();
                
                Set<Character> set = new HashSet<Character>();
                
                while(i<n && j<n){
                    if(!set.contains(s.charAt(j))){
                        set.add(s.charAt(j++));
                        ans = Math.max(ans,j-i);
                    }else{
                        set.remove(s.charAt(i++));
                    }
                }
             return ans;
            }
}
