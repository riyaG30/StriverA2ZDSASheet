package maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErathosthenes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] prime=new boolean[n+1];
		Arrays.fill(prime,false);
		prime[1]=true;//0 based indexing
		for(int i=2;i*i<=n;i++)
		{
			for(int j=i*2;j<=n;j+=i)
			{
				prime[j]=true;
			}
		}
		System.out.println(Arrays.toString(prime));
		sc.close();
	}

}
