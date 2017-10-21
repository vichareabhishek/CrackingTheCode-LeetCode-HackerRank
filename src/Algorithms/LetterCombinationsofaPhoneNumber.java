package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	 public List<String> letterCombinations(String digits) {
	     
		 
		 LinkedList<String> queue = new LinkedList<String>();
		 if(digits.length()==0 || digits==null){
			 return queue;
		 }
		 queue.add("");
		 String[] arr = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		 
		 char[] ch = digits.toCharArray();
		 
		 for(int i=0; i<ch.length; i++){
			 
			 int x = Character.getNumericValue(ch[i]);
			 char[] letters = arr[x].toCharArray();
			 
			 while(queue.peek().length()==i){
				 String ans = queue.poll();
				 
				 for(char a : letters){
					 queue.add(a+ans);
				 }
			 }
		 }
		 return queue;
	    }
}
