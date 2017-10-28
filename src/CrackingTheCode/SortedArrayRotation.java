package CrackingTheCode;

public class SortedArrayRotation {
	
	public boolean search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
        
    }
    public boolean search(int[] nums, int target, int left, int right){
         left = 0;
         right = nums.length-1;
        int mid = (left+right)/2;
        
        if(nums[mid]==target){
            return true;
        }
        if(left>right){
            return false;
        }
        
        if(nums[mid]<nums[left]){
            if(target > nums[mid] && target<nums[right]){
                return search(nums, target, mid+1, right);
            }else{
                return search(nums, target, left, mid);
            }
            
            
        }
    else if(nums[mid]>nums[right]){
        if(target<nums[mid] && target>nums[left]){
            return search(nums, target, left, mid);
        }else{
            return search(nums, target, mid+1, right);
        }
    }
    else if(nums[mid]==nums[left]){
        if(nums[mid]!=nums[right]){
            return search(nums, target, mid+1, right);
        }
        else{
            boolean flag =search(nums, target, left, mid);
            if(!flag){
                return search (nums, target, mid+1, right);
            }else{
                return flag;
            }
        }
    }
        return false;
        
    } 
        
    

}
