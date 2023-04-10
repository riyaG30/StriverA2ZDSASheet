package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversalIterative {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Stack<Node> s=new Stack<>();
		ArrayList<Integer> ans=new ArrayList<>();
		Node curr=root;
		while(curr!=null || !s.isEmpty())
		{
			if(curr!=null)
			{
				s.add(curr);
				curr=curr.left;
			}
			else
			{
				Node temp=s.peek();
				if(temp.right==null)
				{
					ans.add(temp.data);
					s.pop();
					while(!s.isEmpty() && temp==s.peek().right)
					{
						temp=s.pop();
						ans.add(temp.data);
					}
				}
				else
					curr=temp.right;
			}
		}
		System.out.println(ans);
	}

}
