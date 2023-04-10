package recursionmedium;

import java.util.*;

public class Subset2 {
	public static void print(int[] arr,ArrayList<Integer> ans,List<List<Integer>> ls,int index)
    {
        if(index==arr.length)
        {
            ls.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[index]);
        print(arr,ans,ls,index+1);
        ans.remove(ans.size()-1);
        while(index<arr.length-1 && arr[index]==arr[index+1])
            index++;
        print(arr,ans,ls,index+1);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls=new ArrayList<>();
        print(nums,new ArrayList<>(),ls,0);
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
		System.out.println(subsetsWithDup(arr));
		sc.close();

	}

}
