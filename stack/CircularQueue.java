package stack;

public class CircularQueue<T> {
	public int size;
	public int front;
	public int end;
	public T[] arr;
	@SuppressWarnings("unchecked")
	public CircularQueue()
	{
		this.size=0;
		front=0;
		end=0;
		arr=(T[]) new Object[5];
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void offer(T data)
	{
		if(size==arr.length)
		{
			resize();
		}
		end=end%arr.length;
		arr[end]=data;
		end++;
		size++;
	}
	@SuppressWarnings("unchecked")
	public void resize()
	{
		T[] arr1=arr;
		arr=(T[]) new Object[2*arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[(front+i)%arr.length];
		}
		end=arr1.length;
	}
	public T poll()
	{
		if(isEmpty())
		{
			return null;
		}
		front=front%arr.length;
		T value=arr[front];
		arr[front]=null;
		front++;
		size--;
		return value;
	}
	public T peek()
	{
		if(isEmpty())
			return null;
		return arr[front%arr.length];
	}
	public void display()
	{
		if(isEmpty())
			return;
		int a=front;
		do
		{
			a%=arr.length;
			if(arr[a]!=null)
				System.out.println(arr[a]);
			a++;
			
		}while(a!=end);
	}
	public static void main(String[] args) {
		CircularQueue<Integer> c=new CircularQueue<>();
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		c.offer(5);
		c.offer(6);
		
		System.out.println(c.peek());
		System.out.println();
		c.display();
		System.out.println();
		System.out.println(c.poll());
		System.out.println();
		
		c.display();

	}

}
