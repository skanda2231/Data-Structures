package inter;

public class BasicStack1<T> implements Basic<T>{
	T[] data;
	int top;

	public BasicStack1() {
		data = (T[]) new Object[100];
		top=-1;
	}
	
	public void push(T item) {
		if(top==99) {
			System.out.println("Stack is full");
		}
		data[++top]=item;
	}
	
	public T pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		T deleted=data[top--];
		return deleted;
	}
	
	public boolean search(T item) {
		boolean found=false;
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		T temp;
		for(int i=top;i>-1;i--) {
			temp=data[i];
			if(temp==item) {
				found=true;
				break;
			}
		}
		return found;
	}
	
	public T access(T item) {
		while(top>-1) {
		T temp;
		temp = pop();
			if(item.equals(temp)) {
				break;
			}
		}if(top==-1) {
			System.out.println("Couldn't find the specified item");
		}
		return item;
	}
	
	public int size() {
		return top+1;
	}

}
