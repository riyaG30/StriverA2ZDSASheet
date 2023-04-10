package btmediumproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {
	static ArrayList<Integer> zigZagTraversal(Node root)
	{
	    Queue<Node> q=new LinkedList<>();
	    ArrayList<Integer> ans=new ArrayList<>();
	    q.add(root);
	    int count=0;
	    while(!q.isEmpty())
	    {
	        ArrayList<Integer> arr=new ArrayList<>();
	        int size=q.size();
	        for(int i=0;i<size;i++)
	        {
	            Node temp=q.poll();
	            arr.add(temp.data);
	            if(temp.left!=null)
	                q.add(temp.left);
	            if(temp.right!=null)
	                q.add(temp.right);
	        }
	        if(count%2==0)
	        {
	            ans.addAll(arr);
	        }
	        else
	        {
	            Collections.reverse(arr);
	            ans.addAll(arr);
	        }
	        count++;
	    }
	    return ans;
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(zigZagTraversal(root));
	}

}
