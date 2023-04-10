package linkedList;


public class InsertDeleteANodeInLinkedListRecursively {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.insertFirst(3);
		sl.insertFirst(2);
		sl.insertFirst(1);
		sl.insertLast(10);
		sl.insert(9,2);
		sl.display();
		int data=4;
		insertRecursively(2,data,sl.head);
		sl.display();
		deleteRecursively(2,sl.head);
		sl.display();
	}
	// 0 based indexing
	public static Node1 insertRecursively(int index, int data, Node1 head) {
		if(index==0)
		{
			Node1 n=new Node1(data);
			n.next=head;
			return n;
		}
		head.next=insertRecursively(index-1,data,head.next);
		return head;
	}
	
	public static Node1 deleteRecursively(int index, Node1 head) {
		if(index==0)
		{
			return head.next;
		}
		head.next=deleteRecursively(index-1,head.next);
		return head;
	}

}
