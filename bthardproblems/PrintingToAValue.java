package bthardproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingToAValue {
	public static boolean find(Node A,int B ,ArrayList<Integer> ans)
    {
        if(A==null)
            return false;
        ans.add(A.data);
        if(A.data==B)
            return true;
        if(find(A.left,B,ans) || find(A.right,B,ans))
            return true;
        ans.remove(ans.size()-1);
        return false;
    }
    public static int[] solve(Node A, int B) {
        ArrayList<Integer> arr=new ArrayList<>();
        find(A,B,arr);
        if(arr.size()==0)
            return new int[]{};
        int[] ans=new int[arr.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(solve(root,new Scanner(System.in).nextInt()));
	}

}
