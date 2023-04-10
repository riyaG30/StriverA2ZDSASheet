package stackproblems;

import java.util.*;

public class AsteroidCollision {
	public static int[] asteroidCollision( int[] arr,int N) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<N;i++)
        {
            if(s.isEmpty() || arr[i]>0)
                s.push(arr[i]);
            else
            {
                while(true)
                {
                    if(s.peek()<0)
                    {
                        s.push(arr[i]);
                        break;
                    }
                    else if(s.peek()==-arr[i])
                    {
                        s.pop();
                        break;
                    }
                    else if(s.peek()>-arr[i])
                    {
                        break;
                    }
                    else
                    {
                        s.pop();
                        if(s.isEmpty())
                        {
                            s.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] ans=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=s.pop();
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(asteroidCollision(arr,n));
		sc.close();
	}

}
