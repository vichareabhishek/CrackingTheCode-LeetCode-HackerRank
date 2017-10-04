package Arrays;

public class CheckRotationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean checkRotation(String s1, String s2){
		
		int len = s1.length();
		
		if(len == s2.length() && len>0){
			String s1s1 = s1+s1;
			return isSubString(s1s1, s2);
		}else{
			return false;
		}
		
		
	}

	private boolean isSubString(String s1s1, String s2) {
		// TODO Auto-generated method stub
		return false;
	}
}
