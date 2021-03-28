
public class BasicQueue<T> {
	T[] data;
	int front;
	int back;
	
	public BasicQueue() {
		this(1000);
	}

	public BasicQueue(int size) {
		data=(T[]) new Object[size];
		this.front=-1;
		this.back=-1;
	}
	public int size() {
		if(front==-1 && back==-1) {
			return 0;
		}
		else {
			
			return back-front+1;
		}
	}
	public void enQueue(T item) {
		if(back-front+1==100) {
			throw new IllegalStateException("Queue is full");
		}
		else if(front==-1 && back==-1) {
			front++;back++;
			data[back]=item;
		}
		else {
			data[back++]=item;
		}
	}
	
	public T deQueue() {
		T item=null;
		if(size()==0) {
			throw new IllegalStateException("Queue is Empty");
		}
		else if(front==back) {
			item=data[front];
			front=-1;
			back=-1;
		}
		else {
			item=data[front++];
		}
		return item;
	}
	
	public boolean search(T item) {
		boolean found=false;
		if(size()==0) {
			return found;
		}
		T temp;
		for(int i=front;i<back;i++) {
			temp=data[i];
			if(temp==item) {
				found=true;
				break;
			}
		}
		return found;
	}
	
	public T access(int position) {
		if(size()==0||position>size()) {
			throw new IllegalArgumentException("Position should not be greater than size of the Queue");
		}
		int i;
		int index=0;
		for(i=front;i<back;i++) {
			if(index==position) {
				break;
			}
			index++;
		}
		return data[i];
	}










}
