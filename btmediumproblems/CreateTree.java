package btmediumproblems;

import java.util.Scanner;

class Node
{
	int data;
	Node left;
	Node right;
	public Node(int d)
	{
		data=d;
	}
}
public class CreateTree {
	static Scanner sc=null;
	public CreateTree()
	{
		sc=new Scanner(System.in);
	}
	public Node create()
	{
		int data=sc.nextInt();
		if(data==-1)
			return null;
		Node root=new Node(data);
		root.left=create();
		root.right=create();
		return root;
	}

}
