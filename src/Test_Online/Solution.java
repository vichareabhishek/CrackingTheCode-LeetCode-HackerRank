package Test_Online;

import java.io.*;
import java.util.*;

class Solution {
  public static Map<Integer, List<Integer>> createAdjacencyLists(List<String> employees, List<String> friendships) {
	  
	  Map<Integer,List<Integer>> friendshipMap = new HashMap<Integer, List<Integer>>();
	  
	  int friendLength = friendships.size();
	  
	  for(int i=0; i<friendLength; i++){
		  String s = friendships.get(i);
		  String[] entryList = s.split(",");
		  
		  int emp1 = Integer.parseInt(entryList[0]);
          int emp2 = Integer.parseInt(entryList[1]);
		  
		  List<Integer> emp1Friends =  friendshipMap.get(emp1);
          List<Integer> emp2Friends =   friendshipMap.get(emp2);
          
          List<Integer> temp = new ArrayList<Integer>();
          
          List<Integer> temp2 = new ArrayList<Integer>();
          if(emp1Friends != null)
          {
            emp1Friends.add(emp2);
            friendshipMap.put(emp1, emp1Friends);      
            //and then put the array back in the hash table
          }
        
         //if nothing there we can just put it in without
         //fear of overwriting anything:
          else  
          {
            temp.add(emp2);  
            friendshipMap.put(emp1, temp);
          }
          
          if(emp2Friends != null)
          {
            //and then put the array back in the hash table  
            emp2Friends.add(emp1);
            friendshipMap.put(emp2, emp2Friends);
          }
        
          else
            
          {
             temp2.add(emp1);
             friendshipMap.put(emp2, temp2);
          }
        
	  }
	  System.out.println(friendshipMap);
	  Map<Integer, List<Integer>> AnsfriendsMap = new HashMap<Integer, List<Integer>>();
	  
	  for (String employee : employees) {
		  
		  int employeeId = Character.getNumericValue(employee.charAt(0));
		  
		  //System.out.println(employeeId);
		  
	      List<Integer> friendsList = friendshipMap.get(employeeId);
	      if(friendsList !=null){
	      AnsfriendsMap.put(employeeId, friendsList);
	      }else{
	    	  AnsfriendsMap.put(employeeId, new ArrayList<Integer>());
	      }
	  }
	    System.out.println(AnsfriendsMap);  
	    return AnsfriendsMap;
	  
    // IMPLEMENTATION GOES HERE
   
  }

  /* START TEST CASES
   * You can add test cases in the three functions below: employeesInputs(),
   * friendshipsInputs(), and expectedOutputs(). Each test case input/expected output
   * should correspond to the same index in the respective lists returned.
   */
  public static List<List<String>> employeesInputs() {
    List<List<String>> inputs = new ArrayList<>();

    inputs.add(Arrays.asList(
      "1,Richard,Engineering",
      "2,Erlich,HR",
      "3,Monica,Business",
      "4,Dinesh,Engineering",
      "6,Carla,Engineering",
      "9,Laurie,Directors"
    ));

    return inputs;
  }

  public static List<List<String>> friendshipsInputs() {
    List<List<String>> inputs = new ArrayList<>();

    inputs.add(Arrays.asList(
      "1,2",
      "1,3",
      "1,6",
      "2,4"
    ));

    return inputs;
  }

  public static List<Map<Integer, List<Integer>>> expectedOutputs() {
    List<Map<Integer, List<Integer>>> expected = new ArrayList<>();

    Map<Integer, List<Integer>> output = new HashMap<>();
    output.put(1, Arrays.asList(2, 3, 6));
    output.put(2, Arrays.asList(1, 4));
    output.put(3, Arrays.asList(1));
    output.put(4, Arrays.asList(2));
    output.put(6, Arrays.asList(1));
    output.put(9, new ArrayList<Integer>());
    expected.add(output);

    return expected;
  }
  // END TEST CASES

  // DO NOT MODIFY MAIN()
  public static void main(String[] args) {
    List<List<String>> employeesInputs = employeesInputs();
    List<List<String>> friendshipsInputs = friendshipsInputs();
    List<Map<Integer, List<Integer>>> expectedOutputs = expectedOutputs();

    for (int i = 0; i < employeesInputs.size(); i++) {
      try {
        Map<Integer, List<Integer>> result = createAdjacencyLists(employeesInputs.get(i), friendshipsInputs.get(i));
        Map<Integer, List<Integer>> expected = expectedOutputs.get(i);

        if (result.equals(expected)) {
          System.out.println("Pass");
        } else {
          System.out.println("Fail");
        }
      } catch (Exception e) {
        System.out.println("Fail");
        e.printStackTrace();
      }
    }
  }
}
