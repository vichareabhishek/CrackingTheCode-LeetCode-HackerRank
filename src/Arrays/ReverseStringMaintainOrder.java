package Arrays;

public class ReverseStringMaintainOrder {

	
public static void main(String[] args) {
		
	String s ="My name is abhishek";
	System.out.println(reverseString(s));
	}


	public static String reverseString(String s){
		
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2= new StringBuffer();
	
	String [] st =s.split(" ");
	
	for(int i=0; i<st.length; i++){
		sb1.append(sb2.append(st[i]).reverse()+" ");
		
		sb2.setLength(0);
		
	}
	return sb1.toString();
	
}
public String reverseWords(String s) {
        
        String[] arr = s.split(" ");
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        for(int i=0; i<arr.length; i++){
            
            sb1.append(sb2.append(arr[i]).reverse()+" ");
            sb2.setLength(0);
        }
        return sb1.toString().trim();
        
    }
	
}
