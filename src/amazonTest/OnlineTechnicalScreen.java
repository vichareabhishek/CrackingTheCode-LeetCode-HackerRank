package amazonTest;
import java.util.*;
public class OnlineTechnicalScreen {

	  /*
	  * flat area = 1
	  * trenches = 0
	  * trees = numbers > 1
	  *
	  * given a 2d matrix representing a field,
	  * cut down all trees in the field given the following restrictions
	  *   - can only cut shortest tree from the field at any given time
	  *   - cannot walk on trenches
	  *   - can only move left, right, up or down
	  *   - after tree is cut, area becomes flat and you must move to that area
	  * */
	  public void shortestTree(int[][] M) {

	  }

	  /*
	  * Loading crates on a truck.
	  * Can only load crates on the truck that are closest.
	  * Given a set of crates, return the closest M crates to the truck to be loaded
	  * */
	  List<List<Integer>> closestLocations(int totalCrates,
	                                       List<List<Integer>> allLocations,
	                                       int truckCapacity) {
	    if (allLocations.size() <= 0)
	      return allLocations;

	    // Queue datastructure would be a better solution than using list
	    // Implemented list at first but moved on due to time constraint
	    List<Integer> distances = calculateAllDistances(allLocations);
	    Map<Integer, Integer> indexDistanceMapping = new HashMap<>();

	    int maxDistance = distances.get(0);
	    int maxDistanceIndex = 0;

	    for (int i = 0; i < distances.size(); i++) {
	      if (indexDistanceMapping.size() < truckCapacity) {
	        indexDistanceMapping.put(i, distances.get(i));

	        if (distances.get(i) > maxDistance) {
	          maxDistance = distances.get(i);
	          maxDistanceIndex = i;
	        }
	      } else {
	        if (distances.get(i) < maxDistance) {
	          indexDistanceMapping.remove(maxDistanceIndex);
	          indexDistanceMapping.put(i, distances.get(i));

	          int[] tmp = getMax(indexDistanceMapping);
	          maxDistance = tmp[0];
	          maxDistanceIndex = tmp[1];
	        }
	      }
	    }

	    List<List<Integer>> result = new ArrayList<>();
	    indexDistanceMapping.forEach((key, value) -> result.add(allLocations.get(key)));
	    return result;
	  }

	  public List<Integer> calculateAllDistances(List<List<Integer>> points) {
	    List<Integer> distances = new ArrayList<>();

	    for (int i = 0; i < points.size(); i++) {
	      List<Integer> point = points.get(i);
	      int x = point.get(0);
	      int y = point.get(1);

	      distances.add(calculateDistanceFromOrigin(x, y));
	    }

	    return distances;
	  }

	  public int calculateDistanceFromOrigin(int x, int y) {
	    return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	  }

	  public int[] getMax(Map<Integer, Integer> map) {
	    int max = Integer.MIN_VALUE;
	    int maxIndex = 0;

	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	      if (entry.getValue() > max) {
	        max = entry.getValue();
	        maxIndex = entry.getKey();
	      }
	    }

	    return new int[] {max, maxIndex};
	  }

	}
