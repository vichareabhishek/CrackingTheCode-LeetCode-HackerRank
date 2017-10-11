package Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Ques8_Collection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map<Integer, Date> map = new HashMap<Integer, Date>();
		SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
		
		Date d1= sf.parse("06/06/1990");
		Date d2= sf.parse("06/06/1999");
		Date d3= sf.parse("08/04/2011");
		Date d4= sf.parse("18/06/1980");
		
		map.put(1, d1);
		map.put(2, d2);
		map.put(3, d3);
		map.put(4, d4);
		//System.out.println(map);
		
		
		Ques8_Collection exp = new Ques8_Collection();
		//System.out.println(exp.votersList(map));
	}
//	public List<Integer> votersList(Map m){
//		Collection<Date> list = new ArrayList<Date>();
//		list =  m.values();
//		return list;
	//}
}
