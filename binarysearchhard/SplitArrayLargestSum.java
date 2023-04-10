package binarysearchhard;

import java.util.Scanner;

public class SplitArrayLargestSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=split(arr,m);
		System.out.println(ans);
		sc.close();
	}

	private static int split(int[] arr, int m) {
		int start=0,end=0;
		for(int i:arr)
		{
			start=Math.max(start, i);
			end+=i;
		}
		while(start<end)
		{
			int sum=0;
			int piece=1;
			int mid=start + (end-start)/2;
			for(int i:arr)
			{
				if(sum + i > mid)
				{
					sum=i;
					piece++;
				}
				else
					sum+=i;
			}
			if(piece>m)
				start=mid+1;
			else
				end=mid;
		}
		return start;
	}
}
