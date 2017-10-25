package Algorithms;

public class QuickSort {

	public static void quickSort(int[] arr){
		
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int start, int end){
		
		int pivot = arr[(start+end)/2];
		int index = partition(arr, start, end, pivot);
		
		quickSort(arr, start, index);
		quickSort(arr, index+1, end);
		
	}
	
	public static int partition(int[] arr, int start, int end , int pivot){
		
		while(start<=end){
			
			while(arr[start]<= pivot){
				start++;
			}
			while(arr[end]> pivot){
				end--;
			}
			if(start<=end){
				//swap(arr, start, end);
				start++;
				end--;
			}
			
			
		}
		return start;
		
	}
}
