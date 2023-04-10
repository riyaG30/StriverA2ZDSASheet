package btmediumproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Vertical
{
    Node node;
    int x;
    int y;
    public Vertical(Node d,int x,int y)
    {
        this.node=d;
        this.x=x;
        this.y=y;
    }
}
public class VerticalOrderTraversal {
	static ArrayList <Integer> verticalOrder(Node root)
    {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Vertical> q=new LinkedList<>();
        q.add(new Vertical(root,0,0));
        while(!q.isEmpty())
        {
            Node node=q.peek().node;
            int x=q.peek().x;
            int y=q.peek().y;
            q.poll();
            if(!map.containsKey(x))
                map.put(x,new TreeMap<>());
            if(!map.get(x).containsKey(y))
                map.get(x).put(y,new PriorityQueue<>());
            map.get(x).get(y).add(node.data);
            if(node.left!=null)
            {
                q.add(new Vertical(node.left,x-1,y+1));
            }
            if(node.right!=null)
            {
                q.add(new Vertical(node.right,x+1,y+1));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> tm:map.values())
        {
            for(PriorityQueue<Integer> pq:tm.values())
            {
                while(!pq.isEmpty())
                {
                    ans.add(pq.poll());
                }
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(verticalOrder(root));
	}
}
