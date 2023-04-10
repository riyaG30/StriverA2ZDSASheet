package binarysearchhard;

import java.util.Scanner;

public class KthMissingPositiveNumber {
	 public static int findKthPositive(int[] a, int k) {
	        // if(arr[arr.length-1]==arr.length)
	        //     return arr[arr.length-1] + k;
	        if(k<a[0])
	            return k;
	        int low=0;
	        int high=a.length-1;
	        while(low<=high)
	        {
	            int mid=low + (high-low)/2;
	            int missing = a[mid]-(mid+1);
	            if(missing<k)
	                low=mid+1;
	            else
	                high=mid-1;
	        }
	        if(high==-1)
	            return k;
	        return a[high] + k - (a[high]-(high+1));
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
			int ans=findKthPositive(arr,m);
			System.out.println(ans);
			sc.close();
		}

}
