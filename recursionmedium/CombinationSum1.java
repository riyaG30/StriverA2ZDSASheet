package recursionmedium;

import java.util.*;

public class CombinationSum1 {
	public static void getCombinations(int[] candidates,ArrayList<Integer> arr,int target,List<List<Integer>> ls,int index)
    {
        if(index==candidates.length)
            return;
        if(target==0)
        {
            ls.add(new ArrayList<>(arr));
            return;
        }
        if(candidates[index]<=target)
        {
            arr.add(candidates[index]);
            getCombinations(candidates,arr,target-candidates[index],ls,index);
            arr.remove(arr.size()-1);
        }
        
        getCombinations(candidates,arr,target,ls,index+1);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ls=new ArrayList<>();
        getCombinations(candidates,new ArrayList<>(),target,ls,0);
        return ls;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(combinationSum(arr,sc.nextInt()));
		sc.close();
	}

}
