package inter;

public interface Basic<T> {
	void push(T t);
	T pop();
	boolean search(T t);
	T access(T t);
	int size();

}
