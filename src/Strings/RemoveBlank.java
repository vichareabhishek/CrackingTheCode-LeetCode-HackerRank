package Strings;

public class RemoveBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="  hello world    abhishek  vichare ";
		System.out.println(removeBlanks(input));
	}
	public static String removeBlanks(String s){

		s=s.replaceAll("\\s+", " ");
		s=s.replaceAll("^\\s+","");
		return s;
//		String [] arr =s.split(" ");
//		for(String s1: arr){
//			System.out.print(s1);
//		}
//		StringBuffer sb = new StringBuffer();
//
//		for(int i=0; i<arr.length; i++){
//		   sb.append(arr[i]+" ");
//
//		}
//		return sb.toString();
		}

}
