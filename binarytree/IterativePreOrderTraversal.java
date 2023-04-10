package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreOrderTraversal {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Stack<Node> s=new Stack<>();
		ArrayList<Integer> arr=new ArrayList<>();
		s.add(root);
		while(!s.isEmpty())
		{
			Node temp=s.pop();
			arr.add(temp.data);
			if(temp.right!=null)
				s.add(temp.right);
			if(temp.left!=null)
				s.add(temp.left);
		}
		System.out.println(arr);
	}	

}
