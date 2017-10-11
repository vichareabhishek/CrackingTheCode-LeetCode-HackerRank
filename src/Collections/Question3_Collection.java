package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "abc");
		map.put(1, "xyz");
		map.put(10, "pqr");
		Question3_Collection exmp = new Question3_Collection();
		System.out.println(map);
		System.out.println(exmp.getValues(map));
		
		
		
	}
public List getValues(Map m){
	List<String> list = new ArrayList<String>(m.values());
	Collections.sort(list);
	return list;
	
}
}
