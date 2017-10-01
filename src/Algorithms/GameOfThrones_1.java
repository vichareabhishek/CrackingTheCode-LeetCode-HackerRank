package Algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameOfThrones_1 {

	static String gameOfThrones(String s){
			
		Set<Character> set = new HashSet<Character>();
		
		for(char i: s.toCharArray()){
			if(set.contains(i)){
				set.remove(i);
			}else{
				set.add(i);
			}
		}
		if(set.size()<=1){
			return "Yes";
		}else{
			return "No";
		}
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }

}
