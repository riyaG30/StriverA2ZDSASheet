package btmediumproblems;

public class DiameterOfABinaryTree {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		int[] diam=new int[1];
		diameter(root,diam);
		System.out.println(diam[0]);
	}

	private static int diameter(Node root, int[] diam) {
		//We will get the height of left and right
		//We will consider the left , right and root or only left or only right
		if(root==null)
			return 0;
		int left=diameter(root.left,diam);
		int right=diameter(root.right,diam);
		diam[0]=Math.max(diam[0], left + right + 1);
		return 1 + Math.max(left, right);
	}

}
