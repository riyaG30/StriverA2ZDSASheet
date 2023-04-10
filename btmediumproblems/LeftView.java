package btmediumproblems;

import java.util.ArrayList;

public class LeftView {
	public static void leftView(Node root,ArrayList<Integer> ans,int k)
    {
        if(root==null)
            return;
        if(ans.size()==k)
            ans.add(root.data);
        leftView(root.left,ans,k+1);
        leftView(root.right,ans,k+1);
    }
    static ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        leftView(root,ans,0);
        return ans;
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(leftView(root));
	}
}
