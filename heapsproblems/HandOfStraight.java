package heapsproblems;

import java.util.Scanner;
import java.util.TreeMap;

public class HandOfStraight {
	static boolean isStraightHand(int N, int groupSize, int hand[]) {
        if(hand.length%groupSize!=0)
            return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<N;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(map.size()>0)
        {
            int key=map.firstKey();
            for(int i=key;i<key+groupSize;i++)
            {
                if(!map.containsKey(i))
                    return false;
                if(map.get(i)==1)
                    map.remove(i);
                else 
                    map.put(i,map.get(i)-1);
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(isStraightHand(n,k,arr));
		sc.close();

	}

}
