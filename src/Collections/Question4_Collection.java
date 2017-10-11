package Collections;


import java.util.*;

public class Question4_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s= "westbenagal-kolkata,chennai-karanataka,tamilNadu-bengaluru";
		Question4_Collection examp = new Question4_Collection();
		System.out.println(examp.getStates(s, ",", "-"));
		
				
	}
	public Map<String, String> getStates(String data, String del1,String dell2){
		Map<String, String> map = new HashMap<String, String>();
		
		String [] arr = data.split(del1);
		for(String a: arr){
			String[] arr1 = a.split(dell2);
			map.put(arr1[0], arr1[1]);
		}
		return map;
		
			
			
	}
}
