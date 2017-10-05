package Arrays;

public class ReverseOnlyVowells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String reverseVowels(String s1) {
		 
		 char[] s = s1.toCharArray();
		 int start=0;
		 int end = s.length-1;
		 String vowels="aeiouAEIOU";
		 
		 while(start<end){
			 
			 while(start<end && !vowels.contains(s[start]+"")){
				 start++;
			 }
			 while(start<end && !vowels.contains(s[end]+"")){
				 end--;
			 }
			 
			 char temp = s[start];
			 s[start] = s[end];
			 s[end]=temp;
			 
			 start++;
			 end--;
			 
		 }
	       return new String(s);
}
}