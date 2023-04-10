package bstproblems;

import java.util.Scanner;

public class DeleteANodeInABSt {
	 public static Node deleteNode(Node root, int X) {
	        if(root==null)
	            return root;
	        Node current=root;
	        while(root!=null)
	        {
	            if(root.data==X)
	                return helper(root);
	            else if(root.data>X)
	            {
	                if(root.left!=null && root.left.data==X)
	                {
	                    return helper(root.left);
	                }
	                else
	                    root=root.left;
	            }
	            else
	            {
	                if(root.right!=null && root.right.data==X)
	                {
	                    return helper(root.right);
	                }
	                else
	                    root=root.right;
	            }
	        }
	        return current;
	    }
	    public static Node helper(Node root)
	    {
	        if(root.left==null)
	            return root.right;
	        else if(root.right==null)
	            return root.left;
	        else
	        {
	            Node extremeRight=find(root.left);
	            extremeRight.right=root.right;
	        }
	        return root.left;
	    }
	    public static Node find(Node root)
	    {
	        while(root.right!=null)
	        {
	            root=root.right;
	        }
	        return root;
	    }
	   public static void main(String[] args) {
			CreateTree ct=new CreateTree();
			Node root=ct.create();
			Scanner sc=new Scanner(System.in);
			//If null is the return then there is no LCA
			root=deleteNode(root,sc.nextInt());
			sc.close();

		}
}
