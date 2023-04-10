package greedy;

import java.util.*;

class Node
{
	char symbol;
	int value;
	Node left;
	Node right;
	public Node(char s,int d)
	{
		symbol=s;
		value=d;
	}
}
public class HuffmanEncoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<>()
				{
					public int compare(Node x,Node y)
					{
						return x.value-y.value;
					}
				});
		for(Map.Entry<Character, Integer> e:map.entrySet())
		{
			pq.add(new Node(e.getKey(),e.getValue()));
		}
		Node root=null;
		while(pq.size()>1)
		{
			Node p=pq.poll();
			Node q=pq.poll();
			
			Node n=new Node('-',p.value+q.value);
			n.left=p;
			n.right=q;
			pq.add(n);
			root=n;
		}
		print(root,"");
		sc.close();
	}

	private static void print(Node root,String s) {
		if(root.left==null && root.right==null && Character.isAlphabetic(root.symbol))
		{
			System.out.println(root.symbol+"->"+s);
			return;
		}
		print(root.left,s+'0');
		print(root.right,s+'1');
		
	}

}
