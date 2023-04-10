package binarysearchhard;

import java.util.Scanner;

public class SmallestDivisor {
	public static int smallestDivisor(int[] nums, int m) {
	      int start=1;
	        int end=Integer.MIN_VALUE;
	        for(int i:nums)
	        {
	            end=Math.max(i,end);
	        }
	        while(start<end)
	        {
	            int mid=start + (end-start)/2;
	            int total=0;
	            for(int i:nums)
	            {
	                total+=((i+mid-1)/mid); //finding ceil
	            }
	            if(total>m)
	                start=mid+1;
	            else
	                end=mid;
	        }
	        return start;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=smallestDivisor(arr,m);
		System.out.println(ans);
		sc.close();
	}

}
