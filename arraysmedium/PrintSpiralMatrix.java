package arraysmedium;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSpiralMatrix {

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
		ArrayList<Integer> ans=spiral(arr);
		System.out.println(ans);
		sc.close();
	}

	private static ArrayList<Integer> spiral(int[][] arr) {
		ArrayList<Integer> ans=new ArrayList<>();
		int rs=0,re=arr.length-1,cs=0,ce=arr[0].length-1;
		while(rs<=re && cs<=ce)
		{
			for(int i=cs;i<=ce;i++)
			{
				ans.add(arr[rs][i]);
			}
			rs+=1;
			for(int i=rs;i<=re;i++)
			{
				ans.add(arr[i][ce]);
			}
			ce-=1;
			for(int i=ce;i>=cs;i--)
			{
				ans.add(arr[re][i]);
			}
			re-=1;
			for(int i=re;i>=rs;i--)
			{
				ans.add(arr[i][cs]);
			}
			cs+=1;
		}
		return ans;
	}
}
