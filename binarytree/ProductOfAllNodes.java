package binarytree;

public class ProductOfAllNodes {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(product(root));
	}

	private static int product(Node root) {
		if(root==null)
			return 1;
		return root.data * product(root.left) * product(root.right);
	}
}
