package basics;
import java.util.*;

public class MaxWidth {
	
	static int getWidth(Node root) {
		if(root==null) return 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int res = 0;
		while(!queue.isEmpty()) {
			int count = queue.size();
			res = Math.max(res, count);
			for(int i=0;i<count;i++) {
				Node curr = queue.poll();
				if(curr.left!=null) queue.add(curr.left);
				if(curr.right!=null)queue.add(curr.right);
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.left.left = new Node(80);
		root.right = new Node(30);
		root.right.left = new Node(50);
		root.right.right = new Node(60);
		
		System.out.println(getWidth(root));
	}

}
