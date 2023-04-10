package heapsproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
	 public static ArrayList<Integer> kLargest(int arr[], int n, int k)
	    {
	        ArrayList<Integer> ans=new ArrayList<>();
	        PriorityQueue<Integer> pq=new PriorityQueue<>();
	        for(int i=0;i<k;i++)
	        {
	            pq.add(arr[i]);
	        }
	        for(int i=k;i<n;i++)
	        {
	            if(arr[i]>pq.peek())
	            {
	                pq.poll();
	                pq.add(arr[i]);
	            }
	        }
	        while(!pq.isEmpty())
	        {
	            ans.add(pq.poll());
	        }
	        Collections.reverse(ans);
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
		int k=sc.nextInt();
		System.out.println(kLargest(arr,n,k));
		sc.close();
	}

}
