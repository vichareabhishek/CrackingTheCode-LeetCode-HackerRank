package CrackingTheCode;

public class AlgoToConvertArrayToBinaryTree {

	public static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	public Node getTree(int[] arr){
		
		return getBinaryTree(0,arr.length-1, arr);
	}
	
	public Node getBinaryTree(int start, int end, int[] arr){
		
		if(end<start){
			return null;
		}
		
		int mid = arr.length/2;
		
		Node n = new Node(arr[mid]);
		
		n.left = getBinaryTree(0,mid-1,arr);
		n.right = getBinaryTree(mid-1,arr.length, arr);
		
		return n;
		
		
	}
	
		
}
