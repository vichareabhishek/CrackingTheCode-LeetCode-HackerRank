package DataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class BreadthFirstSearch {
	
	private HashMap<Integer, Node> nodeLookUp = new HashMap<Integer,Node>();
	
	public static class Node{
		
		int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		public Node(int id){
			this.id=id;
		}
		
	}

	public Node getNode(int id){
		
		return nodeLookUp.get(id);
	}
	
	public boolean pathByBFS(int source, int destination){
		
		Node s = getNode(source);
		Node d = getNode(destination);
		
		return pathByBFS(s, d);
	}
	
	private boolean pathByBFS(Node source, Node destination){
		
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()){
			
			Node node = nextToVisit.remove();
			
			if(node == destination){
				return true;
			}
			
			if(visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			
			for(Node child: node.adjacent){
				nextToVisit.add(child);
			}
		}
		return false;
	}
}
