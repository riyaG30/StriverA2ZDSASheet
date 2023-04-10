package graphtopo;

import java.util.*;

public class AlienDictionary {
	public static String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int j=0;j<dict.length-1;j++)
        {
            String s=dict[j];
            String p=dict[j+1];
            int len=Math.min(s.length(),p.length());
            for(int i=0;i<len;i++)
            {
                if(s.charAt(i)!=p.charAt(i))
                {
                    adj.get(s.charAt(i)-'a').add(p.charAt(i)-'a');
                    break;
                }
            }
        }
        int[] indegree=new int[K];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<K;i++)
		{
			for(int j:adj.get(i))
			{
				indegree[j]++;
			}
		}
		for(int i=0;i<K;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		String s="";
		while(!q.isEmpty())
		{
			int temp=q.poll();
			s+=(char)(temp+'a');
			for(int j:adj.get(temp))
			{
				indegree[j]--;
				if(indegree[j]==0)
				{
					q.add(j);
				}
			}
		}
		return s;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] word=new String[n];
		for(int i=0;i<n;i++)
		{
			word[i]=sc.next();
		}
		System.out.println(findOrder(word,n,sc.nextInt()));
		sc.close();
	}

}
