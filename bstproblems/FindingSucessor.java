package bstproblems;

import java.util.Scanner;

public class FindingSucessor {

	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc=new Scanner(System.in);
		System.out.println(successor(root,sc.nextInt()));
		sc.close();

	}

	private static int successor(Node root, int key) {
		int ans=-1;
		while(root!=null)
		{
			if(key>root.data)
			{
				root=root.right;
			}
			else
			{
				ans=root.data;
				root=root.left;
			}
		}
		return ans;
	}

}
