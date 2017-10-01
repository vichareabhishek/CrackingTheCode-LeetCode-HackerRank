package DataStructure;

import java.util.LinkedList;

public class HashMap {
	
	
	LinkedList[] data;// contains the Person objects 
	
	
	public boolean put(String key, Person P){		//Converts String to hascode to index
		
		int hashCode = getHashCode(key);
		
		int j = indexOf(hashCode);
		
		LinkedList list = data[j];
		
		//list.insert(key,P);   checks the duplicate values and overwrite them
		return true;
	}

	public int indexOf(int hashCode) {
		
		return 0;
	}

	public  int getHashCode(String key) {
		
		int i =key.hashCode();
		return i;
	}
	

}

class Person{
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
