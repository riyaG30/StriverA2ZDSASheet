package arraysmedium;

import java.util.Arrays;
import java.util.Scanner;

public class RotateBy90 {

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
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<m;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		int startrow=0,endrow=n-1;
		while(startrow<endrow)
		{
			for(int i=0;i<m;i++)
			{
				int temp=arr[startrow][i];
				arr[startrow][i]=arr[endrow][i];
				arr[endrow][i]=temp;
			}
			startrow++;
			endrow--;
		}
		for(int[] i:arr)
		{
			System.out.println(Arrays.toString(i));
		}
		sc.close();
	}

}
