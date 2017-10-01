package Java_HackerRank;

import java.util.ArrayList;
import java.util.List;



public class StringReverse {

	public static void main(String[] args) {
		
		String A = "madam";
		
        StringBuilder sd = new StringBuilder(A);
       String B = sd.reverse().toString();
        if(A.equals(B)){
        	System.out.println("YEs");
        }else{
        	System.out.println("No");
        }
		
	}

}
