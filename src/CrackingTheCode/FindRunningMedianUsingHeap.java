package CrackingTheCode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindRunningMedianUsingHeap {
	
	public double[] ruuningMedian(int[] arr){
		
////		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(new Comparator<Integer>() {
////			
////			public int compare(Integer a, Integer b){
////				return -1 * a.compareTo(b); // to get the biggest element on the top coz by default priority queue returns lower number at top
////			}
//		});
		
		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
		
		double[] median = new double[arr.length];  
		
		for(int i=0; i<arr.length; i++){
			
			int number = arr[i];
			addNumber(number, lower,higher);
			rebalace(lower, higher);
			median[i]=getMedian(lower,higher);
		}
		
		return median;	
	}
	
	public static void addNumber(int number,PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
		
		if(lower==null || number<lower.peek()){
			lower.add(number);
		}else{
			higher.add(number);
		}
	}
	
	public void rebalace(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
		
		PriorityQueue<Integer> biggerHeap = lower.size()>higher.size() ? lower : higher;
		PriorityQueue<Integer> smallerHeap = lower.size()>higher.size() ? higher : lower;
		
		if(biggerHeap.size() - smallerHeap.size() >= 2){
			
			smallerHeap.add(biggerHeap.poll());
		}
		
	}
	
	public double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher){
		
		PriorityQueue<Integer> biggerHeap = lower.size()>higher.size() ? lower : higher;
		PriorityQueue<Integer> smallerHeap = lower.size()>higher.size() ? higher : lower;
		
		if(biggerHeap.size() == smallerHeap.size()){
			
			return (double)(biggerHeap.peek()+ smallerHeap.peek())/2;
		}else{
			
			return biggerHeap.peek();
		}
		
	}
	

}
