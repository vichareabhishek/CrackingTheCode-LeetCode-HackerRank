package Java_HackerRank;

import java.util.Scanner;

public class JavaString {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int x = A.length()+B.length();
	        System.out.println(x);
	        if(A.compareTo(B)>0){
	            System.out.println("No");
	        }else{
	            System.out.println("Yes");
	        }
	         String m = A.substring(0, 1).toUpperCase()+ A.substring(1);
	         String n = B.substring(0, 1).toUpperCase()+B.substring(1);
	         
	         System.out.println(m);
	         System.out.println(n);
	}

}
