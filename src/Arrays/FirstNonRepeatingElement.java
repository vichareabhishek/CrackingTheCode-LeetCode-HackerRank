package Arrays;

public class FirstNonRepeatingElement {
	static char[] ch = new char[256];
	
	 static void getCount(String s){
	
		for(int i=0; i<s.length(); i++){
			ch[s.charAt(i)]++;
			 
		}
	}
	 static int getNonRepeatingIndex(String s){
		getCount(s);
		
		int index =-1;
		for(int i=0; i<s.length(); i++){
			if(ch[s.charAt(i)]==1){
				index=i;
				break;
			}
			
		}
		return index;
	}
public static void main(String[] args) {
	
		String a ="geeksforgeeks";
		
		int index = getNonRepeatingIndex(a);
		if(index==1){
			System.out.println("Noting repeated");
		
		}else{
			System.out.println(a.charAt(index));
		}
	}
	
}
