package bstproblems;


public class FindMinimumElementInABST {

	public static int min(Node root)
	{
		if(root==null)
            return -1;
        int min=Integer.MAX_VALUE;
        while(root!=null)
		{
		    min=Math.min(min,root.data);
			if(root.left!=null)
			{
				root=root.left;
			}
			else
				root=root.right;
		}
		return min;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(min(root));
	}

}
