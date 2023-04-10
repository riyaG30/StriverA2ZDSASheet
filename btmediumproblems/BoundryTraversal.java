package btmediumproblems;

import java.util.ArrayList;
import java.util.Collections;

public class BoundryTraversal {
	 public static void addLeft(Node root,ArrayList <Integer> ans)
	    {
	        if(root==null)
	            return;
	        while(root!=null)
	        {
	            if(root.left!=null || root.right!=null)
	                ans.add(root.data);
	            if(root.left!=null)
	                root=root.left;
	            else 
	                root=root.right;
	        }
	    }
	    public static void addLeaves(Node root,ArrayList <Integer> ans)
	    {
	        if(root==null)
	            return;
	        if(root.left==null && root.right==null)
	            ans.add(root.data);
	        addLeaves(root.left,ans);
	        addLeaves(root.right,ans);
	    }
	    public static ArrayList<Integer> addRight(Node root)
	    {
	        ArrayList<Integer> ans=new ArrayList<>();
	        if(root==null)
	            return ans;
	        while(root!=null)
	        {
	            if(root.right!=null || root.left!=null)
	                ans.add(root.data);
	            if(root.right!=null)
	                root=root.right;
	            else 
	                root=root.left;
	        }
	        Collections.reverse(ans);
	        return ans;
	    }
		static ArrayList <Integer> boundary(Node root)
		{
		    ArrayList<Integer> ans = new ArrayList<>();
		    if(root.left==null && root.right==null)
		    {
		        ans.add(root.data);
		        return ans;
		    }
		    ans.add(root.data);
		    addLeft(root.left,ans);
		    addLeaves(root,ans);
		    ans.addAll(addRight(root.right));
		    return ans;
		}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(boundary(root));

	}

}
