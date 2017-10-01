package DataStructure;

public class BinaryTress {
	
	class Node{
		
		Node left, right;
		int data;
		
		public Node(int data){
			this.data=data;
		}
		
		public void insert(int value){
			Node newNode = new Node(value);
			if(value<=data){
				
				if(left==null){
					left = newNode;
				}else{
					left.insert(value);
				}
			}
			else if(value>data){
				if(right == null){
					right = newNode;
				}else{
					right.insert(value);
				}
			}
		
		}
		public boolean contains(int value){
			
			if(data==value){
				return true;
			}
			else if(value<data){
				if(left== null){
					return false;
				}else{
					return left.contains(value);
				}
				
			}else{
				if(right==null){
					return false;
				}else{
					return right.contains(value);
					
				}
			}
		}
		
		public void printInOrder(){
			
			if(left!=null){
				left.printInOrder();
			}
			System.out.println(data);
			if(right!=null){
				
				right.printInOrder();
			}
		}
		
	}
	
}
