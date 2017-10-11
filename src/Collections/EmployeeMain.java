package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		List<String> b1 = new ArrayList<String>();
		List<String> b2 = new ArrayList<String>();
		b1.add("Abhi");
		b1.add("Shatanu");
		b1.add("Bijen");
		b1.add("raj");
		b2.add("Abhi");
		b2.add("Kiran");
		b2.add("Rahul");
		b2.add("Shatanu");
		b2.add("Bijen");
		
		EmployeeMain emp1 = new EmployeeMain();
		
		String arr[]=emp1.getEmployees(b1, b2);
		for(String m:arr )
			System.out.println(m);
		
		// TODO Auto-generated method stub

	}
	
	public String[] getEmployees(List<String> b1, List<String> b2){
		List<String> newBranch = new ArrayList<String>(b2);
		newBranch.retainAll(b1);
		Collections.sort(newBranch);
		String[] stringArr = new String[newBranch.size()];
		
		return newBranch.toArray(stringArr);
		
	}

	

}
