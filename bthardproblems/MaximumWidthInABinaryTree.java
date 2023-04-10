package bthardproblems;

import java.util.LinkedList;
import java.util.Queue;

class Width
{
   Node node;
   int width;
   public Width(Node root,int w)
   {
       node=root;
       width=w;
   }
}
public class MaximumWidthInABinaryTree {
	public static int widthOfBinaryTree(Node root) {
        Queue<Width> q=new LinkedList<>();
       int max=Integer.MIN_VALUE;
       q.add(new Width(root,0));
       while(!q.isEmpty())
       {
           int size=q.size();
           int min=q.peek().width;
           int first=0,last=0;
           for(int i=0;i<size;i++)
           {
               Node node=q.peek().node;
               int m=q.peek().width-min;
               q.poll();
               if(i==0)
                   first=m;
               if(i==size-1)
                   last=m;
               if(node.left!=null)
                   q.add(new Width(node.left,2*m+1));
               if(node.right!=null)
                   q.add(new Width(node.right,2*m+2));
           }
           max=Math.max(max,last-first+1);
       }
       return max;
   }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(widthOfBinaryTree(root));
	}

}
