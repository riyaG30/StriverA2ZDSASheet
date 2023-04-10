package stack;

public class ImplementStackUsingArrays<T> {
	T[] arr;
	int size;
	@SuppressWarnings("unchecked")
	public ImplementStackUsingArrays()
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
	public void push(T data)
	{
		if(size==arr.length)
		{
			resize();
		}
		arr[size++]=data;
	}
	public T pop()
	{
		if(size==0)
			return null;
		T data=arr[size-1];
		arr[size-1]=null;
		size--;
		return data;
	}
	public static void main(String[] args) {
		ImplementStackUsingArrays<String> st=new ImplementStackUsingArrays<>();
		st.push("Imran");
		st.push("Alfred");
		st.push("Ayaan");
		st.push("Junaid");
		st.push("Vaibhav");
		st.push("Rohit");
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
	}

}
