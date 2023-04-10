package btmediumproblems;

public class CheckForSymmetry {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		if(root==null)
			return;
		System.out.println(check(root.left,root.right));
	}
	private static boolean check(Node root, Node root1) {
		if(root==null && root1==null)
			return true;
		else if(root==null || root1==null)
	        return false;
		return root.data==root1.data && check(root.left,root1.right) && check(root.right,root1.left);
	}
}
