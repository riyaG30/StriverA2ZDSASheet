package bstproblems;

public class CheckBTIsABST {
	static boolean BST(Node root,int lower,int upper)
    {
        if(root==null)
            return true;
        if(root.data>=upper || root.data<=lower)
            return false;
        return BST(root.left,lower,root.data) && BST(root.right,root.data,upper);
    }
    static boolean isBST(Node root)
    {
        return BST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(isBST(root));
	}

}
