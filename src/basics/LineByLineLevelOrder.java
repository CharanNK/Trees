package basics;

import java.util.*;

public class LineByLineLevelOrder {
	
	static void printLevelOrderByLine(Node root) {
		if(root==null) return;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		
		while(queue.size()>1) {
			Node curr = queue.poll();
			
			if(curr==null) {
				System.out.println();
				queue.add(null);
				continue;
			}
			
			System.out.print(curr.key+" ");
			if(curr.left!=null) queue.add(curr.left);
			if(curr.right!=null) queue.add(curr.right);
		}
	}
	
	public static void printByTwoLoops(Node root) {
		if(root==null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			int count = queue.size();
			
			for(int i=0;i<count;i++) {
				Node curr = queue.poll();
				System.out.print(curr.key+" ");
				if(curr.left!=null) queue.add(curr.left);
				if(curr.right!=null) queue.add(curr.right);
			}
			System.out.println();
		}
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
		
		
//		printLevelOrderByLine(root2);
		printByTwoLoops(root2);
	}

}
