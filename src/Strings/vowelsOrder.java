package Strings;

public class vowelsOrder {

	public static void main(String[] args) {
		String s="acebisouzz";
		String k ="aeiou";
		StringBuffer db = new StringBuffer();
		
		for(int i=0; i<s.length(); i++){
			for(int j=0 ;j<k.length(); j++){
				if (s.charAt(i)==k.charAt(j))
					db.append(s.charAt(i));
			}
		}
		if(db.toString().equals(k)){
			System.out.println("true");
		}else
			System.out.println("false");
	}

}
