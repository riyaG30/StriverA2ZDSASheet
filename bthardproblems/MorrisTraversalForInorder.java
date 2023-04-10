package bthardproblems;

import java.util.ArrayList;

public class MorrisTraversalForInorder {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		ArrayList<Integer> inorder =new ArrayList<>();
		morrisTraversal(root,inorder);
		System.out.println(inorder);
	}

	private static void morrisTraversal(Node root, ArrayList<Integer> inorder) {
		Node current=root;
		while(current!=null)
		{
			if(current.left==null)
			{
				inorder.add(current.data);
				current=current.right;
			}
			else
			{
				Node prev=current.left;
				while(prev.right!=null && prev.right!=current)
					prev=prev.right;
				if(prev.right==null)
				{
					prev.right=current;
					current=current.left;
				}
				else
				{
					prev.right=null;
					inorder.add(current.data);
					current=current.right;
				}
			}
		}
		
	}

}
