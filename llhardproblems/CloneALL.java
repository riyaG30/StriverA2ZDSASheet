package llhardproblems;

class Node2
{
	int data;
	Node2 next;
	Node2 arb;
	public Node2(int d)
	{
		data=d;
	}
}
public class CloneALL {
	Node2 copyList(Node2 head) {
        if(head==null)
            return head;
        Node2 temp=head;
        while(temp!=null)
        {
            Node2 current=temp.next;
            temp.next=new Node2(temp.data);
            temp.next.next=current;
            temp=current;
        }
           temp=head;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                temp.next.arb=(temp.arb!=null)?temp.arb.next : null;
            }
            if(temp.next!=null)
            temp=temp.next.next;
        }
        Node2 orginal=head;
        Node2 copy=head.next;
        Node2 temp1=copy;
        while(orginal !=null)
        {
            if(orginal.next!=null)
                orginal.next=orginal.next.next;
            if(copy.next!=null)
                copy.next=copy.next.next;
            orginal=orginal.next;
            copy=copy.next;
        }
        return temp1;
    }
}
