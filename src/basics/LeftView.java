package basics;
import java.util.*;

public class LeftView {
	
	public static void printLeftView(Node root) {
		if(root == null)return;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int count = queue.size();
			
			for(int i=0;i<count;i++) {
				Node curr = queue.poll();
				if(i==0)
					System.out.print(curr.key+" ");
				if(curr.left!=null) queue.add(curr.left);
				if(curr.right!=null) queue.add(curr.right);
				
			}
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.right = new Node(60);
		
		printLeftView(root);
	}

}
