package basics;


public class SizeOfTree {

	static int size(Node root) {
		if(root==null) return 0;
		else
			return 1+size(root.left)+size(root.right);
	}
	
	public static void main(String[] args) {
		Node root2 = new Node(10);
		root2.left = new Node(20);
		root2.left.left = new Node(8);
		root2.left.right = new Node(7);
		root2.left.right.left = new Node(9);
		root2.left.right.right = new Node(15);
		root2.right = new Node(30);
		root2.right.right = new Node(6);
		
		System.out.println(size(root2));
	}
}
