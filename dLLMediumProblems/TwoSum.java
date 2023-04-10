package dLLMediumProblems;

import java.util.ArrayList;

public class TwoSum {
	public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node start=head;
        Node end=head;
        while(end.next!=null)
        {
            end=end.next;
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(start!=end)
        {
            int sum=start.data + end.data;
            if(sum==target)
            {
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(start.data);
                arr.add(end.data);
                ans.add(arr);
                //For repeating elements
                end=end.prev;
            }
            else if(sum<target)
                start=start.next;
            else
                end=end.prev;
        }
        return ans;
    }
public static void main(String[] args) {
	DoublyLinkedList sl=new DoublyLinkedList();
	sl.insertFirst(3);
	sl.insertFirst(2);
	sl.insertFirst(1);
	sl.insertLast(10);
	sl.insert(2,2);
	sl.display();
	System.out.println(findPairsWithGivenSum(5,sl.head));
    }
}
