package bstproblems;

import java.util.Scanner;

public class Floor {
	public static int floor(Node root,int key)
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
        		max=root.data;
				root=root.right;
			}
			else
			{
				root=root.left;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc =new Scanner(System.in);
		System.out.println(floor(root,sc .nextInt()));
		sc.close();
	}
}
