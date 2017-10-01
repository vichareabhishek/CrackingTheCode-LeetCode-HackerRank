package Java_HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	static boolean isAnagram(String a, String b) {
        
		 String c=a.toLowerCase();
		String d = b.toLowerCase();
		System.out.println(c);
		System.out.println(d);
        if(c.length() != d.length()){
            return false;
        }
        
        char[] ch = c.toCharArray();
        char[] ch1 = d.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        
        if(Arrays.equals(ch, ch1)){
            return true;
        }else{
            return false;
        }
    }
}


