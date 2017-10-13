package Strings;

public class LongestPalindromeInString {

	 public String longestPalindrome(String s) {
	        
	        int start=0; 
	        int end =0;
	        
	        for(int i=0; i<s.length(); i++){
	            
	            int l1 = expandFromMiddel(s,i,i);
	            int l2 = expandFromMiddel(s,i,i+1);
	            
	            int len = Math.max(l1,l2);
	            
	            if(len > end-start){
	                
	                start = i-(len-1)/2;
	                end = i+len/2;
	            }
	        }
	            return s.substring(start, end+1);
	        
	        
	    }
	    
	    public int expandFromMiddel(String s, int x, int y){
	        
	        int L=x; int R=y;
	        while(L>=0 && R<s.length() && s.charAt(L)== s.charAt(R)){
	            
	            L--;
	            R++;
	            
	        }
	        return(R-L-1);
	    }
}
