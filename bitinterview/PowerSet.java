package bitinterview;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> ans=new ArrayList<>();
		int m=(int)Math.pow(2, n);
		
		String s="abc";
		for(int i=0;i<m;i++)
		{
			String s1="";
			for(int j=0;j<n;j++)
			{
				if((i & (1<<j))!=0)
				{
					s1= s1+ s.charAt(j);
				}
			}
			if(!s1.isEmpty())
				ans.add(s1);
		}
		System.out.println(ans);
		sc.close();
	}

}
