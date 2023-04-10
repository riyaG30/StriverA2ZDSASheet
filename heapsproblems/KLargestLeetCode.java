package heapsproblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestLeetCode {
	PriorityQueue<Integer> pq;
	final int k;
	public KLargestLeetCode(int k,int[] arr)
	{
		this.k=k;
		pq=new PriorityQueue<>();
		for(int i:arr)
		{
			pq.add(i);
			if(pq.size()>k)
			{
				pq.poll();
			}
		}
	}
	public int kFrequent(int val)
	{
		pq.add(val);
		if(pq.size()<k)
		{
			pq.poll();
		}
		return pq.peek();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		KLargestLeetCode kL=new KLargestLeetCode(sc.nextInt(),new int[] {4,5,6,2});
		System.out.println(kL.kFrequent(8));
		System.out.println(kL.kFrequent(10));
		sc.close();
	}

}
