package Arrays;
//Question 1 Cracking the Code 

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String a ="abc!12!lkdncnfjf";
		System.out.println(isUniqueChars(a));
		
	}
	
	public static boolean isUniqueChars2(String s){
		
		boolean[] char_set = new boolean[256];
		
		if(s.length()>256){
			return false;
		}
		
		for(int i=0; i<s.length(); i++){
			int val = s.charAt(i);
			//System.out.println(val);
			if(char_set[val]){
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
	
	
	public static boolean BitChecker(String s){
		
		int checker=0;
		
		for(int i=0; i<s.length(); i++){
			
			int charachterIndex = s.charAt(i)-'a';
			
			int bitPosition = 1 << charachterIndex;
			
			if((checker & bitPosition)>0){
				return false;
			}
			
			checker = checker | bitPosition;
			
			
		}
		return true;
		
	}
	
	
	
	
	
	 
	public static boolean isUniqueChars(String str) {
		int x =0;
		int flag = 0;
		for(int i=0; i<str.length(); i++){
			x = str.charAt(i);
			//System.out.println(x);
			for(int j=i+1; j<str.length(); j++){
				if(x==str.charAt(j)){
					flag++;
				}
				}
			}
			if(flag>0){
				return false;
				
			}else{
				return true;
			}
		}
		
		
		
		 

}
