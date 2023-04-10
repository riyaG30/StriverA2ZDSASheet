package arrayshard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		List<List<Integer>> ans=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> prev=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			List<Integer> ls=new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					ls.add(1);
				}
				else
				{
					ls.add(prev.get(j-1)+prev.get(j));
				}
			}
			ans.add(ls);
			prev=ls;
		}
		System.out.println(ans);
		sc.close();
	}

}
