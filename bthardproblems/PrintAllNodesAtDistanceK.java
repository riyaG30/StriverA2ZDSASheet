package bthardproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintAllNodesAtDistanceK {
	 public static ArrayList<Integer> nodesAtDistanceK(Node root, int target , int k)
	    {
	        ArrayList<Integer> ans=new ArrayList<>();
			Queue<Node> q=new LinkedList<>();
			HashMap<Node,Node> markParent=new HashMap<>();
			HashMap<Node,Boolean> visited=new HashMap<>();
			Node target1=parent(root,markParent,target);
			q.add(target1);
			visited.put(target1, true);
			int current=0;
			while(!q.isEmpty())
			{
				if(current==k)
					break;
				current++;
				int size=q.size();
				for(int i=0;i<size;i++)
				{
	    			Node temp=q.poll();
	    			if(temp.left!=null && visited.get(temp.left)==null)
	    			{
	    				q.add(temp.left);
	    				visited.put(temp.left,true);
	    			}
	    			if(temp.right!=null && visited.get(temp.right)==null)
	    			{
	    				q.add(temp.right);
	    				visited.put(temp.right,true);
	    			}
	    			if(markParent.get(temp)!=null && visited.get(markParent.get(temp))==null)
	    			{
	    				q.add(markParent.get(temp));
	    				visited.put(markParent.get(temp),true);
	    			}
				}
			}
			while(!q.isEmpty())
			{
				ans.add(q.poll().data);
			}
			Collections.sort(ans);
			return ans;
	    }
	    private static Node parent(Node root, HashMap<Node, Node> markParent,int target) {
			if(root==null)
				return root;
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			Node target1=null;
			markParent.put(root,null);
			while(!q.isEmpty())
			{
				Node temp=q.poll();
				if(temp.data==target)
				    target1=temp;
				if(temp.left!=null)
				{
					q.add(temp.left);
					markParent.put(temp.left, temp);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
					markParent.put(temp.right,temp);
				}
			}
			return target1;
		}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		Scanner sc=new Scanner(System.in);
		int level=sc.nextInt();
		int target=sc.nextInt();
		System.out.println(nodesAtDistanceK(root,target,level));
		sc.close();
	}
}
