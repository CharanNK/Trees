package basics;

public class ChildSumProperty {
	
	static boolean isChildSum(Node root) {
		if(root==null)
			return true;
		if(root.left==null&&root.right==null)
			return true;
		int sum = 0;
		
		if(root.left!=null) 
			sum += root.left.key;
		if(root.right!=null)
			sum += root.right.key;
		
		return (root.key==sum 
				&& isChildSum(root.left)
				&& isChildSum(root.right));
	}

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right = new Node(12);
		
		System.out.println(isChildSum(root));
		
	}

}
