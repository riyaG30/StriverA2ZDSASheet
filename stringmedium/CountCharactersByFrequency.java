package stringmedium;

import java.util.*;

class Pair
{
	char data;
	int count;
	public Pair(char d,int c)
	{
		data=d;
		count=c;
	}
}
public class CountCharactersByFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 HashMap<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<s.length();i++)
	        {
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	        }
	        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<>()
	        {
	            public int compare(Pair x,Pair y)
	            {
	                return y.count-x.count;
	            }
	        }); 
	        for(Map.Entry<Character,Integer> e:map.entrySet())
	        {
	            pq.add(new Pair(e.getKey(),e.getValue()));
	        }
	        String s1="";
	        while(!pq.isEmpty())
	        {
	            int count=pq.peek().count;
	            char data=pq.peek().data;
	            pq.poll();
	            while(count>0)
	            {
	                s1+=data;
	                count--;
	            }
	        }
	        System.out.println(s1);
	        sc.close();
	}

}
