package graphdisjointsetspanning;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostStonesRemoved {
	// if the stone in the same row or col then it is removed
	//We get the intuition that the stone - no. of connected component will result in answer
	int maxRemove(int[][] stones, int n) {
        int maxRow=0;
        int maxCol=0;
        //finding the dimension through the input
        for(int i=0;i<n;i++)
        {
            maxRow=Math.max(maxRow,stones[i][0]);
            maxCol=Math.max(maxCol,stones[i][1]);
        }
        //for storing to see the parents 
        //row is treated as 0 1 2 and col is treated as 3 4 5
        HashMap<Integer,Integer> map=new HashMap<>();
        //as we are considering all the rows and column hence + 2
        DisJointSetUnionBySize ds=new DisJointSetUnionBySize(maxRow+maxCol+2);
        for(int i=0;i<n;i++)
        {
            int row=stones[i][0];
            int col=stones[i][1] + maxRow + 1;
            ds.unionBySize(row,col);
            map.put(row,1);
            map.put(col,1);
        }
        int count=0;
        for(Entry<Integer, Integer> e:map.entrySet())
        {
            if(e.getKey()==ds.findParent(e.getKey()))
                count++;
        }
        return n-count;
    }
}
