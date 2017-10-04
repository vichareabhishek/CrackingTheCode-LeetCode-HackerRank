package CrackingTheCode;

import java.util.*;

public class J_Anagram {
	 
	public static void main(String[] args) {
		
		String s="abc";
		String s1= "cde";
		
		System.out.println(returnValue(s,s1));
		

	}
	public static int returnValue(String a, String b){
	
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for(char i: a.toCharArray()){
			arr1[i-'a']++;
			
			
			
		}
		for(char i: b.toCharArray()){
			arr1[i-'a']--;
			//System.out.println(arr1[4]);
			//System.out.println(i-'a');
		}
		
		int result =0;
		for(int i=0 ; i<26; i++){
		
			result = result+Math.abs(arr1[i]);
			//System.out.println(result);
		}
		return result;
}
}