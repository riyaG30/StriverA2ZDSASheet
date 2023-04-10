package recursionmedium;

import java.util.*;

public class CombinationSum3 {
	public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        combinationSum(k,n,new ArrayList<>(),ans,1);
        return ans;
     }
        public static void combinationSum(int k,int target,ArrayList<Integer> ans,  List<List<Integer>> ls,int index)
        {
           if(k==0)
           {
               if(target==0)
               {
                   ls.add(new ArrayList<>(ans));
               }
               return;
           }
           if(target<0)
                return;
           for(int i=index;i<=9;i++)
           {
               ans.add(i);
               combinationSum(k-1,target-i,ans,ls,i+1);
               ans.remove(ans.size()-1);
           }
        }
	public static void main(String[] args) {
		// We will we provided with a target and a number k
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int target=sc.nextInt();
		//The ans should contains atleast k numbers
		System.out.println(combinationSum3(k,target));
		sc.close();
	}
}
