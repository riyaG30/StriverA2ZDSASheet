package linkedListMediumProblems;


public class AddTwoLinkedList {
	
	static Node1 addTwoLists(Node1 first, Node1 second){
		Node1 temp=new Node1(-1);
		Node1 temp1=temp;
        int carry=0;
        first=reverseList(first);
        second=reverseList(second);
        while(first!=null || second!=null || carry==1)
        {
            int sum=0;
            if(first!=null)
            {
                sum+=first.data;
                first=first.next;
            }
            if(second!=null)
            {
                sum+=second.data;
                second=second.next;
            }
            sum+=carry;
            carry=sum/10;
            Node1 n=new Node1(sum%10);
            temp1.next=n;
            temp1=temp1.next;
        }
        return reverseList(temp.next);
    }   
    static Node1 reverseList(Node1 head){
        if(head==null || head.next==null)
            return head;
        Node1 prev=null;
        Node1 current=head;
        Node1 next=current.next;
        while(current!=null)
        {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
                next=next.next;
        }
        return prev;
    }
	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(0);
		sl.insert(9,2);
		sl.display();
		SinglyLinkedList s2=new SinglyLinkedList();
		s2.insertFirst(3);
		s2.insertFirst(2);
		s2.insertFirst(1);
		s2.insertLast(1);
		s2.insert(9,2);
		s2.display();
		sl.head=addTwoLists(sl.head,s2.head);
		sl.display();
	}

}
