package binarysearchmedium;

import java.util.Scanner;

public class FindPeakElement {
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
		int[] ans=findPeak(arr);
		System.out.println(ans);
		sc.close();
	}
	public static int[] findPeak(int[][] arr)
	{
		int startrow=0;
		int endrow=arr.length-1;
		//In this case the peak element is the one who is greater then the elements above below and on the sides
		//to discard the side ones we will find the max in the row
		//Check for above and below
		//For 0 and last row the above and below are not valid respectively,this is the edge case that is to be considered.
		while(startrow<=endrow)
		{
			int midrow=startrow + (endrow-startrow)/2;
			int rowmax=Integer.MIN_VALUE;
			for(int i=0;i<arr[midrow].length;i++)
			{
				rowmax=Math.max(rowmax, arr[midrow][i]);
			}
			if(midrow==0)
			{
				if(arr[midrow][rowmax]>arr[midrow+1][rowmax])
					return new int[] {midrow,rowmax};
			}
			if(midrow==arr.length-1)
			{
				if(arr[midrow][rowmax]>arr[midrow-1][rowmax])
					return new int[] {midrow,rowmax};
			}
			if(arr[midrow][rowmax]>arr[midrow+1][rowmax] && arr[midrow][rowmax]>arr[midrow-1][rowmax])
				return new int[] {midrow,rowmax};
			else if(arr[midrow][rowmax]<arr[midrow+1][rowmax])
				startrow=midrow+1;
			else
				endrow=midrow-1;
				
		}
		return new int[] {-1,-1};
	}
}
