package Strings;

public class RansomeNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="a";
		String s2="b";
		System.out.println(canConstruct(s1,s2));

	}
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        
	        int ch[] = new int[26];
	        
	        for(int i=0; i<magazine.length(); i++){
	            
	            ch[magazine.charAt(i)-'a']++;
	            
	        }
	         for(int i=0; i<ransomNote.length(); i++){
	            
	          if(--ch[ransomNote.charAt(i)-'a']<0)
	         
	          {
	         
	              return false;
	          } 
	          }
	         

	               return true;
	            
	        
	         
	    }

}
