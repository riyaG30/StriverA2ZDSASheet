package graphdisjointsetspanning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMerge {
	 public List<List<String>> accountsMerge(List<List<String>> accounts) {
	        List<List<String>> ans=new ArrayList<>();
	        HashMap<String,Integer> map=new HashMap<>();
	        DisJointSetUnionBySize ds=new DisJointSetUnionBySize(accounts.size());
	        int n=accounts.size();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=1;j<accounts.get(i).size();j++)
	            {
	                String s=accounts.get(i).get(j);
	                if(map.containsKey(s))
	                {
	                    ds.unionBySize(i,map.get(s));
	                }
	                else
	                {
	                    map.put(s,i);
	                }
	            }
	        }
	        @SuppressWarnings("unchecked")
			ArrayList<String>[] merged=new ArrayList[n];
	        for(int i=0;i<n;i++)
	        {
	            merged[i]=new ArrayList<String>();
	        }
	        for(Map.Entry<String,Integer> e:map.entrySet())
	        {
	            int node=ds.findParent(e.getValue());
	            String s=e.getKey();
	            merged[node].add(s);
	        }
	        for(int i=0;i<merged.length;i++)
	        {
	            ArrayList<String> temp=new ArrayList<>();
	            //this particular word was not considered only the subtype were put into the map
	            if(merged[i].size()==0)
	                continue;
	            temp.add(accounts.get(i).get(0));
	            Collections.sort(merged[i]);
	            for(String s:merged[i])
	            {
	                temp.add(s);
	            }
	            ans.add(temp);
	        }
	        return ans;
	    }
}
