package Algorithms;

public class MergeSort {
	
	public static void mergesort(int[] arr){
		
		mergesort(arr, new int[arr.length], 0, arr.length-1);
		
	}
	public static void mergesort(int[] arr,int[] temp, int leftStart, int RightEnd){
		int mid = (leftStart+RightEnd)/2;
		
		mergesort(arr,temp, leftStart, mid);
		mergesort(arr,temp, mid+1, RightEnd);
		mergeHalf(arr, temp, leftStart, RightEnd);
	}
	
	public static void mergeHalf(int[] arr, int[] temp, int leftStart, int rightEnd){
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = leftEnd+1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		int size = leftEnd-rightStart+1;
		
		while(left<= leftEnd && right<= rightEnd){
			if(arr[left]<=arr[right]){
				arr[index]=arr[left];
				left++;
			}else{
				arr[index]= arr[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(arr, leftStart, temp, index, leftEnd-leftStart+1);
		System.arraycopy(arr, rightStart, temp, index, rightEnd-rightStart+1);
		System.arraycopy(temp,index,arr,leftStart,size);
	}

}
