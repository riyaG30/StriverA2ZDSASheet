package binarysearchhard;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int m=sc.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		double ans=median(arr,arr1);
		System.out.println(ans);
		sc.close();
	}

	private static double median(int[] arr, int[] arr1) {
		if(arr.length>arr1.length)
            return median(arr1,arr);
        int start=0,end=arr.length;
		while(start<=end)
		{
			int mid1=start + (end-start)/2;
			int mid2=(arr.length+arr1.length+1)/2 - mid1;
			
			int left1 = mid1==0 ? Integer.MIN_VALUE : arr[mid1-1];
			int left2 = mid2==0 ? Integer.MIN_VALUE : arr1[mid2-1];
			
			int right1 = mid1==arr.length ? Integer.MAX_VALUE : arr[mid1];
			int right2 = mid2==arr1.length ? Integer.MAX_VALUE : arr1[mid2];
			
			if(left1<=right2 && left2<=right1)
			{
				if((arr.length+arr1.length)%2==0)
				{
					return	(Math.max(left2, left1) + Math.min(right1, right2))/2.0;
				}
				return Math.max(left2, left1);
			}
			else if(left1>right2)
				end=mid1-1;
			else
				start=mid1+1;
		}
		return 0.0;
	}

}
