package heapsproblems;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KFrequentElement {
	public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums)
       {
           map.put(i,map.getOrDefault(i,0)+1);
       }
       PriorityQueue<Integer> pq=new PriorityQueue<>((c1,c2)-> map.get(c2)-map.get(c1));
       int[] ans=new int[k];
       pq.addAll(map.keySet());
       if(pq.isEmpty())
           return new int[]{};
       int index=0;
       while(!pq.isEmpty() && index<k)
       {
           ans[index++]=pq.poll();
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
		System.out.println(topKFrequent(arr,sc.nextInt()));
		sc.close();

	}

}
