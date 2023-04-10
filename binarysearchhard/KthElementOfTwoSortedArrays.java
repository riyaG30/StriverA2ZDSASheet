package binarysearchhard;

import java.util.Scanner;

public class KthElementOfTwoSortedArrays {

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
		int ans=kthElement(arr,arr1,4);
		System.out.println(ans);
		sc.close();
	}

	private static int kthElement(int[] arr, int[] arr1, int k) {
		if(arr.length>arr1.length)
			return kthElement(arr1,arr,k);
		int start=Math.max(0, k-arr1.length),end=Math.min(k, arr.length);
		while(start<=end)
		{
			int mid1=start + (end-start)/2;
			int mid2=k-mid1;
			
			int left1 = mid1==0 ? Integer.MIN_VALUE : arr[mid1-1];
			int left2 = mid2==0 ? Integer.MIN_VALUE : arr1[mid2-1];
			
			int right1 = mid1==arr.length ? Integer.MAX_VALUE : arr[mid1];
			int right2 = mid2==arr1.length ? Integer.MAX_VALUE : arr1[mid2];
			
			if(left1<=right2 && left2<=right1)
			{
				return Math.max(left1, left2);
			}
			else if(left1>right2)
				end=mid1-1;
			else
				start=mid1+1;
		}
		return -1;
	}

}
