package binarytree;

public class PostOrderTraversal {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		postorder(root);
	}

	private static void postorder(Node root) {
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}
