package bstproblems;

public class CorrectingABST {
	 static Node first=null,mid=null,last=null,prev=null;
	    public static void violation(Node root)
	    {
	        if(root==null)
	            return;
	        violation(root.left);
	        if(prev!=null && root.data<prev.data)
	        {
	            if(first==null)
	            {
	                first=prev;
	                mid=root;
	            }
	            else
	                last=root;
	        }
	        prev=root;
	        violation(root.right);
	    }
	    public static Node correctBST(Node root)
	    {
	        violation(root);
	        if(first==null)
	            return root;
	        if(first!=null && last!=null)
	        {
	            int temp=first.data;
	            first.data=last.data;
	            last.data=temp;
	        }
	        else if(first!=null && mid!=null)
	        {
	            int temp=first.data;
	            first.data=mid.data;
	            mid.data=temp;
	        }
	        return root;
	    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		correctBST(root);
	}

}
