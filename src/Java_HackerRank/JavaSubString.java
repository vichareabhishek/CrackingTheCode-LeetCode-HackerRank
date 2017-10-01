package Java_HackerRank;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubString {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      SortedSet<String> set = new TreeSet<String>();
      for(int i=0; i<s.length()-k; i++){
    	  set.add(s.substring(i, i+k));
      }
       System.out.println(set.first());
       System.out.println(set.last());
    }
}
