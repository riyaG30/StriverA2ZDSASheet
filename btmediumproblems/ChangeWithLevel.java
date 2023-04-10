package btmediumproblems;

public class ChangeWithLevel {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		change(root,0);
		preorder(root);
	}
	private static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	public static void change(Node root,int k)
	{
		if(root==null)
			return;
		root.data=k;
		change(root.left,k+1);
		change(root.right,k+1);
	}

}
