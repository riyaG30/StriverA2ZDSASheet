package bthardproblems;

import java.util.ArrayList;

public class PrintingAllPaths {
	public static void path(Node root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            arr.add(root.data);
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.data);
        path(root.left,arr,ans);
        path(root.right,arr,ans);
        arr.remove(arr.size()-1);
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		 ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
	     path(root,new ArrayList<>(),ans);
	     System.out.println(ans);
	}

}
