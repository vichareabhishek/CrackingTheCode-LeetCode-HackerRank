package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappered {

	public static void main(String[] args) {
		int[] ar = {1,2,3,1,6,6};
		System.out.println(findDisappearedNumbers(ar));
	}
	
public static List<Integer> findDisappearedNumbers(int[] nums) {
	
	List<Integer> list = new ArrayList<Integer>();
		
	//Arrays.sort(nums);
	
	for(int i=0; i<nums.length; i++){
		
		int val = Math.abs(nums[i])-1;
		
		if(nums[val]>0){
			nums[val]=-nums[val];
		}
		
	}
	for(int i=0; i<nums.length; i++){
		if(nums[i]>0){
			list.add(i+1);
		}
	}
	
	
	return list;
        
    }


}
