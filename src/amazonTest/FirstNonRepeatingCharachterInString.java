package amazonTest;

public class FirstNonRepeatingCharachterInString {

	public static char[] ch = new char[256];
	
	public static void getArrayCount(String s){
		
		for(int i=0; i<s.length(); i++){
			ch[s.charAt(i)]++;
		}
		
	}
	
	public static int getIndex(String s){
		getArrayCount(s);
		int index=0;
		for(int i=0; i<s.length(); i++){
			if(ch[s.charAt(i)]==1){
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public static void main(String[] args) {
		
		String s ="geek!!#forgeek";
		
		int x = getIndex(s);
		System.out.println(s.charAt(x));

	}

}
