package bstproblems;

import java.util.Scanner;

public class CeilInABinaryTree {
	public static int ceil(Node root,int key)
	{
		if(root==null)
            return -1;
        int max=-1;
        while(root!=null)
		{
        	if(root.data==key)
        		return key;
        	else if(root.data<key)
			{
				root=root.right;
			}
			else
			{
				max=root.data;
				root=root.left;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc =new Scanner(System.in);
		System.out.println(ceil(root,sc .nextInt()));
		sc.close();
	}
}
