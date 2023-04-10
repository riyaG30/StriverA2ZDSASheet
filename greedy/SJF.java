package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class SJF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] burst=new int[n];
		for(int i=0;i<n;i++)
		{
			burst[i]=sc.nextInt();
		}
		Arrays.sort(burst);
		//So wait time for  first will be 0 ,second will be value of bt[i] third will be bt[i]+bt[i-1];
		int ans=0;
		//find waiting time;
		int time=0;
		for(int i=0;i<n;i++)
		{
			ans+=time;
			time+=burst[i];
		}
		System.out.println(ans/n);
		sc.close();
	}

}
