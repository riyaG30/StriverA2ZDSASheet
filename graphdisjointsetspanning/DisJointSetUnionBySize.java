package graphdisjointsetspanning;

import java.util.ArrayList;

public class DisJointSetUnionBySize {
	ArrayList<Integer> parent=new ArrayList<>();
	ArrayList<Integer> size=new ArrayList<>();
	public DisJointSetUnionBySize(int V)
	{
		for(int i=0;i<V;i++)
		{
			size.add(1);
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
	public void unionBySize(int u,int v)
	{
		int uparent=findParent(u);
		int vparent=findParent(v);
		if(uparent==vparent)
			return;
		if(size.get(vparent)>size.get(uparent))
		{
			parent.set(uparent, vparent);
			size.set(vparent, size.get(vparent) + size.get(uparent));
		}
		else
		{
			parent.set(vparent, uparent);
			size.set(uparent, size.get(vparent) + size.get(uparent));
		}
		
	}
}
