package binarytree;

public class SumOfAllNodes {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(sum(root));
	}

	private static int sum(Node root) {
		if(root==null)
			return 0;
		return root.data + sum(root.left) + sum(root.right);
	}
}
