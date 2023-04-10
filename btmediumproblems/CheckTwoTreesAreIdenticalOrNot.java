package btmediumproblems;

public class CheckTwoTreesAreIdenticalOrNot {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Node root1=ct.create();
		System.out.println(check(root,root1));
	}

	private static boolean check(Node root, Node root1) {
		if(root==null && root1==null)
			return true;
		else if(root==null || root1==null)
	        return false;
		return root.data==root1.data && check(root.left,root1.left) && check(root.right,root1.right);
	}

}
