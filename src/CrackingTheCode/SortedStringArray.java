package CrackingTheCode;

public class SortedStringArray {
	
	public int stringSearch(String[] str, String s){
		
		if(s==null || str==null){
			return -1;
		}else{
			return search(str, s ,0, s.length()-1);
		}
		
	}
	
	public int search(String[] str, String s, int first, int last){
		
		int mid = (last+first)/2;
		
		if(str[mid].isEmpty()){
		int left = mid-1;
		int right = mid+1;
		
		while(true){
			if(left>first && right<last){
				return -1;
			}
			else if(left>=first && !str[left].isEmpty()){
				mid=left;
				break;
			}
			else if(right<=last && !str[right].isEmpty()){
				mid =right;
				break;
			}
			right++;
			left--;
		}
		
		
		
	}
		if(str[mid].equals(s)){
			return mid;
		}
		else if(str[mid].compareTo(s)<0){
			return search(str, s, mid+1, last);
		}else{
			return search(str, s, first, mid-1);
		}

	}
	}
