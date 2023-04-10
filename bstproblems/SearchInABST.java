package bstproblems;

import java.util.Scanner;

public class SearchInABST {
	public static boolean find(Node root,int key)
	{
		while(root!=null)
		{
			if(root.data==key)
				return true;
			root= root.data>key ? root.left : root.right;
		}
		return false;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner scanner = new Scanner(System.in);
		System.out.println(find(root,scanner.nextInt()));
		scanner.close();
	}

}
