package Algorithms;
//import java.util.Scanner;

//class Solution{
//   public static void main(String args[]){
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Enter the number:");
//      int n = scan.nextInt();
//      long[] array = new long[n];
//      long sum = 0;
//      System.out.println("Enter the elements:");
//      for (int i=0; i<n; i++)
//      {
//    	  array[i] = scan.nextLong();
//      }
//      for( long num : array) {
//          sum = sum+num;
//      }
//      System.out.println("Sum of array elements is:"+sum);
//   }
//}

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element" + (i + 1));
			array[i] = scan.nextInt();
		}
		int sum = 0;
		for (int num : array)
			sum = sum + num;

		System.out.println(sum);

	}

}