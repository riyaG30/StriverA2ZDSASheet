package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
}
