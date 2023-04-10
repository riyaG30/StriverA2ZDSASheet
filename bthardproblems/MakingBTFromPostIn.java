package bthardproblems;

import java.util.HashMap;
import java.util.Scanner;

public class MakingBTFromPostIn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] inorder=new int[n];
		for(int i=0;i<n;i++)
		{
			inorder[i]=sc.nextInt();
		}
		int[] postorder=new int[n];
		for(int i=0;i<n;i++)
		{
			postorder[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<inorder.length;i++)
		{
			map.put(inorder[i], i);
		}
		Node root=postIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
		System.out.println(root.data);
		sc.close();
	}

	private static Node postIn(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend,
			HashMap<Integer, Integer> map) {
		if(poststart>postend || instart>inend)
			return null;
		Node root=new Node(postorder[postend]);
		int inRoot=map.get(root.data);
		int numsleft=inRoot-instart;
		root.left=postIn(inorder,instart,inRoot-1,postorder,poststart,poststart+numsleft-1,map);
		root.right=postIn(inorder,inRoot+1,inend,postorder,poststart+numsleft,postend-1,map);
		return root;
	}
}
