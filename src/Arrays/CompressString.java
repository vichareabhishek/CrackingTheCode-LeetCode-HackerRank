package Arrays;

public class CompressString {

	public static void main(String[] args) {
		String str = "aabbbbbc";
		System.out.println(compreseBetter(str));

	}
	
	public static String compress(String s){
		
		char last = s.charAt(0);
		int count =1;
		String s1 ="";
		for(int i=1; i<s.length(); i++){
			if(s.charAt(i)==last){
				count++;
				
			}else{
				 s1 = s1+last+""+count;
				count=1;
				last = s.charAt(i);
			}
		}
		return s1+last+count;
	}
	
	
	public static String compreseBetter(String s){
		int x = countCompress(s);
		if(x>=s.length()){
			return s;
		}
		
		StringBuffer sf = new StringBuffer();
		int count=1;
		char last = s.charAt(0);
		for(int i=1; i<s.length(); i++){
			if(s.charAt(i)==last){
				count++;
			}else{
				sf.append(last);
				sf.append(count);
				last = s.charAt(i);
				count=1;
			}
		}
		sf.append(last);
		sf.append(count);
		return sf.toString();
	}

	public static int countCompress(String s){
		if(s.length()==0 || s.isEmpty()){
			return 0;
		}
		
		char last = s.charAt(0);
		int count=1;
		int size=0;
		
		for(int i=1; i<s.length(); i++){
		if(s.charAt(i)==last){
			count++;
		}else{
			last = s.charAt(i);
			size = size+1+String.valueOf(count).length();
			count=1;
		}
		}
		size = size+1+String.valueOf(count).length();
		return size;
			
		
	}
}
