package bthardproblems;

public class FlattenBtToLL {
	public static void change(Node root)
	{
		Node current=root;
		while(current!=null)
		{
			if(current.left!=null)
			{
				Node prev=current.left;
				while(prev.right!=null)
				{
					prev=prev.right;
				}
				prev.right=current.right;
				current.right=current.left;
				current.left=null;
			}
			current=current.right;
		}
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		change(root);
	}

}
