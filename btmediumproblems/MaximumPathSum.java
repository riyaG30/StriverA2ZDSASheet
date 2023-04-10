package btmediumproblems;

public class MaximumPathSum {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		int[] diam= {Integer.MIN_VALUE};
		maxSum(root,diam);
		System.out.println(diam[0]);
	}

	private static int maxSum(Node root, int[] diam) {
		//We will get the height of left and right
		//We will consider the left , right and root or only left or only right
		//We will get the height of left and right
		//We will consider the left , right and root or only left or only right
		if(root==null)
			return 0;
		//this is for not taking the negative values
		int left=Math.max(0,maxSum(root.left,diam));
		int right=Math.max(0,maxSum(root.right,diam));
		//If the root is negative it is taken care of in the below condition
		diam[0]=Math.max(diam[0], left + right + root.data);
		return root.data + Math.max(left, right);
	}
}
