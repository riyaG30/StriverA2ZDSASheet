package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChange {
    static List<Integer> minPartition(int N)
    {
       List<Integer> ans=new ArrayList<>();
       int[] arr={1,2,5,10,20,50,100,200,500,2000};
       int j=arr.length-1;
       while(j>=0)
       {
           if(N>=arr[j])
           {
               ans.add(arr[j]);
               N-=arr[j];
           }
           else
                j--;
       }
       return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(minPartition(n));
		sc.close();
	}

}
