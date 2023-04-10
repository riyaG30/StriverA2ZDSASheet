package recursionmedium;

import java.util.*;
import java.util.Scanner;

public class CombinationSum2 {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length==0)
            return new ArrayList<>();
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        combinations(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    public static void combinations(int[] arr,int index,int sum,ArrayList<Integer> ans,List<List<Integer>> ls)
    {
        if(index==arr.length)
        {
            if(sum==0)
            {
                ls.add(new ArrayList<>(ans));
            }
            return;
        }
        if(sum==0)
        {
            ls.add(new ArrayList<>(ans));
            return;
        }
        if(arr[index]<=sum)
        {
            ans.add(arr[index]);
            combinations(arr,index+1,sum-arr[index],ans,ls);
            ans.remove(ans.size()-1);
        }
        //for checking duplicates
        while(index<arr.length-1 && arr[index]==arr[index+1])
            index++;
        combinations(arr,index+1,sum,ans,ls);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(combinationSum2(arr,sc.nextInt()));
		sc.close();
	}
}
