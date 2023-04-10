package arrays;

import java.util.Scanner;

public class MaximumNumberOfRows1s {

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
		int max=maximumOnes(arr);
		System.out.println(max);
		sc.close();
	}

	private static int maximumOnes(int[][] arr) {
		int r=0;
		int c=arr[0].length-1;
		int row=-1;
		while(r<arr.length && c>=0)
		{
			if(arr[r][c]==1)
			{
				row=r;
				c--;
			}
			else
				r++;
		}
		return row;
	}

}
