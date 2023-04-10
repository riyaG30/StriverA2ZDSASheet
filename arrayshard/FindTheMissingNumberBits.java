package arrayshard;

import java.util.Scanner;

public class FindTheMissingNumberBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=0;
		for(int i=1;i<=n;i++)
		{
			res^=i;
		}
		for(int i : arr)
		{
			res^=i;
		}
		res = res & -res; // -res =~(res-1) -res is the 2 complement of a number
		int x=0,y=0;
		for(int i:arr)
		{
			if((res&i)!=0)
				x^=i;
			else 
				y^=i;
		}
		for(int i=1;i<=n;i++)
		{
			if((res&i)!=0)
				x^=i;
			else 
				y^=i;
		}
		int count=0;
		for(int i:arr)
		{
			if(x==i)
				count++;
		}
		sc.close();
		if(count!=0)
		{
			System.out.println("The repeating number is "+x+" the missing number is "+y);
			return;
		}
		System.out.println("The repeating number is "+y+" the missing number is "+x);
		
		
	}

}
