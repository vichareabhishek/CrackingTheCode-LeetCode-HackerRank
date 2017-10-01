package Strings;

public class squareOfEach {

	public static void main(String[] args) {
		int s=12;
		int rem=0;
		int ans=0;
		
		while(s!=0){
			rem=s%10;
			ans = ans+(rem*rem);
			s=s/10;
		}

		System.out.println(ans);
	}

}
