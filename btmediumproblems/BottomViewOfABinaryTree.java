package btmediumproblems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
class Bottom
{
    int x;
    Node node;
    public Bottom(int x,Node n)
    {
        this.x=x;
        node=n;
    }
}
public class BottomViewOfABinaryTree {
	 public static ArrayList <Integer> bottomView(Node root)
	    {
	        ArrayList<Integer> ans=new ArrayList<>();
	        Queue<Bottom> q=new LinkedList<>();
	        q.add(new Bottom(0,root));
	        Map<Integer,Integer> map=new TreeMap<>();
	        while(!q.isEmpty())
	        {
	            Bottom temp=q.poll();
	            int x=temp.x;
	            Node node=temp.node;
	            // if(map.get(x)==null)
	                map.put(x,node.data);
	            if(node.left!=null)
	                q.add(new Bottom(x-1,node.left));
	            if(node.right!=null)
	            {
	                q.add(new Bottom(x+1,node.right));
	            }
	        }
	        ans.addAll(map.values());
	        return ans;
	    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(bottomView(root));

	}

}
