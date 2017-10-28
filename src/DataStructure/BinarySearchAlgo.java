package DataStructure;

public class BinarySearchAlgo {

	
	public static boolean binarySearch(int[] arr, int x){
		
		//return binarySearch(arr, x, 0, arr.length-1);
		return binaryIteration(arr, x);
	}
	
	//using recurssion
	public static boolean binarySearch(int[] arr, int x, int start, int end){
		
		if(end< start)
			return false;
		int mid = (end-start)/2;
		
		if(arr[mid]==x){
			return true;
		}
		else if(arr[mid]>x){
			return binarySearch(arr, x, mid+1, end);
			
		}else{
			return binarySearch(arr,x,start,mid-1);
		}
	}
	
	//using iteration
	public static boolean binaryIteration(int[] arr, int x){
		int start =0;
		int end = arr.length-1;
		
		if(end< start)
			return false;
		
		while(start<=end){
			int mid = (end-start)/2;
			
			if(arr[mid]==x){
				return true;
			}else if(arr[mid]>x){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		return false;
		
	}
}
