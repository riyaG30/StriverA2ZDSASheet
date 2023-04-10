package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInOrderTraversal {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Stack<Node> s=new Stack<>();
		ArrayList<Integer> ans=new ArrayList<>();
		Node curr=root;
		while(true)
		{
			if(curr!=null)
			{
				s.add(curr);
				curr=curr.left;
			}
			else
			{
				if(s.isEmpty())
					break;
				curr=s.pop();
				ans.add(curr.data);
				curr=curr.right;
			}
		}
		System.out.println(ans);
	}

}
