package graphtopo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CourseSchedule {
	static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++)
        {
            adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
        }
        int[] indegree=new int[n];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j:adj.get(i))
			{
				indegree[j]++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		int count=0;
		int[] ans=new int[n];
		int k=0;
		while(!q.isEmpty())
		{
			int temp=q.poll();
			ans[k++]=temp;
			count++;
			for(int j:adj.get(temp))
			{
				indegree[j]--;
				if(indegree[j]==0)
				{
					q.add(j);
				}
			}
		}
		if(count==n)
		    return ans;
		return new int[]{};
    }
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> arr=new ArrayList<>();
			arr.add(1);
			arr.add(0);
			adj.add(arr);
		}
		sc.close();
	}
}
