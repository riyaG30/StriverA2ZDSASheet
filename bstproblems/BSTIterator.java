package bstproblems;

import java.util.Stack;

public class BSTIterator {
	Stack<Node> s=new Stack<>();
	boolean flag;
	public BSTIterator(Node root,boolean flag)
	{
		this.flag=flag;
		pushAll(root);
	}
	public boolean hasNext()
	{
		return !(s.size()==0);
	}
	public int next()
	{
		Node temp=s.pop();
		if(flag)
			pushAll(temp.right);
		else
			pushAll(temp.left);
		return temp.data;
	}
	private void pushAll(Node root) {
		while(root!=null)
		{
			s.push(root);
			if(flag)
				root=root.left;
			else
				root=root.right;
		}
	}
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		BSTIterator bt=new BSTIterator(root,false);
		while(bt.hasNext())
		{
			System.out.println(bt.next());
		}
	}
	public int peek() {
		return s.peek().data;
	}
}
