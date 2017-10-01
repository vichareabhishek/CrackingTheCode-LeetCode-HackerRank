package CrackingTheCode;

public class Example {
	 public static void main(String[] args) {
		 
		 String a="abzwkje";
			String b= "cde";
			
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			
			for(char i: a.toCharArray()){
				System.out.println(arr1[i-'a']++);
				//System.out.println(i-'a');
				
			}
		 
		 
		 
	 }

}
