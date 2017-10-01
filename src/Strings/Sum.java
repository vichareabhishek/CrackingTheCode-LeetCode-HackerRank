package Strings;

public class Sum {

	public static void main(String args[]){
		String s="hgh456ghjk";
		s = s.replaceAll("\\D","");
		System.out.println(s);
		int sum=0;
		int even=0;
		char[] arr=s.toCharArray();
		for(char c:arr){
			int i = c-'0';
			sum = sum+i;
			if(i%2==0){
				even = even+i;
			}
		}
		System.out.println(sum);
		System.out.println(even);
	}
}
