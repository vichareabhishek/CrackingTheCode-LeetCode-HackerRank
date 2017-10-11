package CrackingTheCode;

public class CheckIfTreeIsBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public  boolean checkTree(Node root){
		
		return checkTree(Integer.MAX_VALUE, Integer.MIN_VALUE,  root);
	}
	public boolean checkTree(int max, int min, Node root){
		
		if(root==null){
			return true;
		}
		
		if(root.data<min || root.data>max){
			return false;
		}
		
		return checkTree(root.data-1,min ,root.left) && checkTree(max,root.data,root.right);
		
	}
}
