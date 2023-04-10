package slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class FruitIntoBasket {
	public static int totalFruits(int[] fruits,int N) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //the size is 2 fruit[i] represent the type like 2,1 
        //we can pick only one fruit from any one tree
        int j=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2)
            {
                if(map.get(fruits[j])==1)
                    map.remove(fruits[j]);
                else
                    map.put(fruits[j],map.get(fruits[j])-1);
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(totalFruits(arr,n));
		sc.close();
	}

}
