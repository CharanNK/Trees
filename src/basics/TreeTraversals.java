package basics;

//class Node{
//	int key;
//	Node root;
//	Node left;
//	Node right;
//	Node(int k){
//		key = k;
//	}
//}

public class TreeTraversals {
	
	static void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
	
	static void preorder(Node root) {
		if(root == null)return;
		System.out.print(root.key+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	static void postorder(Node root) {
		if(root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+" ");
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.left.right = new Node(50);
		root.right.right = new Node(60);
		root.right.right.left = new Node(70);
		root.right.right.right = new Node(80);
		
		inorder(root);
		System.out.println(System.lineSeparator());
		preorder(root);
		System.out.println(System.lineSeparator());
		postorder(root);
	}

}
