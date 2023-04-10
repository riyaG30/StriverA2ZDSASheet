package slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithKDifferentIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(subarrayCount(arr,n,sc.nextInt()));
		sc.close();
	}
	static int count(int[] arr,int N,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int start=0;
        for(int i=0;i<N;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.keySet().size()>k)
            {
                if(map.get(arr[start])==1)
                    map.remove(arr[start]);
                else
                    map.put(arr[start],map.get(arr[start])-1);
                start++;
            }
            count+=(i-start+1);
        }
        return count;
    }
    static int subarrayCount(int arr[], int N, int k) {
        return count(arr,N,k) - count(arr,N,k-1);
    }

}
