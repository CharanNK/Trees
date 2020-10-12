package basics;

public class LevelOderTraversal {
	
	static int height(Node root) {
		if(root==null)
			return 0;
		else 
			return Math.max(height(root.left), height(root.right))+1;
	}
	
	static void printLevelOder(Node root) {
		int height = height(root);
		for(int i=1;i<=height;i++) {
			printGivenLevel(root,i);
		}
	}

	static void printGivenLevel(Node root, int i) {
		if(root==null)
			return;
		if(i==1)
			System.out.print(root.key+" ");
		else {
			printGivenLevel(root.left, i-1);
			printGivenLevel(root.right, i-1);
		}
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
		root.right.right.right.right = new Node(90);
		
		Node root2 = new Node(10);
		root2.left = new Node(20);
		root2.left.left = new Node(8);
		root2.left.right = new Node(7);
		root2.left.right.left = new Node(9);
		root2.left.right.right = new Node(15);
		root2.right = new Node(30);
		root2.right.right = new Node(6);
		
		printLevelOder(root);
		System.out.println(System.lineSeparator());
		printLevelOder(root2);
		
	}

}
