package Strings;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lexicographical {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        
        System.out.println(s.length());
        SortedSet<String> set = new TreeSet<String>();
        
        for(int i =0; i<=s.length()-k; i++){
        	set.add(s.substring(i, i+k));
        }
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        
        scan.close();
      
        //System.out.println(getSmallestAndLargest(s, k));
    }
}
