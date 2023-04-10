package binarytree;

public class PreOrderTraversal {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		preorder(root);
	}

	private static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

}
