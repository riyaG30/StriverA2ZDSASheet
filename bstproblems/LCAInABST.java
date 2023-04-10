package bstproblems;

import java.util.Scanner;

public class LCAInABST {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc=new Scanner(System.in);
		//If null is the return then there is no LCA
		System.out.println(LCA(root,sc.nextInt(),sc.nextInt()).data);
		sc.close();

	}

	private static Node LCA(Node root,int p,int q) {
		while(root!=null)
		{
			if(root.data>p && root.data>q)
				root=root.left;
			else if(root.data<p && root.data<q)
				root=root.right;
			else
				return root;
		}
		return null;
	}

}
