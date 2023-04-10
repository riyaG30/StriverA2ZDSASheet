package bthardproblems;

import java.util.ArrayList;

public class MorrisPreOrderTraversal {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		ArrayList<Integer> preorder =new ArrayList<>();
		morrisTraversal(root,preorder);
		System.out.println(preorder);
	}

	private static void morrisTraversal(Node root, ArrayList<Integer> preorder) {
		Node current=root;
		while(current!=null)
		{
			if(current.left==null)
			{
				preorder.add(current.data);
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
					preorder.add(current.data);
					current=current.left;
				}
				else
				{
					prev.right=null;
					current=current.right;
				}
			}
		}
		
	}
}
