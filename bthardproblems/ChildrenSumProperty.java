package bthardproblems;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		change(root);
		preorder(root);
	}

	private static void change(Node root) {
		if(root==null)
			return;
		int count=0;
		count+=root.left!=null ? root.left.data : 0;
		count+=root.right!=null ? root.right.data : 0;
		if(count< root.data)
		{
			if(root.left!=null)
				root.left.data=root.data;
			else if(root.right!=null)
				root.right.data=root.data;
		}
		change(root.left);
		change(root.right);
		int tot=0;
		tot+=root.left!=null ? root.left.data : 0;
		tot+=root.right!=null ? root.right.data : 0;
		if(root.left!=null || root.right!=null)
			root.data=tot;
	}

	private static void preorder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

}
