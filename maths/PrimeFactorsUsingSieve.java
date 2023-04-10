package maths;

import java.util.*;

public class PrimeFactorsUsingSieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		 List<Integer> ans=new ArrayList<>();
	        boolean[] arr=new boolean[N+1];
	        Arrays.fill(arr,false);
	        for(int i=2;i*i<=N;i++)
	        {
	            for(int j=i*2;j<=N;j+=i)
	            {
	                arr[j]=true;
	            }
	        }
	        for(int i=2;i<=N;i++)
	        {
	            if(!arr[i] && N%i==0)
	                ans.add(i);
	        }
	        System.out.println(ans);
	        sc.close();
	}

}
