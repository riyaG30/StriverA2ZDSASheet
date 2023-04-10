package arraysmedium;

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class TwoSumUsingOneArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		List<int[]> ls=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(target-arr[i]))
			{
				ls.add(new int[] {target-arr[i],arr[i]});
			}
			map.put(arr[i], i);
		}
		for(int[] i:ls)
		{
			System.out.println(Arrays.toString(i));
		}
		sc.close();
	}

}
