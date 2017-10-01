package DS_Test;

import java.util.Scanner;

public class Algorithm {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 <q; a0++){
	            String s = in.next();
     
		 int k = s.length();
		 
		 if(k%2 ==0){
		
		int[] arr1 = new int[26];
		
		
		for(int i=0; i<k/2; i++){
			arr1[s.charAt(i)-'a']++;
		}
		for(int i=k/2; i<k; i++){
			if(arr1[s.charAt(i)-'a']>0){
			arr1[s.charAt(i)-'a']--;
			}
		}
		
		int index =0;
		
		for(int i=0; i<26; i++){
			index = index+arr1[i];
		}
		System.out.println(index);
		 }else{
			 System.out.println("-1");
		 }
	    }
}
}