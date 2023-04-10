package heapsproblems;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElementGFG {
	public static int[] kLargest(int[] arr,int k)
	{
		int[] ans=new int[arr.length];
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
			if(pq.size()<k)
				ans[index++]=-1;
			else
			{
				if(pq.size()>k)
					pq.poll();
				ans[index++]=pq.peek();
			}
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
		System.out.println(Arrays.toString(kLargest(arr,sc.nextInt())));
		sc.close();
	}

}
