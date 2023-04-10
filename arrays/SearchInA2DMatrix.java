package arrays;

import java.util.Scanner;

public class SearchInA2DMatrix {

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
		int target=sc.nextInt();
		boolean present=searchIndex(arr,target);
		System.out.println(present);
		sc.close();

	}

	private static boolean searchIndex(int[][] arr,int target) {
		int r=0;
		int c=arr[0].length-1;
		while(r<arr.length && c>=0)
		{
			if(arr[r][c]==target)
			{
				return true;
			}
			else if(arr[r][c]>target)
				c--;
			else
				r++;
		}
		return false;
	}

}
