package CrackingTheCode;
import java.util.*;

public class CreateLinkedListFromDeptOfTree {
	
	public static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data){
			this.data=data;
		}
	}
	public List<LinkedList<Node>> getTree(Node root){
		ArrayList<LinkedList<Node>> list = new ArrayList<LinkedList<Node>>();
		
		getFinalList(root, list,0);		
		return list;
	}

	
	public void getFinalList(Node root, ArrayList<LinkedList<Node>> list, int level){
		
		if(root==null){
			return;
		}
		LinkedList<Node> lists =null;
		if(list.size()==level){
			lists = new LinkedList<Node>();
			list.add(lists);
			
		}
		else{
			lists = list.get(level);
		}
		lists.add(root);
		
		getFinalList(root.left, list, level+1);
		getFinalList(root.right, list, level+1);
	}
	
}
