package amazonTest;

import java.util.*;
import java.lang.*;
import java.io.*;

class starFindder {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numOfTestcase = s.nextInt();
		int counter =0;;
		int numOfitems = 0;
		int [] intarr = null;
		while(counter<numOfTestcase){
			numOfitems = s.nextInt();			
			intarr = new int[numOfitems];
			for(int i=0;i<numOfitems;i++){
				intarr[i]= s.nextInt();
			}
			
			
			int currentMax = intarr[intarr.length-1];
			int superStar = currentMax;
			int arrtrack = intarr.length-1;
			intarr[arrtrack]= currentMax;
			for(int i=intarr.length-2;i>=0;i--){
				if(intarr[i]>currentMax){
					currentMax = intarr[i];
					arrtrack--;
					intarr[arrtrack]= currentMax;
					superStar = currentMax;
				}else if(intarr[i]==currentMax){
					superStar = -1;
				}
			}
			
			for(int i=arrtrack;i<intarr.length;i++){
				System.out.print(intarr[i]+" ");
			}
			System.out.println();
			System.out.println(superStar);
			
			counter++;
		}
	
	    
	}
}