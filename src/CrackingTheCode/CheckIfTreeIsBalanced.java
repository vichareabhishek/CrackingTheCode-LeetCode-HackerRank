package CrackingTheCode;

public class CheckIfTreeIsBalanced {

public static class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data=data;
	}
	
	
	}

public static int checkHeight(Node root){
	
	if(root==null){
		return 0;
	}
	
	int leftHieght = checkHeight(root.left);
	if(leftHieght==-1){
		return -1;
	}
	
	int rightHieght = checkHeight(root.right);
	if(rightHieght==-1){
		return -1;
	}
	
	if(Math.abs(leftHieght -rightHieght)>1 ){
		return -1;
	}else{
		return Math.max(leftHieght, rightHieght)+1;
	}
	
}

public static boolean isBalanced(Node root){
	if(checkHeight(root) ==-1){
		return false;
	}else{
		return true;
	}
}
}


