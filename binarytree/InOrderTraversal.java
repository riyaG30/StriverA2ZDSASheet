package binarytree;

public class InOrderTraversal {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		inorder(root);
	}

	private static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
}
