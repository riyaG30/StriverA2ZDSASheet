package recursionmedium;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetSum1 {
	static void subset(ArrayList<Integer> arr,int index,ArrayList<Integer> ans,int sum)
    {
        if(index==arr.size())
        {
            ans.add(sum);
            return;
        }
        subset(arr,index+1,ans,sum+arr.get(index));
        subset(arr,index+1,ans,sum);
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<>();
        subset(arr,0,ans,0);
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println(subsetSums(arr,sc.nextInt()));
		sc.close();

	}

}
