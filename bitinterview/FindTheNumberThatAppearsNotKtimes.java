package bitinterview;

import java.util.Scanner;

public class FindTheNumberThatAppearsNotKtimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		sc.close();
		//All number appears k times. For instance   k=3
		int[] count=new int[32];
		for(int i=0;i<32;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&(1<<i))!=0)
					count[i]+=1;
			}
		}
		int res=0;
		for(int i=0;i<32;i++)
		{
			res += (count[i]%k) * (1<<i);
		}
		//If you only print result it would give wrong output
		//It would give 4 as 2 is appearing 2 times
		
		res=res / (n%k);
		System.out.println(res);
	}

}
