package DataStructure;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
public class DepthFirstSearch {
	
	private HashMap<Integer, Node> nodeLookUp = new HashMap<Integer,Node>();
	
	public static class Node{
		
		int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		
		public Node(int id){
			this.id=id;
		}
	}
	
	private Node getNode(int id){
		return nodeLookUp.get(id); 
	}
	
	private void addEdge(int source, int destination){
		
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}
	
	
	public boolean pathByDFS(int source, int destination){
		
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		
		return pathByDFS(s,d,visited);
		
	}
	
	private boolean pathByDFS(Node source, Node destination, HashSet<Integer> visited){
		
		if(visited.contains(source.id)){
			return false;
		}
		
		visited.add(source.id);
		if(source==destination){
			return true;
		}
		
		for(Node child: source.adjacent){
			if(pathByDFS(child, destination,visited))
				return true;
		}
		
		return false;
	}

}
