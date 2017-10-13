package Strings;

public class RomanToInteger {
	public int romanToInt(String s) {
        
        int[] nums = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            char c  = s.charAt(i);
            
            switch(c){
                case'I':
                    nums[i]=1;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'X':
                    nums[i]=10;
                    break;
                case 'M':
                nums[i]=1000;
                break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
            
            }
        }
        int result =0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
               result = result - nums[i];
            }else{
                 result = result+nums[i];
            }
        }
        return result+nums[nums.length-1];
    }
}
