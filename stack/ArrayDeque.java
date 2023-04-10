package stack;


public class ArrayDeque<T> {
	public int size;
	public int front;
	public int end;
	public T[] arr;
	@SuppressWarnings("unchecked")
	public ArrayDeque()
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
	public void addLast(T data)
	{
		if(size==arr.length)
			return;
		if(isEmpty())
		{
			arr[front]=data;
		}
		else
		{
			end=(end + 1 +arr.length) %arr.length;
			arr[end]=data;
		}
		size++;
	}
	public void addFirst(T data)
	{
		if(isEmpty())
		{
			arr[front]=data;
		}
		else
		{
			front=(front-1+arr.length)%arr.length;
			arr[front]=data;
		}
		size++;
	}
	public T removeFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		T value = arr[front];
		arr[front]=null;
		front=(front+1+arr.length)%arr.length;
		size--;
		return value;
	}
	public T removeLast()
	{
		if(isEmpty())
		{
			return null;
		}
		T value = arr[end];
		arr[end]=null;
		end=(end-1+arr.length)%arr.length;
		size--;
		return value;
	}
	public void display()
	{
		if(isEmpty())
			return;
		int a=front;
		do
		{
			if(arr[a]!=null)
				System.out.print(arr[a]);
			a++;
			a=a % arr.length;
		}while(a!=front);
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
		arr.addFirst(1);
		arr.addLast(2);
		arr.addLast(3);
		arr.addFirst(4);
		arr.addLast(9);
		
		arr.display();
		
		arr.removeFirst();
		arr.display();
		
		arr.removeLast();
		arr.display();
		
		System.out.println(arr.size());

	}

}
