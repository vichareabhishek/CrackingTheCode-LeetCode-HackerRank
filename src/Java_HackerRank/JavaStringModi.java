package Java_HackerRank;

import java.util.Scanner;

public class JavaStringModi {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String token = "[.,'?! ]+";
        
        String[] ans = s.split(token);
        System.out.println(ans.length);
        for(String k: ans){
        System.out.println(k);
    }
                scan.close();
    }
}
