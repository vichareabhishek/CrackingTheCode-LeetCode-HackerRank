package Tree;

public class InsertInBinarayTree {
	
	static Node Insert(Node root,int value) {

	 if(root.data>value){
		 if(root.left==null){
			 Node newNode = new Node(value);
			 return newNode;
		 }else{
			 return Insert(root, value);
		 }
	 }
	 else{
		 if(root.right==null){
			 Node newNode = new Node(value);
			 return newNode;
		 }else{
			 return Insert(root,value);
		 }
	 }
		
    }

}
