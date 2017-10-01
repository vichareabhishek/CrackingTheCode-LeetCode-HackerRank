package Algorithms;
import java.util.*;

public class Panagram {

	public static void main(String[] args) {
		
		String s= "We promptly judged antique ivory buckles for the next prize";
		
		s= s.replaceAll(" ", "").toLowerCase();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++){
			set.add(s.charAt(i));
			
		}
		
		if(set.size()==26){
			System.out.println("pangram");
		}else{
			System.out.println("no pangram");
		}
	}

}
