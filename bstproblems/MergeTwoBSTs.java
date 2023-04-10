package bstproblems;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBSTs {
	
	public static void main(String[] args) {
		 List<Integer> ans=new ArrayList<>();
		 CreateTree ct=new CreateTree();
		 Node root1=ct.create();
		 Node root2=ct.create();
	        BSTIterator bst1=new BSTIterator(root1,true);
	        BSTIterator bst2=new BSTIterator(root2,true);
	        while(bst1.hasNext() && bst2.hasNext())
	        {
	           if(bst1.peek()>bst2.peek())
	           {
	               ans.add(bst2.next());
	           }
	           else
	                ans.add(bst1.next());
	        }
	        while(bst1.hasNext())
	            ans.add(bst1.next());
	        while(bst2.hasNext())
	            ans.add(bst2.next());
	        System.out.println(ans);
	}

}
