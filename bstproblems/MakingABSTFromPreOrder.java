package bstproblems;

import java.util.Scanner;

public class MakingABSTFromPreOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] index= {0};
		Node root=BST(arr,Integer.MAX_VALUE,index);
		System.out.println(root.data);//print the inorder or postorder for verifiying.
		sc.close();
	}

	private static Node BST(int[] pre, int bound, int[] index) {
		if(index[0]==pre.length || pre[index[0]]>bound)
	        return null;
	    Node root=new Node(pre[index[0]++]);
	    root.left=BST(pre,root.data,index);
	    root.right=BST(pre,bound,index);
	    return root;
	}

}
