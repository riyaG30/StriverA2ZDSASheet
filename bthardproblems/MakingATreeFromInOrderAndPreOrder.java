package bthardproblems;

import java.util.HashMap;
import java.util.Scanner;

public class MakingATreeFromInOrderAndPreOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] inorder=new int[n];
		for(int i=0;i<n;i++)
		{
			inorder[i]=sc.nextInt();
		}
		int[] preorder=new int[n];
		for(int i=0;i<n;i++)
		{
			preorder[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<inorder.length;i++)
		{
			map.put(inorder[i], i);
		}
		Node root=preIn(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
		System.out.println(root.data);
		sc.close();
	}

	private static Node preIn(int[] inorder, int instart, int inend, int[] preorder, int prestart, int preend,
			HashMap<Integer, Integer> map) {
		if(prestart>preend || instart>inend)
			return null;
		Node root=new Node(preorder[prestart]);
		int inRoot=map.get(root.data);
		int numsleft=inRoot-instart;
		root.left=preIn(inorder,instart,inRoot-1,preorder,prestart+1,prestart+numsleft,map);
		root.right=preIn(inorder,inRoot+1,inend,preorder,prestart+numsleft+1,preend,map);
		return root;
	}

}
