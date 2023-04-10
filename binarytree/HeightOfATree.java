package binarytree;

public class HeightOfATree {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(countNodes(root));
	}

	private static int countNodes(Node root) {
		if(root==null)
			return 0;
		return 1 + Math.max(countNodes(root.left) , countNodes(root.right));
	}

}
