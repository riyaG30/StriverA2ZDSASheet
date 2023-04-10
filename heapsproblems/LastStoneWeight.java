package heapsproblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStoneWeight {
	static int stone(int arr[], int n) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            if(a==b)
            	continue;
            pq.add(a-b);
        }
        if(pq.isEmpty())
        	return -1;
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
		System.out.println(stone(arr,n));
		sc.close();
	}
}
