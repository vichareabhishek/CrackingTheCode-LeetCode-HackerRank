package CrackingTheCode;

public class PutOneArrayIntoOther {
	
	public static void merge(int[] arr, int sizeA, int sizeB){
		
		int lastIndexA = sizeA-1;
		int lastIndexB = sizeB-1;
		int lastIndexMerge = sizeA+sizeB-1;
		
		
		while(lastIndexA>=0 && lastIndexB>=0){
			if(arr[lastIndexA]>= arr[lastIndexB]){
				arr[lastIndexMerge] = arr[lastIndexA];
				lastIndexA--;
				lastIndexMerge--;
			}else{
				arr[lastIndexMerge] = arr[lastIndexB];
				lastIndexB--;
				lastIndexMerge--;
			}
		}
		while(lastIndexB>=0){
			arr[lastIndexMerge]=arr[lastIndexB];
			lastIndexB--;
			lastIndexMerge--;
		}
		
		
	}

}
