package stack;

public class QueueUsingArray<T> {
	T[] arr;
	int size;
	@SuppressWarnings("unchecked")
	public QueueUsingArray()
	{
		arr=(T[])new Object[5];
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	@SuppressWarnings("unchecked")
	public void resize()
	{
		T[] arr1=arr;
		arr=(T[]) new Object[arr1.length * 2];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
	}
	public void offer(T data)
	{
		if(size==arr.length)
		{
			resize();
		}
		arr[size++]=data;
	}
	public T poll()
	{
		if(size==0)
			return null;
		T data=arr[0];
		for(int i=1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[size-1]=null;
		size--;
		return data;
	}
	public static void main(String[] args) {
		QueueUsingArray<String> q=new QueueUsingArray<>();
		q.offer("Imran");
		q.offer("Alfred");
		q.offer("Ayaan");
		q.offer("Junaid");
		q.offer("Vaibhav");
		q.offer("Rohit");
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
