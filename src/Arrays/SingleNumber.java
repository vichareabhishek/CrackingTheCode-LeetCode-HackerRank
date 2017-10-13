package Arrays;
import java.util.*;
public class SingleNumber {

public int singleNumber(int[] nums) {
	
	int result=0;
	
	for(int i=0; i<nums.length; i++){
		result= result^nums[i];
	}
 return result;       
}
}
