package heapsproblems;

import java.util.PriorityQueue;
import java.util.Scanner;

class Rank
{
    int data;
    int index;
    public Rank(int d,int i)
    {
        data=d;
        index=i;
    }
}
public class ReplaceElementByCorrespondingRanks {
	static int[] replaceWithRank(int arr[], int N) {
        int[] ans=new int[N];
        PriorityQueue<Rank> pq=new PriorityQueue<>((x,y)->x.data==y.data? 0 : x.data-y.data);
        for(int i=0;i<N;i++)
        {
              pq.add(new Rank(arr[i],i));
        }
        int i=0;
        int prev=-1;
        while(!pq.isEmpty())
        {
            int index=pq.peek().index;
            int element=pq.peek().data;
            if(element==prev)
                ans[index]=i;
            else
                ans[index]=++i;
            prev=element;
            pq.poll();
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(replaceWithRank(arr,n));
		sc.close();

	}

}
