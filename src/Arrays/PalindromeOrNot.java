package Arrays;
import java.util.*;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s ="ab#c!#aa ";
		String s1 = "b##AAca!";
		System.out.println(findPalindrome(s,s1));

	}
	
	public static boolean findPalindrome(String s, String t){
		
		s= s.toLowerCase().replaceAll(" ", "");
		t = t.toLowerCase().replaceAll(" ", "");
		
		if(s.length()!= t.length()){
			return false;
		}
		
		char[] arr1 = new char[s.length()];
		char[] arr2 = new char[t.length()];
		
		 arr1 = s.toCharArray();
		 arr2 = t.toCharArray();
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 return Arrays.equals(arr1, arr2);
		 		
}
}