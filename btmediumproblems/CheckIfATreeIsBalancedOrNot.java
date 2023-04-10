package btmediumproblems;

public class CheckIfATreeIsBalancedOrNot {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(checkbalance(root)!=-1);
	}

	private static int checkbalance(Node root) {
		//balance trees are those trees in which the difference of  height of the left subtree and right subtree should be =1 
		if(root==null)
			return 0;
		int leftHeight=checkbalance(root.left);
		if(leftHeight==-1)
			return -1;
		int rightHeight=checkbalance(root.right);
		if(rightHeight==-1)
			return -1;
		if(Math.abs(leftHeight-rightHeight)>1)
			return -1;
		return 1 + Math.max(leftHeight, rightHeight);
	}

}
