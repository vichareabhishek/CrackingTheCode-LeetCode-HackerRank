package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="A lad named E Mandala";
		String k =s.toLowerCase();
		k= k.replaceAll("\\s", "");
//		for(int i=s.length()-1;i>=0;i--){
//			System.out.print(s.charAt(i));
//		}
		
		StringBuilder sb = new StringBuilder(k);
		//System.out.println(s.equals(sb.reverse().toString()));
		//System.out.println(sb.reverse());
		if(k.equals(sb.reverse().toString())){
			System.out.println("PAliandrome");
		}else
			System.out.println("NO");
		
				
	}

}
