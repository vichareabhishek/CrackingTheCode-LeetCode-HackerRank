package Strings;

import java.util.StringTokenizer;

public class LastNameFirstName {

	public static void main(String[] args) {
		String s ="Abhishek Vichare";
		getValues(s);

	}
	public static void getValues(String s){
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s, " ");
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		sb.append(s4).append(",").append(s.substring(0, 1));
		System.out.println(sb  );
		
	}

}
