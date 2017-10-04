package Arrays;

public class ReplaceSpaceByvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="ab c  ";
		getSpaceCount(s.toCharArray(), 6);
	}
	
	public static void getSpaceCount(char[] ch, int length){
		int count=0;
		
		for(int i=0; i<ch.length; i++){
			
			if(ch[i]==' '){
				count++;
			}
		}
		int newlength = length+2*count;
		
		for(int i=length-1; i<=0; i--){
			
			if(ch[i]==' '){
				ch[newlength-1]='0';
				ch[newlength-2]='2';
				ch[newlength-3]='%';	
				newlength= newlength-3;
			}else{
				ch[newlength-1]=ch[i];
				newlength = newlength-1;
			}
						
		}
		
	}
	}
