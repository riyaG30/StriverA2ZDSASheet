package linkedListMediumProblems;

public class DeleteDuplicateInALinkedList {
		public static void main(String[] args) {
			SinglyLinkedList sl=new SinglyLinkedList();
			sl.insertFirst(0);
			sl.insertFirst(0);
			sl.insertFirst(0);
			sl.insertFirst(1);
			sl.insertFirst(1);
			sl.display();
			sl.head=duplicates(sl.head);
			sl.display();
		}

		private static Node1 duplicates(Node1 head) {
			Node1 temp=head;
			while(temp!=null)
			{
				if(temp==head && temp.next!=null && temp.data==temp.next.data)
				{
					head=head.next;
					temp=head;
				}
				else
				{
					if(temp.next!=null && temp.data==temp.next.data)
					{
						temp.next=temp.next.next;
					}
					else
					{
						temp=temp.next;
					}
				}
			}
			return head;
		}
}
