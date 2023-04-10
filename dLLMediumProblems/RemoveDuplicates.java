package dLLMediumProblems;

public class RemoveDuplicates {
	static Node removeDuplicates(Node head){
        Node temp=head;
        while(temp!=null)
        {
            if(temp==head && temp.next!=null &&  temp.data==temp.next.data)
                {
                    head=head.next;
                    if(head!=null)
                        head.prev=null;
                    temp=head;
                }
            else
            {
                if(temp.next!=null && temp.data==temp.next.data)
                {
                    temp.next=temp.next.next;
                    if(temp.next!=null)
                        temp.next.prev=temp;
                }
                else
                    temp=temp.next;
            }
        }
        return head;
        
    }
	public static void main(String[] args) {
		DoublyLinkedList sl=new DoublyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(2,2);
		sl.display();
		sl.head=removeDuplicates(sl.head);
		sl.display();
	}  
}
