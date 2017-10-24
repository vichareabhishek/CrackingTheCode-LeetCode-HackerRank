package CrackingTheCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerealizeAndDeserealizeBinaryTree {
	
	private static final String comm =";";
	private static final String NULL ="X";

	public String serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		getString(sb,root);
		return sb.toString();
	} 
	
	public void getString(StringBuffer sb, TreeNode root){
		if(root==null){
			sb.append(NULL).append(comm);
		}else{
			sb.append(root.val).append(comm);
			getString(sb,root.left);
			getString(sb,root.right);
		}
	}
	
	public TreeNode deserialize(String s){
		Queue<String> q = new LinkedList<String>();
		String[] arr = s.split(comm);
		q.addAll(Arrays.asList(arr));
		return getNode(q);
	}
	
	public TreeNode getNode(Queue<String> q){
		
		String val = q.poll();
		if(val.equals(NULL)) return null;
		else{
			TreeNode node = new TreeNode(Integer.valueOf(val));
			node.left = getNode(q);
			node.right = getNode(q);
			return node;
		}
	}
	
}


class TreeNode{
	
	TreeNode root;
	TreeNode left, right;
	int val;
	public TreeNode(int val){
		this.val=val;
	}
	
}