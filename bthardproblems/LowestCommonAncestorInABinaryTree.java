package bthardproblems;

import java.util.Scanner;

public class LowestCommonAncestorInABinaryTree {
	static Node lca(Node root, int n1,int n2)
	{
		if(root==null || root.data==n1 || root.data==n2)
		    return root;
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		if(left==null)
		    return right;
		else if(right==null)
		    return left;
		else
		    return root;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(lca(root,n1,n2));
		sc.close();
	}

}
