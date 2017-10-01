package Java_HackerRank;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int[] arr = {1,2,4};
	String[] arr1 = {"abc","pqr"};
	
	public void print(Object[] O){
		for(Object obj: O){
			System.out.println(obj);
		}
	}
}
