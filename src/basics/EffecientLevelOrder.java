package basics;

import java.util.*;

public class EffecientLevelOrder {
	
	static void printLevelOder(Node root) {
		if(root==null)
			return;
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(queue.isEmpty()==false) {
			Node curr = queue.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				queue.add(curr.left);
			if(curr.right!=null)
				queue.add(curr.right);
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
		
		printLevelOder(root2);
	}

}
