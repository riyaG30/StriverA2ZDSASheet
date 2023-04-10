package btmediumproblems;

import java.util.ArrayList;

public class RightView {
	public static void rightView(Node root,ArrayList<Integer> ans,int k)
    {
        if(root==null)
            return;
        if(ans.size()==k)
            ans.add(root.data);

        rightView(root.right,ans,k+1);
        rightView(root.left,ans,k+1);
    }
    static ArrayList<Integer> rightView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(rightView(root));
	}
}
