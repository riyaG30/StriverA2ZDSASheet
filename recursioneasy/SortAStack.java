package recursioneasy;

import java.util.Stack;

public class SortAStack {
	static void reverse1(Stack<Integer> s,int temp)
    {
        if(s.isEmpty() || temp>s.peek())
        {
            s.push(temp);
            return;
        }
        int x=s.pop();
        reverse1(s,temp);
        s.push(x);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int temp=s.pop();
        reverse(s);
        reverse1(s,temp);
    }
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(9);
		s.push(4);
		s.push(10);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}
}
