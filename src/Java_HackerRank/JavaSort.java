package Java_HackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
}
class Student implements Comparable<Object>{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	@Override
	public int compareTo(Object o) {
		
		Student s = (Student) o;
		if(cgpa>s.cgpa){
			return 1;
		}else if(cgpa==s.cgpa){
			if(fname.equals(s.fname)){
				return id=s.id;
			}else{
				return fname.compareTo(s.fname);
			}
		}
		else{
			return -1;
		}
		
	}
	}

