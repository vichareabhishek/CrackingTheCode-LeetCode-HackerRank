package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> map = new HashMap<Employee, String>();
		Employee emp = new Employee(100,"abc");
		Employee emp1 = new Employee(100,"abc");
		
		map.put(emp, "hello");
		map.put(emp1, "world");
		System.out.println(map);
	}

}
class Employee{
	private int id;
	private String name;
	Employee(int id, String name){
		this.id=id;
		this.name= name;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj.equals(id))
			return false;
		else 
			return true;
	}
	
}