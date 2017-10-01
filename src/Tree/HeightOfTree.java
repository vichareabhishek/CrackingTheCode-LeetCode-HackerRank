package Tree;

import java.util.Scanner;

public class HeightOfTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
	}
	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	static int height(Node root) {
		
		if(root==null){
		return -1;
    }
		int leftCount=0;
		int rightCount=0;
		
		if(root.left!=null){
			leftCount = 1+height(root.left);
		}
		if(root.right!=null){
			rightCount = 1+height(root.right); 
		}
		if(rightCount>=leftCount){
			return rightCount;
		}
		else{
			return leftCount;
		}
}
}
