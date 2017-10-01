package Strings;

import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		String s ="He is a very very good boy, isn't he?";
		StringTokenizer st = new  StringTokenizer(s,("[_\\@!?.', ]"));
		int x = st.countTokens();
		System.out.println(x);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
