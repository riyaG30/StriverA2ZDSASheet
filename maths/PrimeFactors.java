package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactors {
	public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n!=i && n%i==0)
               return false;
        }
        return true;
    }
    public static int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(N==0 || N==1)
            return new int[]{};
        for(int i=2;i<=N/2;i++)
        {
            if(isPrime(i) && N%i==0)
            {
                ans.add(i);
            }
        }
        if(isPrime(N))
            ans.add(N);
        int[] arr=new int[ans.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans.get(i);
        }
            
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ans=AllPrimeFactors(n);
		System.out.println(Arrays.toString(ans));
		sc.close();
	}

}
