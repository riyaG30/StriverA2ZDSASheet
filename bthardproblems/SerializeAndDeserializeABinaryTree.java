package bthardproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeABinaryTree {
	public static void serialize(Node root, ArrayList<Integer> A) 
	{
	    Queue<Node> q=new LinkedList<>();
	    q.add(root);
	    while(!q.isEmpty())
	    {
	        Node temp=q.poll();
	        if(temp==null)
	        {
	            A.add(-1);
	            continue;
	        }
	        A.add(temp.data);
	        q.add(temp.left);
	        q.add(temp.right);
	    }
	}
	
	//Function to deserialize a list and construct the tree.
    public static Node deSerialize(ArrayList<Integer> A)
    {
        Node root=new Node(A.get(0));
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        for(int i=1;i<A.size();i++)
        {
            Node parent=q.poll();
            if(A.get(i)!=-1)
            {
                Node temp=new Node(A.get(i));
                parent.left=temp;
                q.add(temp);
            }
            if(A.get(++i)!=-1)
            {
                Node temp=new Node(A.get(i));
                parent.right=temp;
                q.add(temp);
            }
        }
        return root;
    }
    public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		ArrayList<Integer> ans=new ArrayList<>();
		serialize(root,ans);
		root=deSerialize(ans);
	}
}
