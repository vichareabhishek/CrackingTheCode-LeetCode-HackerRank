package Arrays;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		
		int arr[] = {2,7,11,15};
		int t = 9;
		
		int ans[] = twoSum(arr,t);
		for(int x : ans){
			System.out.println(x);
		}
	}

	public static int[]  twoSum(int[]nums, int target){
		
		int[] result = new int[2];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(target-nums[i])){
				
				result[0]= map.get(target-nums[i]);
				result[1]=i;
				
			}else{
				map.put(nums[i], i);
			}
		}
		return result;
		
	}
}
