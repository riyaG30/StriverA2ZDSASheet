package heapsproblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimalCostOfRopes {
	static int minCost(int arr[], int n) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int cost=0;
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            cost+=a+b;
            pq.add(a+b);
        }
        return cost;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		sc.close();
	}

}
