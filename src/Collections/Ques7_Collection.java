package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques7_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {12,23,96,45};
		Ques7_Collection exp = new Ques7_Collection();
		Integer[] ans =(exp.getSorted(arr));
		for(int i: ans)
			System.out.println(i);
		
	}
	public Integer[] getSorted(Integer[] a){
		
		List<Integer> list = new ArrayList<Integer>();
		
		String s;
		for(int i=0; i<a.length;i++){
			s=a[i].toString();
			StringBuffer s1= new StringBuffer(s);
			s1.reverse();
			String s2 = new String(s1);
			list.add(Integer.parseInt(s2));
		}
		Collections.sort(list);
		return list.toArray(new Integer[list.size()]);
		
	}
	
	
	

}
