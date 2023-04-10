package graphdisjointsetspanning;

import java.util.ArrayList;

public class DisJointSetUnionByRank {
	ArrayList<Integer> parent=new ArrayList<>();
	ArrayList<Integer> rank=new ArrayList<>();
	public DisJointSetUnionByRank(int V)
	{
		for(int i=0;i<V;i++)
		{
			rank.add(0);
			parent.add(i);
		}
	}
	public int findParent(int node)
	{
		if(node==parent.get(node))
			return node;
		int par=findParent(parent.get(node));
		parent.set(node, par);
		return parent.get(node);
	}
	public void unionByRank(int u,int v)
	{
		int uparent=findParent(u);
		int vparent=findParent(v);
		if(uparent==vparent)
			return;
		if(rank.get(vparent)>rank.get(uparent))
		{
			parent.set(uparent, vparent);
		}
		else if(rank.get(vparent)<rank.get(uparent))
		{
			parent.set(vparent, uparent);
		}
		else
		{
			parent.set(vparent, uparent);
			rank.set(uparent, rank.get(uparent)+1);
		}
	}
}
