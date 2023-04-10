package bstproblems;

import java.util.Scanner;

public class FindTheKthLargestElement {
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int[] kth=new int[1];
		int[] ans= {-1};
		findK(root,k,kth,ans);
		System.out.println(ans[0]);
		sc.close();
	}

	private static void findK(Node root, int k, int[] kth,int[] ans) {
		if(root==null)
			return;
		findK(root.right,k,kth,ans);
		kth[0]++;
		if(kth[0]==k)
		{
			ans[0]=root.data;
			return;
		}
		findK(root.left,k,kth,ans);
	}
}
