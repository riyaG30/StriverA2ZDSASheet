package llhardproblems;
class FlattenNode
{
	int data;
	FlattenNode next;
	FlattenNode bottom;
	public FlattenNode(int data)
	{
		this.data=data;
	}
}
public class FlattenALinkedList {
	
	 private static FlattenNode merge(FlattenNode head, FlattenNode mid) {
			FlattenNode temp=new FlattenNode(-1);
			FlattenNode tail=temp;
			while(head!=null && mid!=null)
			{
				if(head.data>mid.data)
				{
					tail.bottom=mid;
					tail=tail.bottom;
					mid=mid.bottom;
				}
				else
				{
					tail.bottom=head;
					tail=tail.bottom;
					head=head.bottom;
				}
			}
			while(head!=null)
			{
				tail.bottom=head;
				tail=tail.bottom;
				head=head.bottom;
			}
			while(mid!=null)
			{
				tail.bottom=mid;
				tail=tail.bottom;
				mid=mid.bottom;
			}
			return temp.bottom;
		}
	    FlattenNode flatten(FlattenNode root)
	    {
		    if(root==null || root.next==null)
		        return root;
		        
		   root.next=flatten(root.next);
		   return merge(root,root.next);
	    }
}
