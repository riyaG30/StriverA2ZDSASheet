package binarysearchmedium;

import java.util.Scanner;

public class MatrixMedian {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int ans=findMedian(arr);
		System.out.println(ans);
		sc.close();
	}

	private static int findMedian(int[][] arr) {
		//In this we will be using binary search as the rows are in a sorted manner
		//We will take low=1 and high = 1e9
		//We will divide the range until the count of the number in the matrix is equal
		// That means if there are 4 elements towrads the left there has to be 4 elements towards the right as well
		int low=1,n=arr.length,m=arr[0].length;
		int high=(int)1e9;
		while(low<=high)
		{
			int mid=(low+high)/2;
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				count+=countOfMid(arr[i],mid);
				//here to get the number that are <= to the number we can implement ceil of a number as well
			}
			if(count<=(n * m)/2)
				low=mid+1;
			else
				high=mid-1;
		}
		return low;
	}

	private static int countOfMid(int[] arr, int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start + (end-start)/2;
			if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		return start;
	}
	
	

}
