package arraysmedium;

import java.util.Scanner;

public class SetMatrixZero {

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
		boolean column=true;
		for(int i=0;i<n;i++)
		{
			if(arr[i][0]==0)
				column=true;
			for(int j=1;j<m;j++)
			{
				if(arr[i][j]==0)
				{
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=m-1;j>=1;j--)
			{
				if(arr[i][0]==0 || arr[0][j]==0)
					arr[i][j]=0;
			}
			if(column==false)
				arr[i][0]=0;
		}
		sc.close();
	}

}
