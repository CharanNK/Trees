package basics;

public class BalancedTrees {

	static int height(Node root) {
		if(root==null)
			return 0;
		else
			return 1+Math.max(height(root.left), height(root.right));
	}
	
	static boolean isBalanced(Node root) {
		if(root==null)return true;
		int lh = height(root.left);
		int rh = height(root.right);
		
		return (Math.abs(lh-rh)<=1
				&& isBalanced(root.left)
				&& isBalanced(root.right));
	}
	
	static int effecientIsBalanced(Node root) {
		if(root==null) return 0;
		
		int lh = effecientIsBalanced(root.left);
		if(lh==-1) return -1;
		int rh = effecientIsBalanced(root.right);
		if(rh==-1) return -1;
		
		if(Math.abs(lh-rh)>1) return -1;
		else
			return Math.max(lh, rh)+1;
	}
	
	public static void main(String[] args) {
		Node root = new Node(18);
		root.left = new Node(4);
		root.right = new Node(20);
		root.right.left = new Node(13);
		root.right.right = new Node(70);
		
		System.out.println(isBalanced(root));
		System.out.println(effecientIsBalanced(root));
	}

}
