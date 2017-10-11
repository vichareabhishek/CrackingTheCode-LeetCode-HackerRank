package Arrays;

import java.util.HashMap;
import java.util.*;

public class CheckDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public boolean containsDuplicate(int[] nums) {
	        Set<Integer> set = new HashSet<Integer>();
	        
	       
	        for(int i=0; i<nums.length; i++){
	        	if(set.contains(nums[i])){
	        		return true;
	        	}
	        	set.add(nums[i]);
	        }
	            return false;
	        }
}
