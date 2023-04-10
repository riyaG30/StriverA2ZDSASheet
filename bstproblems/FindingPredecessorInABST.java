package bstproblems;

import java.util.Scanner;

public class FindingPredecessorInABST {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc=new Scanner(System.in);
		int[] predecessor=new int[1];
		pre(root,sc.nextInt(),predecessor);
		System.out.println(predecessor[0]);
		sc.close();
	}
	private static void pre(Node root, int key,int[] predecessor) {
		if(root==null)
			return;
		pre(root.left,key,predecessor);
		if(key>root.data)
			predecessor[0]=root.data;
		pre(root.right,key,predecessor);
	}
}
