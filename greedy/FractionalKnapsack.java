package greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MyComparator implements Comparator<Pair>
{
    public int compare(Pair x,Pair y)
    {
        if(x.ratio<y.ratio)
            return 1;
        else if(x.ratio==y.ratio)
            return 0;
        return -1;
    }
}
class Pair
{
    int values;
    int weight;
    double ratio;
    public Pair(int v,int w,double r)
    {
        values=v;
        weight=w;
        ratio=r;
    }
    
}
class Item
{
	int weight;
	int value;
	public Item(int w,int v)
	{
		weight=w;
		value=v;
	}
}
public class FractionalKnapsack{
	static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>(new MyComparator());
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(arr[i].value,arr[i].weight,1.0 * arr[i].value/arr[i].weight));
        }
        double cost=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.remove();
            if(W>=p.weight)
            {
                W-=p.weight;
                cost +=(p.values);
            }
            else
            {
                cost += (W * p.ratio);
                break;
            }
        }
        return cost;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Item[] knapsack=new Item[n];
		for(int i=0;i<n;i++)
		{
			int weight=sc.nextInt();
			int value=sc.nextInt();
			knapsack[i]=new Item(weight,value);
		}
		System.out.println(fractionalKnapsack(sc.nextInt(),knapsack,n));
		sc.close();
	}

}
