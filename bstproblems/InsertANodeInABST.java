package bstproblems;

public class InsertANodeInABST {
	static Node insert(Node root, int Key) {
        Node current=root;
        while(current!=null)
        {
            if(current.data==Key)
                break;
            else if(current.data>Key)
            {
                if(current.left!=null)
                {
                    current=current.left;
                }
                else
                {
                    current.left=new Node(Key);
                    break;
                }
            }
            else
            {
                if(current.right!=null)
                {
                    current=current.right;
                }
                else
                {
                    current.right=new Node(Key);
                    break;
                }
            }
        }
        return root;
    }
	public static void main(String[] args) {
		CreateTree ct=new CreateTree();
		Node root=ct.create();
		root=insert(root,10);
		//You can print to check whether it is present or not
	}
}
