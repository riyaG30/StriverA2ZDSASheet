package bstproblems;

public class TwoSumInABST {
	public static int isPairPresent(Node root, int target)
    {
       BSTIterator l=new BSTIterator(root,true);
       BSTIterator r=new BSTIterator(root,false);
       while(l.peek()<r.peek())
       {
           int sum=l.peek() + r.peek();
           if(sum==target)
                return 1;
            if(sum>target)
            {
                r.next();
            }
            else
                l.next();
       }
       return 0;
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(isPairPresent(root,4));
	}

}
