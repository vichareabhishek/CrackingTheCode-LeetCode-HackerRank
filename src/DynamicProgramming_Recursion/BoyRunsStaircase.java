package DynamicProgramming_Recursion;

public class BoyRunsStaircase {
	
	public int runStaircase(int n, int[] arr){
		
		if(n<0){
			return 0;
		}
		else if(n==0){
			return 1;
		}
		else if(arr[n]>-1){
			return arr[n];
		}else{
		arr[n]= runStaircase(n-1, arr)+runStaircase(n-2, arr)+runStaircase(n-3, arr);
		
		return arr[n];
		}
	}

}
