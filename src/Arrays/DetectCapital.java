package Arrays;

public class DetectCapital {
	
	 public boolean detectCapitalUse(String word) {
	        
	        if(word.equals(word.toUpperCase())||
	          (word.equals(word.toLowerCase()))||
	           (Character.isUpperCase(word.charAt(0))
	            && word.substring(1).equals(word.substring(1).toLowerCase())                      
	                                )){
	               return true;
	           }else{
	               return false;
	           }
	          
	          
	          
	          
	        
	    }
}
