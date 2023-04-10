package bstproblems;

class Pair
{
    int min;
    int max;
    int size;
    public Pair(int min,int max,int size)
    {
        this.min=min;
        this.max=max;
        this.size=size;
    }
}
public class LargestBStInBT {
	static Pair largest(Node root)
    {
        if(root==null)
            return new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        Pair leftNode=largest(root.left);
        Pair rightNode=largest(root.right);
        if(leftNode.max<root.data && root.data < rightNode.min)
        {
            return new Pair(Math.min(leftNode.min,root.data),Math.max(rightNode.max,root.data),1+leftNode.size+rightNode.size);
        }
        return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(leftNode.size,rightNode.size));
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		System.out.println(largest(root).size);
	}

}
