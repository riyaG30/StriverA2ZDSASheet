package graphdisjointsetspanning;

import java.util.Arrays;

public class KrukshalsAlgorithm {
	static int spanningTree(int V, int E, int edges[][]){
		   Arrays.sort(edges,(a,b)->a[2]-b[2]);
		   int sum=0;
		   DisJointSetUnionBySize ds=new DisJointSetUnionBySize(V);
		   for(int i=0;i<E;i++)
		   {
		       int u=edges[i][0];
		       int v=edges[i][1];
		       if(ds.findParent(u)!=ds.findParent(v))
		       {
		           sum+=edges[i][2];
		           ds.unionBySize(u,v);
		       }
		   }
		   return sum;
		}
}
