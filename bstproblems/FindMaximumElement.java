package bstproblems;

public class FindMaximumElement {
	public static int max(Node root)
	{
		if(root==null)
            return -1;
        int max=Integer.MIN_VALUE;
        while(root!=null)
		{
		    max=Math.max(max,root.data);
			if(root.right!=null)
			{
				root=root.right;
			}
			else
				root=root.left;
		}
		return max;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(max(root));
	}
}
