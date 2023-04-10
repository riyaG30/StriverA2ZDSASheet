package binarysearchmedium;

import java.util.Scanner;

public class SearchInA2dMatrix {

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
		int key=sc.nextInt();
		int[] ans=binarysearch(arr,key);
		System.out.println(ans);
		sc.close();
	}

	private static int[] binarysearch(int[][] arr,int key) {
		// TODO Auto-generated method stub
		int start=0;
		int n=arr.length;
		int m=arr[0].length;
		int end=n*m-1;
		while(start<=end)
		{
			int mid=start + (end-start)/2;
			if(arr[mid/m][mid%m]==key)
				return new int[] {mid%m,mid/m};
			else if(arr[mid/m][mid%m]<key)
				start=mid+1;
			else
				end=mid-1;
		}
		return new int[] {-1,-1};
	}

}
